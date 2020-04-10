package test;

import main.java.Categoria;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import org.junit.Test;

public class PrendaTest {

    @Test
    public void testPrenda(){

        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );

        prenda.setMaterial(Material.DENIM);

    }


}
