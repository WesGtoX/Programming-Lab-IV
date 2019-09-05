package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Categoria;

/*
    DAO = Data Acces Object
    Objeto de acesso a dados utilizado para concentrar todas
    as operações relativas à uma tabela SGBD
*/

/**
 *
 * @author wesley
 */
public class CategoriaDAO {
    
    private final Connection con;     // realizar a conexão com os SGBD
    private PreparedStatement cmd;    // enviar instruções SQL para o SGBD
    
    public CategoriaDAO() {
        // estabelecer uma conexão com SGBD
        this.con = Conexao.conectar();
    }
    
    public int inserir(Categoria c) {
        try {
            String SQL = "INSERT INTO tb_categoria (nome) VALUES (?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
//            cmd.setInt(1, c.getId());
            cmd.setString(1, c.getNome());
            
            if (cmd.executeUpdate() > 0) {
                // Descobrir o ID que foi gerado
                ResultSet rs = cmd.getGeneratedKeys();
                
                if (rs.next()) {
                    return rs.getInt(1);    // Retorna o ID
                } else {
                    return -1; // ID não foi gerado
                }
            } else {
                return -1;
            }
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public int atualizar(Categoria c) {
        try {
            String SQL = "UPDATE tb_categoria SET id=?, nome=? WHERE id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, c.getId());
            cmd.setString(2, c.getNome());
            cmd.setInt(3, c.getId());
            
            return (cmd.executeUpdate() > 0) ? c.getId() : -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public int deletar(int id) {
        try {
            String SQL = "DELETE FROM tb_categoria WHERE id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, id);
            
            return (cmd.executeUpdate() > 0) ? id : -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Categoria> listar() {
        try {
            String SQL = "SELECT * FROM tb_categoria ORDER BY id";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Categoria> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Categoria(
                        rs.getInt("id"),
                        rs.getString("nome")
                    )
                );
            }
            return lista;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }

    public List<Categoria> pesquisarPorNome(String nome) {
        try {
            String SQL = "SELECT * FROM tb_categoria WHERE nome ILIKE ? ORDER BY nome";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%" + nome + "%");
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Categoria> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Categoria(
                        rs.getInt("id"),
                        rs.getString("nome")
                    )
                );
            }
            return lista;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
        
    public List<Categoria> pesquisarPorId(int id) {
        try {
            String SQL = "SELECT * FROM tb_categoria WHERE id=?";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
//            cmd.setString(1,"%" + id + "%");
            cmd.setInt(1, id);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Categoria> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Categoria(
                        rs.getInt("id"),
                        rs.getString("nome")
                    )
                );
            }
            return lista;
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            Conexao.desconectar(con);
        }
    }
}
