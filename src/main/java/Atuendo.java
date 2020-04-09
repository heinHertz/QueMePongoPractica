package main.java;

import java.util.HashMap;
import java.util.List;
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

        //prendas.add(prendaNueva);

        prendas.put(prendaNueva.getTipoPrenda(), prendaNueva.getCategoria() );

    }



}
