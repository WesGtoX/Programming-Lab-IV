package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
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
            String SQL = "INSERT INTO tb_usuario (login,senha,ativo) VALUES (?,?,?)";
            
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
}
