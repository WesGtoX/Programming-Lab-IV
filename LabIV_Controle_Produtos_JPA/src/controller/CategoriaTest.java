package controller;

import model.Categoria;

/**
 *
 * @author wesley
 */
public class CategoriaTest {
    
    public static void main(String[] args) {
        
      // INSERIR
      // Categoria cat = new Categoria(null, "Medicina");
       new CategoriaDAO().salvar(new Categoria(null, "Medicina"));
       new CategoriaDAO().salvar(new Categoria(null, "Farmacia"));
       new CategoriaDAO().salvar(new Categoria(null, "Computador"));
       new CategoriaDAO().salvar(new Categoria(null, "Mouse"));
       new CategoriaDAO().salvar(new Categoria(null, "Teclado"));
       
       // ATUALIZAR
        Categoria cat = new CategoriaDAO().get(1); // pesquisar
        System.out.println(cat);
        cat.setNome("Eletrônicos");
        new CategoriaDAO().salvar(cat);
        System.out.println(cat);
       
        
        // Listar todas as categorias
        for(Categoria c : new CategoriaDAO().lista()){
            System.out.println(c);
        }
        
        System.out.println("TOTAL = " + new CategoriaDAO().contar());
    }
}
