package br.senai.sp.jandira.Calculador_Poligonos.App.ui;

import java.util.Scanner;

import br.senai.sp.jandira.Calculador_Poligonos.App.dao.QuadradoDao;
import br.senai.sp.jandira.Calculador_Poligonos.App.dao.RetanguloDao;

public class Menu {

	static Scanner leitor = new Scanner(System.in);

	public static void criarMenu() {

		System.out.println("------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERENCIA");
		System.out.println("6 - Sair");
		System.out.println("----------------");
		System.out.print("Escolha uma opção (1-6):");

		int opcao = leitor.nextInt();

		if (opcao == 1) {
			QuadradoDao.criar();
			// Chamar o QuadradoDao
		} else if (opcao == 2) {
			RetanguloDao.criar();
			// Chamar o RetanguloDao
		} else if (opcao == 6) {
			System.out.println("Encerrando o programa. Até logo!");
			System.exit(0);
		} else {
			System.out.println("Opção inválida! Você deve escolher um número entre 1 e 6!");
			Menu.retornar();
		}

	}

	public static void retornar() {
		// Perguntar se o usuário se ele deseja criar outra forma
		System.out.println("Digite qualquer tecla e precione ENTER para continuar...");
		leitor.next();
		criarMenu();

	}

}
