package br.com.desafio1.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCalculadora {

	public float valorTeste1 = 4;
	public float valorTeste2 = 4;
	public float resultadoEsperado;
	
	@Test
	public void testeSomar(){
		double resultadoSomaTeste = 8;
		
		this.resultadoEsperado = Calculadora.somar(valorTeste1, valorTeste2);
		
		assertEquals(resultadoSomaTeste, resultadoEsperado, 0);
	}
	
	@Test
	public void testeSubtrair(){
		double resultadoSubtraiTeste = 0;
		
		this.resultadoEsperado = Calculadora.subtrair(valorTeste1, valorTeste2);
		assertEquals(resultadoSubtraiTeste, resultadoEsperado, 0);
		
	}
	
	@Test
	public void testeDividir(){
		double resultadoDividiTeste = 1;
		
		this.resultadoEsperado = Calculadora.dividir(valorTeste1, valorTeste2);
		assertEquals(resultadoDividiTeste, resultadoEsperado, 0);
		
	}
	
	@Test
	public void testeMultiplicar(){
		double resultadoMultiplicaTeste = 16;
		
		this.resultadoEsperado = Calculadora.multiplicar(valorTeste1, valorTeste2);
		assertEquals(resultadoMultiplicaTeste, resultadoEsperado, 0);
		
	}

}
