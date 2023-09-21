package br.edu.contabancaria;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor, digite o número da Conta: ");
		int numero = sc.nextInt();

		System.out.println("Por favor, digite o número da Agência: ");
		String agencia = sc.next();
		sc.nextLine();

		System.out.println("Por favor, digite o seu nome: ");
		String nomeCliente = sc.nextLine();

		System.out.println("Por favor, faça um depósito na sua conta: ");
		double saldo = sc.nextDouble();

		System.out.println("Olá " + nomeCliente + ", " + "obrigado por criar uma conta em nosso banco,"
				+ " sua agência é " + agencia + ", " + "conta " + numero + " e o seu saldo de " + saldo
				+ " Já está disponível para saque!");

		sc.close();

	}

}
