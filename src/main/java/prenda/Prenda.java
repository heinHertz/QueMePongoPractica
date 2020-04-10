package main.java.prenda;

import main.java.Categoria;
import main.java.prenda.Color;
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

        this.colorPrincipal = colorPrincipal;

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

    public void setColor(Color colorPrincipal) {
        this.colorPrincipal = colorPrincipal;
    }

    public Color getColorSecundario() {
        return colorSecundario;
    }

    public Material getMaterial() {
        return material;
    }

    public Color getColorPrincipal() {
        if(this.colorPrincipal.equals(null) )
            throw new ColorException("Color NUll, debe asignar Un Color Primario");
        else
            return colorPrincipal;
    }




    public void setColorSecundario(Color colorSecundario) {
        this.colorSecundario = colorSecundario;
    }


}



