package main.java.prenda;

import main.java.utiles.CategoriaException;

public class TipoPrenda {

    Categoria categoria;


    public TipoPrenda(Categoria categoria){

        this.setCategoria(categoria);

    }

    public void setCategoria(Categoria categoria) {
        if(categoria.equals(null))
            throw new CategoriaException("Categoria NUll, debe asignar Una Categoria correcta");
        else
            this.categoria = categoria;
    }



}
