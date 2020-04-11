package main.java.atuendo;

import main.java.prenda.Categoria;
import main.java.prenda.Color;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import main.java.utiles.CategoriaException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){

        if(tieneCategoriaValida(prendaNueva))
            prendas.add(prendaNueva);
        else
            throw new CategoriaException("Debe ingresar al Atuendo una prenda Cuya Categoria esté Disponible");


    }

    public List<Prenda> getPrendas() {        return prendas;    }

    public boolean tieneCategoriaValida(Prenda prendaNueva ){

        return !prendas.stream().anyMatch( p -> p.getCategoria().equals(prendaNueva.getCategoria()) );

    }

/*
    public Prenda getCategoria(String nombreTipoPrenda ){

        return    prendas.contains(Categoria.INFERIOR)
          //      .filter( p -> p.getTipoPrenda().getNombrePrenda().contains(nombreTipoPrenda))
             //   .

    }

    public long cuantasTieneTipoPrendas(String string ){

        long conteo = prendas.stream()
                .filter( p -> p.getTipoPrenda().contains(string) )
                .count();

        return conteo;
    }



    public boolean containsCategoria(){

        return !prendas.stream().anyMatch( p -> p.getCategoria().equals(null) );

    }

    public boolean containsColor(Color color){

        return prendas.stream().anyMatch( p -> p.getColorPrimario().equals(color));

    }



*/

//    public void tienePrendasValidas(Prenda prenda){
//
//        if(prenda.getColorPrimario())
//
//
//
//    }

}
