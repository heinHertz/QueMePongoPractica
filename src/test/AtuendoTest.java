package test;

import main.java.Atuendo;
import main.java.Categoria;
import main.java.Prenda;
import org.junit.Test;

//import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertEquals;


public class AtuendoTest {

    @Test
    public void testAtuendo() {


        Atuendo atuendo = new Atuendo();

        assertEquals(10,10);


    }


    @Test
    public void testPrenda(){

        Prenda zapatos = new Prenda("zapatos", Categoria.CALZADO   );

        Prenda sueter = new Prenda( "sueter",Categoria.SUPERIOR );

        Atuendo atuendo = new Atuendo();

        atuendo.agregarPrenda(zapatos);

        atuendo.agregarPrenda(sueter);




    }
}