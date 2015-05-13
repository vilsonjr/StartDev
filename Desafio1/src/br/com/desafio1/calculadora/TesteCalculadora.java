package br.com.desafio1.calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteCalculadora {

	@Test
	public void testeSomar(){
		Calculadora calculadoraTest = new Calculadora();				
		assertEquals(8, calculadoraTest.somar(4,4), 0);
	}
	
	@Test
	public void testeSubtrair(){
		Calculadora calculadoraTest = new Calculadora();				
		assertEquals(3, calculadoraTest.subtrair(5, 2), 0);
		
	}
	
	@Test
	public void testeDividir(){
		Calculadora calculadoraTest = new Calculadora();
		assertEquals(2,	calculadoraTest.dividir(4, 2), 0);
	}
	
	@Test
	public void testeMultiplicar(){
		Calculadora calculadoraTest = new Calculadora();
		assertEquals(10, calculadoraTest.multiplicar(5, 2), 0);
		
	}

}
