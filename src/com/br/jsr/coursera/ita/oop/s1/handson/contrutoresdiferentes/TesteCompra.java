package com.br.jsr.coursera.ita.oop.s1.handson.contrutoresdiferentes;

import org.junit.Assert;
import org.junit.Test;

public class TesteCompra {

	
	@Test
	public void compraAVista(){
		Compra c = new Compra(500);
		Assert.assertEquals(1, c.getNumeroParcelas());
		Assert.assertEquals(500, c.getValorTotal());
		Assert.assertEquals(500, c.getValorParcela());
	}
	
	@Test
	public void compraParcelado(){
		Compra c = new Compra(4,250);
		Assert.assertEquals(4, c.getNumeroParcelas());
		Assert.assertEquals(1000, c.getValorTotal());
		Assert.assertEquals(250, c.getValorParcela());
	}
	
}
