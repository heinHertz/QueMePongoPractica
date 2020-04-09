package main.java;

public class Prenda {

    String tipoPrenda;

    Categoria categoria;

    Material material;

    public Prenda( String tipoPrenda, Categoria categoria){

        this.tipoPrenda = tipoPrenda;

        this.categoria = categoria;

    }


    public String getTipoPrenda() {
        return tipoPrenda;
    }

    public Categoria getCategoria() {
        return categoria;
    }
}
