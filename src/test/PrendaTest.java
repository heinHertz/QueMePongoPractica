package test;

import main.java.Categoria;
import main.java.Material;
import main.java.Prenda;
import org.junit.Test;

public class PrendaTest {

    @Test
    public void testPrenda(){

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );

        prenda.setMaterial(new Material("denim"));

        



    }





}
