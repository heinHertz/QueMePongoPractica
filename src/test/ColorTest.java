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

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );

        prenda.setMaterial( Material.ALGODON);

        prenda.setColorSecundario(Color.AMARILLO);

        assertEquals( prenda.getColorSecundario(), Color.AMARILLO);

    }

    // este Test espera una Excepcion de Tipo Runtime

    @Test(expected = RuntimeException.class)

    public void tieneColorSecundarioNull() throws RuntimeException {

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );



        assertEquals( prenda.getColorSecundario(), Color.AMARILLO);

    }






}
