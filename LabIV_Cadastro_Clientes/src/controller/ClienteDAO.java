package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
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

    public int atualizar(Cliente cli) {
        try {
            String SQL = "UPDATE tb_cliente SET nome=?, telefone=?, email=?, ativo=? WHERE id=?";
            
            cmd = con.prepareStatement(SQL);
            cmd.setString(1, cli.getNome());
            cmd.setString(2, cli.getTelefone());
            cmd.setString(3, cli.getEmail());
            cmd.setBoolean(4, cli.isAtivo());
            
            return (cmd.executeUpdate() > 0) ? cli.getId() : -1;
            
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return -1;
        } finally {
            Conexao.desconectar(con);
        }
    }
    
    public List<Cliente> listar() {
        try {
            String SQL = "SELECT * FROM tb_cliente ORDER BY id";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Cliente> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Cliente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("telefone"),
                        rs.getString("email"),
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

    public List<Cliente> pesquisarPorNome(String nome) {
        try {
            String SQL = "SELECT * FROM tb_cliente WHERE nome ILIKE ? ORDER BY nome";
            
            // Analisar sinstaticamente a instrução SQL
            cmd = con.prepareStatement(SQL);
            cmd.setString(1,"%" + nome + "%");
            
            // Executar a instrução
            ResultSet rs = cmd.executeQuery();
            
            List<Cliente> lista = new ArrayList<>();
            while(rs.next()) {
                lista.add(
                    new Cliente(
                        rs.getInt("id"),
                        rs.getString("nome"),
                        rs.getString("telefone"),
                        rs.getString("email"),
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
