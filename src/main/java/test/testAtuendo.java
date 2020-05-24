package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import atuendo.*;

import prenda.*;

public class testAtuendo {
	
	
	@Test 
	public void rechazaPrendaNOTieneTodasLasCategorias (){
		
		Atuendo atuendo = new Atuendo();
		
		Prenda remera = new Prenda( new TipoPrenda(Categoria.SUPERIOR),Categoria.SUPERIOR, Material.LANA, Color.AZUL, Color.BLANCO );
		
		atuendo.agregarPrenda(remera);
				
		assertEquals( atuendo.tieneTodasLasCategorias()  , false);
		
	}
	
	
	@Test 
	public void aceptaPrendaTieneTodasLasCategorias (){
		
		Atuendo atuendo = new Atuendo();
		
		Prenda remera = new Prenda( new TipoPrenda(Categoria.SUPERIOR),Categoria.SUPERIOR, Material.LANA, Color.AZUL, Color.BLANCO );

		Prenda zapatillas = new Prenda( new TipoPrenda(Categoria.CALZADO),Categoria.CALZADO, Material.LANA, Color.AZUL, Color.BLANCO );

		Prenda pantalon = new Prenda( new TipoPrenda(Categoria.INFERIOR),Categoria.INFERIOR, Material.LANA, Color.AZUL, Color.BLANCO );

		Prenda relog = new Prenda( new TipoPrenda(Categoria.ACCESORIOS),Categoria.ACCESORIOS, Material.PLASTICO, Color.NEGRO, Color.AZUL );
		
		atuendo.agregarPrenda(remera);
		
		atuendo.agregarPrenda(zapatillas);
		
		atuendo.agregarPrenda(pantalon);
		
		atuendo.agregarPrenda(relog);
			
		
		
				
		assertEquals( atuendo.tieneTodasLasCategorias()  , true);
		
	}

}
