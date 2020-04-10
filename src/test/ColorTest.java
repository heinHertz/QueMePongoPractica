package test;

import main.java.Categoria;
import main.java.Color;
import main.java.Material;
import main.java.Prenda;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ColorTest {

    @Test
    public void colorSecundarioTest(){

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );

        prenda.setMaterial(new Material("denim"));

        prenda.setColorSecundario(Color.AMARILLO);

        assertEquals( prenda.getColorSecundario(), Color.AMARILLO);

    }

    // este Test espera un Excepcion de Tipo Runtime

    @Test(expected = RuntimeException.class)

    public void tieneColorSecundarioNull() throws RuntimeException {

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );

     

        assertEquals( prenda.getColorSecundario(), Color.AMARILLO);

    }






}
