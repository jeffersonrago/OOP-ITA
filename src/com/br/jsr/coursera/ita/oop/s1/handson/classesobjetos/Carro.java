package com.br.jsr.coursera.ita.oop.s1.handson.classesobjetos;

public  class Carro {
	int potencia;
	int velocidade;
	String nome;
	
	void acelerar() {
		velocidade += potencia;
	}

	void frear() {
		velocidade = velocidade / 2;
	}
	
	int getVelocidade() {
		return velocidade;
	}

	void imprimir() {
		System.out.println("O carro "+nome+" est� a velocidade "+getVelocidade()+" km/h");
	}
	
}
