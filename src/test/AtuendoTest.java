package test;

import main.java.atuendo.Atuendo;
import main.java.prenda.*;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AtuendoTest {

    @Test
    public void testTipoPrenda(){

        TipoPrenda remera = new TipoPrenda("remera" , Categoria.SUPERIOR  );


    }


    @Test
    public void testAtuendo() {

        Atuendo atuendo = new Atuendo();

        Prenda sueter = new Prenda( "sueter",Categoria.SUPERIOR, Material.LANA, Color.AMARILLO, Color.ROJO );
        Prenda zapatos = new Prenda( "zapatos", Categoria.CALZADO, Material.PLASTICO, Color.NEGRO, null    );

        atuendo.agregarPrenda(sueter);

        atuendo.agregarPrenda(zapatos);

        assertEquals(atuendo.containsTipoPrendas("sueter"),true);

      //  assertEquals(atuendo.cuantasTieneTipoPrendas("sueter"),1);
        //assertEquals(atuendo.getCategoria("sueter"),1);

     //  assertEquals(atuendo.getCategoria("sueter"),Categoria.SUPERIOR);
    }


    @Test
    public void testPrenda(){

        Atuendo atuendo = new Atuendo();


        Prenda zapatos = new Prenda( "zapatos", Categoria.CALZADO, Material.PLASTICO, Color.NEGRO, null    );

        atuendo.agregarPrenda(zapatos);


        assertEquals(  atuendo.getCategoria("zapatos"), Categoria.CALZADO     );

        // assertEquals(  atuendo.getCategoria("zapatos"), Categoria.CALZADO     );

    }

    @Test
    public void testZapatosDeberiaFallar(){

        Prenda zapatos = new Prenda( "zapatos", Categoria.CALZADO, Material.PLASTICO, Color.NEGRO, null    );

        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(zapatos);

        assertNotEquals(  atuendo.getCategoria("zapatos"), Categoria.SUPERIOR     );


    }

    @Test
    public void testCalzado(){


        Prenda calzado = new Prenda( "zapatillas", Categoria.ACCESORIOS, Material.PLASTICO, Color.NEGRO, Color.BLANCO);

        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(calzado);

        assertEquals(atuendo.getCategoria("zapatillas"), Categoria.ACCESORIOS);



    }



}