package main.java;

public class Prenda {

    String tipoPrenda;

    Categoria categoria;

    Material material;

    Color colorPrincipal;

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
}



