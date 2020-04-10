package main.java.prenda;

import main.java.utiles.ColorException;

public class Prenda {

    String tipoPrenda;

    Categoria categoria;

    Material material;

    Color colorPrincipal;

    Color colorSecundario;

    public Prenda( String tipoPrenda, Categoria categoria, Material material, Color colorPrincipal, Color colorSecundario){

        this.tipoPrenda = tipoPrenda;

        this.categoria = categoria;

        this.material = material;

        this.setColorPrincipal( colorPrincipal);

        this.colorSecundario = colorSecundario;


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

    public Color getColorPrincipal() {
        return this.colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public void setColorPrincipal(Color colorPrincipal) {
        if(colorPrincipal.equals(null) )
            throw new ColorException("Color NUll, debe asignar Un Color Primario");
        else
             this.colorPrincipal = colorPrincipal;
    }




    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }


}



