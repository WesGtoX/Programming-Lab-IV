package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Cliente;

/**
 *
 * @author wesley
 */
public class ClienteDAO {

    private final Connection con;     // realizar a conexão com os SGBD
    private PreparedStatement cmd;    // enviar instruções SQL para o SGBD
    
    public ClienteDAO() {
        // estabelecer uma conexão com SGBD
        this.con = Conexao.conectar();
    }
    
    public int inserir(Cliente cli) {
        try {
            String SQL = "INSERT INTO tb_cliente (nome,telefone,email,ativo) VALUES (?,?,?,?)";
            
            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
            cmd.setString(1, cli.getNome());
            cmd.setString(2, cli.getTelefone());
            cmd.setString(3, cli.getEmail());
            cmd.setBoolean(4, cli.isAtivo());
            
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
