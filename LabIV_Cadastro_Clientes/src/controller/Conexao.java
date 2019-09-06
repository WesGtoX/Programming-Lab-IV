package controller;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author wesley
 */
public class Conexao {
    private static final String SERVER_URL = "127.0.0.1";
    private static final String SERVER_PORT = "5432";
    private static final String SERVER_USER = "wesley";
    private static final String SERVER_PASSWORD = "";
    private static final String SERVER_DATABSE = "controle_produtos";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                    "jdbc:postgresql://" + SERVER_URL + ":" + SERVER_PORT + "/" + SERVER_DATABSE, 
                    SERVER_USER, SERVER_PASSWORD
            );
        } catch (Exception e) {
            System.out.println("ERRO: " + e.getMessage());
            return null;
        }
    }
    
    public static void desconectar(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            
        }
    }
    
    public static void main(String[] args) {
        // Teste de CONEXÃO com o banco de dados
        Connection con = conectar();
        if(con != null) {
            System.out.println("Conexão realizada com sucesso!");
        }
    }
}
