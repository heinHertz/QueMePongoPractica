package test;

import main.java.Categoria;
import main.java.prenda.Color;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrendaTest {

    @Test
    public void testPrenda(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

//        Prenda prenda = new Prenda( "pantalon", Categoria.INFERIOR );
//
//        prenda.setMaterial(Material.DENIM);

        assertEquals( pantalon.getColorPrincipal(), Color.AMARILLO);

    }


}
