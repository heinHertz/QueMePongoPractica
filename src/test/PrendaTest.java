package test;

import main.java.Categoria;
import main.java.prenda.Color;
import main.java.prenda.Material;
import main.java.prenda.Prenda;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrendaTest {

    @Test
    public void testPrendaColorPrincipalIgual(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        assertEquals( pantalon.getColorPrincipal(), Color.NEGRO);

    }

    @Test
    public void testPrendaDistintosDeberiaFallar(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        assertNotEquals( pantalon.getColorPrincipal(), Color.BLANCO;

    }

    //  TEST  QUE ESPERA UNA EXCEPTION
    @Test(expected = RuntimeException.class)
    public void testPrendaColorPrincipalNullSaltaException(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER,null,  Color.BLANCO    );

    }



}
