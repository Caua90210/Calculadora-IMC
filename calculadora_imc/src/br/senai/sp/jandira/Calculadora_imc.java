package br.senai.sp.jandira;

import java.util.Scanner;

public class Calculadora_imc {

	public static void main(String[] args) {
	
	String nome;	
	int peso;
	double altura;
	double imc;
     
	Scanner leitor = new Scanner(System.in);
	System.out.println("Digite o seu nome:");
	nome = leitor.nextLine();
	System.out.println("Digite o seu peso:");
	peso = leitor.nextInt();
	System.out.println("Digite a sua altura:");
	altura = leitor.nextDouble();
	

	imc = peso / (altura*altura);
	
	System.out.println("Olá " + nome + "!" + " Seu IMC é: " +  imc);
	
	
	
	
	}
	
	

}
