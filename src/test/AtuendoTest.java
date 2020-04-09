package test;

import main.java.Atuendo;
import main.java.Categoria;
import main.java.Prenda;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AtuendoTest {

    @Test
    public void testAtuendo() {

        Atuendo atuendo = new Atuendo();

        Prenda sueter = new Prenda( "sueter",Categoria.SUPERIOR );

        atuendo.agregarPrenda(sueter);

        assertEquals(atuendo.getCategoria("sueter"),Categoria.SUPERIOR);
    }


    @Test
    public void testPrenda(){

        Prenda zapatos = new Prenda("zapatos", Categoria.CALZADO   );



        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(zapatos);



        assertEquals(  atuendo.getCategoria("zapatos"), Categoria.CALZADO     );

    }

    @Test
    public void testPrendaDeberiaFallar(){

        Prenda zapatos = new Prenda("zapatos", Categoria.CALZADO   );

        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(zapatos);

        assertNotEquals(  atuendo.getCategoria("zapatos"), Categoria.SUPERIOR     );


    }

    @Test
    public void testCalzado(){

        Prenda calzado = new Prenda( "anteojos", Categoria.ACCESORIOS);

        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(calzado);

        assertEquals(atuendo.getCategoria("anteojos"), Categoria.ACCESORIOS);



    }



}