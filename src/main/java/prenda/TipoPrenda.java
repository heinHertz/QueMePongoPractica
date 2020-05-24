package prenda;

import java.util.Objects;


public class TipoPrenda {

    Categoria categoria;


    public TipoPrenda( Categoria categoria){

      

        this.setCategoria(categoria);

    }

    public Categoria getCategoria() {
        return categoria;
    }

 //   public String getNombrePrenda(){ return nombrePrenda; }

    public void setCategoria(Categoria categoria) {
     
        this.categoria = Objects.requireNonNull(categoria, "no debe Ingresar Categoria Nula");
    }




}
