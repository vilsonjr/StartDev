/**
 * Desenvolver uma calculadora com as quatro opera��es b�sicas:
 * A calculadora deve rodar no console/terminal
 * Exibir um menu b�sico para o usu�rio com as seguintes opera��es:
 * - somar
 * - subtrair
 * - multiplicar
 * - dividir
 * - sair
 * O programa s� pode terminar quando o usu�rio selecionar a op��o sair
 * Depois de realizar uma das opera��es matem�tica o sistema de exibir novamente o menu
 * O programa pode ter apenas uma classe mas deve ter mais de 1 m�todo
 * Ter testes para cada opera��o
 * O projeto deve estar no GITHUB
 * 
 */

package br.com.desafio1.calculadora;

import java.util.Scanner;

/**
 * @author Administrador
 *
 */
public class Calculadora {

	public static String operacao;
	public static float valor1;
	public static float valor2;
	public static float resultado;

	public static float somar(float valor1, float valor2) {
		return resultado = valor1 + valor2;
	}

	public static float subtrair(float valor1, float valor2) {
		return resultado = valor1 - valor2;
	}

	public static float dividir(float valor1, float valor2) {
		return resultado = valor1 / valor2;
	}

	public static float multiplicar(float valor1, float valor2) {
		return resultado = valor1 * valor2;
	}

	public static void main(String[] args) {

		System.out.println("Bem vindo � Calculadora no console!");

		while (operacao != "0") {

			System.out.println("\nDigite uma das op��es de opera��o que deseja realizar, considerando:");
			System.out.println("1- Somar \n2- Subtrair \n3- Dividir \n4- Multiplicar \n0- Sair\n");
			Scanner entrada = new Scanner(System.in);
			operacao = entrada.nextLine();

			if (operacao.equals("1")) {
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Soma �: " + Calculadora.somar(valor1, valor2));
			} else if (operacao.equals("2")) {
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Subtra��o �: "	+ Calculadora.subtrair(valor1, valor2));
			} else if (operacao.equals("3")) {
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Divis�o �: " + Calculadora.dividir(valor1, valor2));
			} else if (operacao.equals("4")) {
				System.out.println("Digite o valor 1:");
				valor1 = entrada.nextFloat();
				System.out.println("Digite o valor 2:");
				valor2 = entrada.nextFloat();
				System.out.println("Resultado da Multiplica��o  �: " + Calculadora.multiplicar(valor1, valor2));
			} else if (operacao.equals("0")) {
				System.out.println("Voc� encerrou a calculadora!");
				return;
			} else {
				System.out.println("Opera��o do tipo inv�lida");
			}

		}

	}

}