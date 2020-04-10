package main.java;

import main.java.utiles.ColorException;

public class Prenda {

    String tipoPrenda;

    Categoria categoria;

    Material material;

    Color colorPrincipal;

    Color colorSecundario;

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


    public void setMaterial(Material material){

        this.material = material;

    }

    public void setColor(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Color getColorPrincipal() {
        return colorPrincipal;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColorSecundario() {
        if(this.colorSecundario.equals(null) )
            throw new ColorException("Color NUll, debe asignar Un Color Secundario");
        else
            return colorSecundario;
    }

    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }


}



