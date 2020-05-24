package atuendo;


import prenda.*;

import excepciones.*; 

import java.util.ArrayList;

import java.util.List;


public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){

        if(esPrendaConCategoriaValida(prendaNueva))
            prendas.add(prendaNueva);
        else
            throw new CategoriaException("Debe ingresar al Atuendo una prenda Cuya Categoria esté Disponible");


    }

    public List<Prenda> getPrendas() {   return prendas;    }

    public boolean esPrendaConCategoriaValida(Prenda prendaNueva ){

        return !prendas.stream().anyMatch( p -> p.getCategoria().equals(prendaNueva.getCategoria()) );

    }

    public boolean tieneTodasLasCategorias(){

      //  if( this.cantidadCategorias() == 4 ) return true; else return  false;
        
        return (this.cantidadCategorias() == 4);

    }

    public long cantidadCategorias(){

        return  (long)prendas.stream()
                .filter( p-> p.getCategoria().equals(Categoria.INFERIOR)
                ||  p.getCategoria().equals(Categoria.SUPERIOR)
                ||  p.getCategoria().equals(Categoria.CALZADO)
                 ||  p.getCategoria().equals(Categoria.ACCESORIOS) )
                .count();

    }



}
