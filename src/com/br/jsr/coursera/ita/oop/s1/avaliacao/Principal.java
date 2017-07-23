package com.br.jsr.coursera.ita.oop.s1.avaliacao;
/**
 * <h2>Instruções</h2>
 * 
 * <p>Implemente no Eclipse uma classe chamada Paciente que possui 
 * um construtor que recebe o seu peso em quilos e sua altura 
 * em metros, ambos utilizando o tipo double. Crie um método 
 * chamado calcularIMC() que calcula o índice de Massa Corporal 
 * de acordo com a fórmula IMC = peso (quilos) / (altura * altura (metros)). 
 * Crie também um método chamado diagnostico() que utiliza o método 
 * calcularIMC() e retorna uma String de acordo com as seguintes faixas de valor:</p>
 * 
 * -> <b>Baixo peso muito grave</b> = IMC abaixo de 16 kg/m²
 * -> <b>Baixo peso grave</b> = IMC entre 16 e 16,99 kg/m²
 * -> <b>Baixo peso</b> = IMC entre 17 e 18,49 kg/m²
 * -> <b>Peso normal</b> = IMC entre 18,50 e 24,99 kg/m²
 * -> <b>Sobrepeso</b> = IMC entre 25 e 29,99 kg/m²
 * -> <b>Obesidade grau I</b> = IMC entre 30 e 34,99 kg/m²
 * -> <b>Obesidade grau II</b> = IMC entre 35 e 39,99 kg/m²
 * -> <b>Obesidade grau III (obesidade mórbida)</b> = IMC igual ou maior que 40 kg/m²
 * 
 * <p>Implemente no Eclipse uma classe chamada Principal em que se criam 
 * 3 instâncias da classe Paciente com valores diferentes e se imprime 
 * no console o resultado dos dois métodos criados.</>
 * 
 * @author Jefferson Rago <jefferson.s.rago at gmail.com>
 * @since 22/07/17
 *
 */
public class Principal {

	public static void main(String[] args) {
		Paciente p1 = new Paciente(93, 1.71);
		Paciente p2 = new Paciente(99.3, 1.72);
		Paciente p3 = new Paciente(75, 1.70);
		
		System.out.println("Paciente 1: "+p1.diagnostico());
		System.out.println("Paciente 2: "+p2.diagnostico());
		System.out.println("Paciente 3: "+p3.diagnostico());
	}
}
