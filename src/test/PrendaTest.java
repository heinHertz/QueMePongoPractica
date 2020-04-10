package test;

import main.java.prenda.Categoria;
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

        Prenda pantalon2 = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO);

        assertEquals(  pantalon.equals( pantalon2) ,true );
    }

    @Test
    public void testPrendaColorPrincipalDiferentes(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        Prenda pantalon2 = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.AMARILLO,Color.BLANCO);

        assertNotEquals(  pantalon.equals( pantalon2) ,true );
    }
    @Test
    public void testPrendaDistintosDeberiaFallar(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        assertNotEquals( pantalon.getColorPrimario(), Color.BLANCO);

    }

    //  TEST  QUE ESPERA UNA EXCEPTION
    @Test(expected = RuntimeException.class)
    public void testPrendaColorPrincipalNullSaltaException(){

        Prenda pantalon = new Prenda( "pantalon", Categoria.INFERIOR, Material.POLIESTER, null,  null    );

    }



}
