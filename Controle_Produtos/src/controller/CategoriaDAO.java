package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
    
    public List<Categoria> listar() {
        try {
            String SQL = "SELECT * FROM tb_categoria ORDER BY nome";
            
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
}
