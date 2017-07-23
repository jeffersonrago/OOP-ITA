package com.br.jsr.coursera.ita.oop.s1.handson.classesobjetos;

public class Principal {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		c1.potencia = 10;
		c1.nome = "Corsel";
		c1.velocidade = 0;
		
		Carro c2 = new Carro();
		c2.potencia = 10;
		c2.nome = "Carango";
		c2.velocidade = 0;
		
		Carro c3 = new Carro();
		c3.potencia = 10;
		c3.nome = "Corsel";
		c3.velocidade = 0;
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.frear();
		
		c2.acelerar();
		c2.acelerar();
		
		c1.imprimir();
		c2.imprimir();

		System.out.println("Imprimindo o c3");
		c3.imprimir();
	}
}
