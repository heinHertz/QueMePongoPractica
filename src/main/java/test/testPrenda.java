package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import prenda.Categoria;
import prenda.Color;
import prenda.Material;
import prenda.Prenda;
import prenda.TipoPrenda;

public class testPrenda {
	
	@Test
	public void testPrenda1(){
		
		
		Prenda prenda = new Prenda( new TipoPrenda(Categoria.SUPERIOR), Categoria.SUPERIOR, Material.LANA, Color.AZUL, Color.BLANCO );
		
		assertEquals( prenda.getCategoria().equals(Categoria.SUPERIOR), true);
		
		
	}
	
	@Test(expected=Exception.class)
	public void testMaterialNulo(){
		
		Prenda prenda = new Prenda( new TipoPrenda(Categoria.SUPERIOR),Categoria.SUPERIOR, null, Color.AZUL, Color.BLANCO );
		
	}
	
	@Test //(expected=Exception.class)
	public void testPrendaConTodasLasCategorias (){
		
		Prenda prenda = new Prenda( new TipoPrenda(Categoria.SUPERIOR),Categoria.SUPERIOR, null, Color.AZUL, Color.BLANCO );
		
		assertEquals( prenda.getCategoria().equals(Categoria.SUPERIOR), true);
		
		
		
	}
	

}
