package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Produto;

/**
 *
 * @author wesley
 */
public class ProdutoDAO {
    
    private final Connection con;     // realizar a conexão com os SGBD
    private PreparedStatement cmd;    // enviar instruções SQL para o SGBD
    
    public ProdutoDAO() {
        // estabelecer uma conexão com SGBD
        this.con = Conexao.conectar();
    }
    
    public int inserir(Produto p) {
        try {
            String SQL = "INSERT INTO tb_produto (id_categoria, nome, valorunitario) VALUES (?,?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setInt(1, p.getId_categoria());
            cmd.setString(2, p.getNome());
            cmd.setDouble(3, p.getValorunitario());
            
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
    
    public int atualizar(Produto p) {
        try {
            String SQL = "UPDATE tb_produto SET id_categoria=?, nome=?, valorunitario=? WHERE id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setInt(1, p.getId_categoria());
            cmd.setString(2, p.getNome());
            cmd.setDouble(3, p.getValorunitario());
            cmd.setDouble(4, p.getId());
            
            return (cmd.executeUpdate() > 0) ? p.getId() : -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public int deletar(int id) {
        try {
            String SQL = "DELETE FROM tb_produto WHERE id=?";
            
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
    
    public List<Produto> listar() {
        try {
            String SQL = "SELECT * FROM tb_produto ORDER BY id";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Produto> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Produto(
                        rs.getInt("id"),
                        rs.getInt("id_categoria"),
                        rs.getString("nome"),
                        rs.getDouble("valorunitario")
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
    
    public List<Produto> pesquisarPorNome(String nome) {
        try {
            String SQL = "SELECT * FROM tb_produto WHERE nome ILIKE ? ORDER BY nome";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%" + nome + "%");
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Produto> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Produto(
                        rs.getInt("id"),
                        rs.getInt("id_categoria"),
                        rs.getString("nome"),
                        rs.getDouble("valorunitario")
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
    
    public List<Produto> pesquisarPorId(int id) {
        try {
            String SQL = "SELECT * FROM tb_produto WHERE id=?";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
//            cmd.setString(1,"%" + id + "%");
            cmd.setInt(1, id);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Produto> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Produto(
                        rs.getInt("id"),
                        rs.getInt("id_categoria"),
                        rs.getString("nome"),
                        rs.getDouble("valorunitario")
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

