package test;

import main.java.Categoria;
import main.java.prenda.Color;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ColorTest {

    @Test
    public void colorSecundarioTest(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        assertEquals( pantalon.getColorSecundario(), Color.BLANCO);

    }

    @Test
    public void colorSecundarioTest2(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO, null    );

        assertEquals( pantalon.getColorSecundario(), null);

    }



    // este Test espera una Excepcion de Tipo Runtime en caso de que no tenga color principal asignado salta la Exception

    @Test(expected = RuntimeException.class)

    public void tieneColorPrimarioiNull() throws RuntimeException {

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, null, Color.BLANCO    );

        assertEquals( pantalon.getColorPrincipal(), Color.AMARILLO);

    }






}
