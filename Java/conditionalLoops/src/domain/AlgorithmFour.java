package domain;

import java.util.Scanner;

public class AlgorithmFour {

	public static void main(String[] args) {
	/*escreva um algoritmo em Java, que simule uma Calculadora simples.
	 *O programa deverá ler dois números float: numero1 e numero2, e na sequência ler 
	 *o Código da operação matemática (número inteiro de 1 a 4). 
	 *A seguir, mostre na tela o resultado da operação entre os 2 números. 
	 *Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!*/
	
		
	Scanner read = new Scanner(System.in);
	
	float n1,n2,finalValue; 
	int code; 
	
	System.out.println("Bem vindo a calculator!!!");
	System.out.println("Confira a tabela abaixo:");
	System.out.println("1 - Soma");
	System.out.println("2 - Subtração");
	System.out.println("3 - Multiplicação");
	System.out.println("4 - Divisão");
	System.out.println("Por favor selecione uma das opções acima!");
	code = read.nextInt();
	System.out.println("Por favor, informe o primeiro valor");
	n1 = read.nextFloat();
	System.out.println("Por favor, informe o segundo valor");
	n2 = read.nextFloat();
	
	switch(code){
	case 1: 
		finalValue = n1 + n2; 
		System.out.println("O resultado da soma é: "+ finalValue);
		break;
	case 2: 
		finalValue =  n1 - n2; 
		System.out.println("O resultado da subtração é: "+ finalValue);
		break;
	case 3: 
		finalValue = n1 * n2;
		System.out.println("O resultado da multiplicação é: "+ finalValue);
		break;
	case 4: 
		finalValue = n1 / n2;
		System.out.println("O resultado da divisão é"+ finalValue);
		break;
	default: 
		System.out.println("Operação inváliada!!");
		break;
	
	}
	}
}
