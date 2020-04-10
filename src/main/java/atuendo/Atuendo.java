package main.java.atuendo;

import main.java.prenda.Categoria;
import main.java.prenda.Prenda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Atuendo {

    List<Prenda> prendas = new ArrayList<Prenda>();

    public void agregarPrenda( Prenda prendaNueva){


        prendas.add(prendaNueva);

       // prendas.put(prendaNueva.getTipoPrenda(), prendaNueva.getCategoria() );

    }

    public List<Prenda> getPrendas() {

        return prendas;

    }

    public long getCategoria(String string ){

        long conteo = prendas.stream()
                .filter( p -> p.getTipoPrenda().contains(string) )
                .count();
        return conteo;
    }

    public long cuantasTieneTipoPrendas(String string ){

        long conteo = prendas.stream()
                .filter( p -> p.getTipoPrenda().contains(string) )
                .count();

        return conteo;
    }

    public boolean containsTipoPrendas(String string ){

        return prendas.stream().anyMatch( p -> p.getTipoPrenda().contains(string) );
              //  .filter( p -> p.getTipoPrenda().contains(string) )
                //.count();




       // return conteo;
    }

}
