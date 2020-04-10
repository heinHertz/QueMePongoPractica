package main.java.atuendo;

import main.java.Categoria;
import main.java.prenda.Prenda;

import java.util.HashMap;
import java.util.Map;

public class Atuendo {

    //List <Prenda> prendas;
    Map<String, Categoria> prendas = new HashMap<String, Categoria>();

   // Map<String, Categoria> prendas ;

    public double sumar(int a){

        int i = 100 / a;
        return i;



    }

    public void func(int alfa) {

    System.out.println( sumar(alfa)  );


    }

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
