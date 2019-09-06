package model;

/*
    MODELO de dados utilizado para realizar o
    mapeamento entre SGBD e a aplicação.

    Tabela tb_produto <==> Classe Produto
*/

/**
 *
 * @author wesley
 */
public class Produto {
    
    private int id;
    private int id_categoria;
    private String nome;
    private double valorunitario;
    
    public Produto() {
        
    }

    public Produto(int id, int id_categoria, String nome, double valorunitario) {
        this.id = id;
        this.id_categoria = id_categoria;
        this.nome = nome;
        this.valorunitario = valorunitario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorunitario() {
        return valorunitario;
    }

    public void setValorunitario(double valorunitario) {
        this.valorunitario = valorunitario;
    }

    @Override
    public String toString() {
        return nome;
    }   
}
