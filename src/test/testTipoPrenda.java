package test;

import main.java.atuendo.Atuendo;
import main.java.prenda.Categoria;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import main.java.prenda.TipoPrenda;
import org.junit.Test;

public class testTipoPrenda {

    @Test
    public void testTipoPrenda(){

        TipoPrenda tipo = new TipoPrenda( "remera", Categoria.SUPERIOR );

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, null,  null    );


        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda();

    }


}
