package main.java.atuendo;

import main.java.Categoria;
import main.java.prenda.Prenda;

import java.util.HashMap;
import java.util.Map;

public class Atuendo {

    Map<String, Categoria> prendas = new HashMap<String, Categoria>();

    public void agregarPrenda( Prenda prendaNueva){

        prendas.put(prendaNueva.getTipoPrenda(), prendaNueva.getCategoria() );

    }

    public Map<String, Categoria> getPrendas() {

        return prendas;

    }

    public Categoria getCategoria(String string ){

        return this.prendas.get(string);

    }


}
