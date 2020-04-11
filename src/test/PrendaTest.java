package test;

import main.java.prenda.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class PrendaTest {

    public TipoPrenda remera = new TipoPrenda( "remera", Categoria.SUPERIOR );
    public TipoPrenda pantalon = new TipoPrenda( "pantalon", Categoria.INFERIOR );


    @Test(expected = RuntimeException.class)
    public void testPrendaCategoriaNULL(){

        Prenda pantalon1 = new Prenda( pantalon, null, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );


    }


    @Test
    public void testPrendaColorPrincipalIgual(){

        Prenda pantalon1 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        Prenda pantalon2 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO);

        assertEquals(  pantalon1.equals( pantalon2) ,true );
    }

    @Test
    public void testPrendaColorPrincipalDiferentes(){

        Prenda pantalon1 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,Color.BLANCO    );

        Prenda pantalon2 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.AMARILLO,Color.BLANCO);

        assertNotEquals(  pantalon1.equals( pantalon2) ,true );
    }
    @Test
    public void testPrendaDistintosDeberiaFallar(){

        Prenda pantalon1 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, Color.NEGRO,null   );

        assertNotEquals( pantalon1.getColorPrimario(), Color.BLANCO);

    }

    //  TEST  QUE ESPERA UNA EXCEPTION
    @Test(expected = RuntimeException.class)
    public void testPrendaColorPrincipalNullSaltaException(){

        Prenda pantalon1 = new Prenda( pantalon, Categoria.INFERIOR, Material.POLIESTER, null,  null    );

    }



}
