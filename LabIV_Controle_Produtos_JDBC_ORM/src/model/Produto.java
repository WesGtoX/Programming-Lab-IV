package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


/**
 *
 * @author wesley
 */
@Entity
@Table(name="tb_produto")
public class Produto implements Serializable{
    
    @Id
    @SequenceGenerator(name="tb_produto_id_seq",
            sequenceName = "tb_produto_id_seq", allocationSize = 1
    )
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "tb_produto_id_seq")
    @Column(name="id")
    private Long id;
    
    @OneToOne
    @JoinColumn(name="id_categoria")
    private Categoria categoria;
    
    @Column(name="nome", length = 60)
    private String nome;
    
    @Column(name="valorunitario")
    private double valorunitario;
    
    public Produto() {
        
    }

    public Produto(Long id, Categoria categoria, String nome, double valorunitario) {
        this.id = id;
        this.categoria = categoria;
        this.nome = nome;
        this.valorunitario = valorunitario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
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
    
    
}
