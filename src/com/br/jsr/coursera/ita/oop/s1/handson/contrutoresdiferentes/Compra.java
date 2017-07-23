package com.br.jsr.coursera.ita.oop.s1.handson.contrutoresdiferentes;

public class Compra {
	
	int valorTotal;
	int numeroParcelas;
	
	// a vista
	public Compra(int valor) {
		this.valorTotal = valor;
		this.numeroParcelas = 1;
	}
	
	// parcelado
	public Compra(int qtdParcelas, int valorParcela) {
		this.numeroParcelas = qtdParcelas;
		this.valorTotal = valorParcela * qtdParcelas;
	}
	
	public int getValorTotal() {
		return this.valorTotal;
	}
	
	public int getNumeroParcelas() {
		return this.numeroParcelas;
	}
	
	public int getValorParcela() {
		return this.valorTotal / this.numeroParcelas;
	}
	

}
