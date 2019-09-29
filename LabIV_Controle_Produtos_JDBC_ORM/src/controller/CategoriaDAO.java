package controller;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
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
    
    private final EntityManagerFactory emf;
    private final EntityManager em;
    
    public CategoriaDAO() {
        this.emf = Persistence.createEntityManagerFactory("ControlePU");
        this.em = emf.createEntityManager();
    }
    
    public List<Categoria> listar() {
        try {
            Query q = em.createQuery("SELECT c FROM Categoria c ORDER BY c.nome");
            return q.getResultList();
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
    
    public Categoria pesquisarPorId(int id) {
        try {
            return em.find(Categoria.class, new Long(id));
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        } finally {
            em.close();
            emf.close();
        }
    }
    
//    public int inserir(Categoria c) {
//        try {
//            String SQL = "INSERT INTO tb_categoria (nome) VALUES (?)";
//            
//            cmd = con.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
////            cmd.setInt(1, c.getId());
//            cmd.setString(1, c.getNome());
//            
//            if (cmd.executeUpdate() > 0) {
//                // Descobrir o ID que foi gerado
//                ResultSet rs = cmd.getGeneratedKeys();
//                
//                if (rs.next()) {
//                    return rs.getInt(1);    // Retorna o ID
//                } else {
//                    return -1; // ID não foi gerado
//                }
//            } else {
//                return -1;
//            }
//            
//        } catch (Exception e) {
//            System.out.println("ERRO: " + e.getMessage());
//            return -1;
//        } finally {
//            Conexao.desconectar(con);
//        }
//    }
//    
//    public int atualizar(Categoria c) {
//        try {
//            String SQL = "UPDATE tb_categoria SET id=?, nome=? WHERE id=?";
//            
//            cmd = con.prepareStatement(SQL);
//            cmd.setInt(1, c.getId());
//            cmd.setString(2, c.getNome());
//            cmd.setInt(3, c.getId());
//            
//            return (cmd.executeUpdate() > 0) ? c.getId() : -1;
//            
//        } catch (Exception e) {
//            System.out.println("ERRO: " + e.getMessage());
//            return -1;
//        } finally {
//            Conexao.desconectar(con);
//        }
//    }
//    
//    public int deletar(int id) {
//        try {
//            String SQL = "DELETE FROM tb_categoria WHERE id=?";
//            
//            cmd = con.prepareStatement(SQL);
//            cmd.setInt(1, id);
//            
//            return (cmd.executeUpdate() > 0) ? id : -1;
//            
//        } catch (Exception e) {
//            System.out.println("ERRO: " + e.getMessage());
//            return -1;
//        } finally {
//            Conexao.desconectar(con);
//        }
//    }
//    
//    public List<Categoria> pesquisarPorNome(String nome) {
//        try {
//            String SQL = "SELECT * FROM tb_categoria WHERE nome ILIKE ? ORDER BY nome";
//            
//            // Analisar sinstaticamente a instrução SQL
//            cmd = con.prepareStatement(SQL);
//            cmd.setString(1,"%" + nome + "%");
//            
//            // Executar a instrução
//            ResultSet rs = cmd.executeQuery();
//            
//            List<Categoria> lista = new ArrayList<>();
//            while(rs.next()) {
//                lista.add(
//                    new Categoria(
//                        rs.getInt("id"),
//                        rs.getString("nome")
//                    )
//                );
//            }
//            return lista;
//        } catch (Exception e) {
//            System.out.println("ERRO: " + e.getMessage());
//            return null;
//        } finally {
//            Conexao.desconectar(con);
//        }
//    };
}
