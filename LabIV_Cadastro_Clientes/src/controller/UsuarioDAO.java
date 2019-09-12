package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Usuario;

/**
 *
 * @author wesley
 */
public class UsuarioDAO {
    
    private final Connection con;     // realizar a conexão com os SGBD
    private PreparedStatement cmd;    // enviar instruções SQL para o SGBD
    
    public UsuarioDAO() {
        // estabelecer uma conexão com SGBD
        this.con = Conexao.conectar();
    }
    
    public int inserir(Usuario user) {
        try {
            String SQL = "INSERT INTO tb_usuario (login,senha,ativo) VALUES (?,MD5(?),?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, user.getLogin());
            cmd.setString(2, user.getSenha());
            cmd.setBoolean(3, user.isAtivo());
            
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
    
    public int atualizar(Usuario user) {
        try {
            String SQL = "UPDATE tb_usuario SET login=?, senha=MD5(?), ativo=? WHERE id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, user.getLogin());
            cmd.setString(2, user.getSenha());
            cmd.setBoolean(3, user.isAtivo());
            
            return (cmd.executeUpdate() > 0) ? user.getId() : -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Usuario> listar() {
        try {
            String SQL = "SELECT * FROM tb_usuario ORDER BY id";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Usuario> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Usuario(
                        rs.getInt("id"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getBoolean("ativo")
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

    public List<Usuario> pesquisarPorLogin(String login) {
        try {
            String SQL = "SELECT * FROM tb_usuario WHERE login ILIKE ? ORDER BY login";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%" + login + "%");
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Usuario> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Usuario(
                        rs.getInt("id"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getBoolean("ativo")
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
