package br.senai.sp.jandira.Calculador_Poligonos.App.ui;

import java.util.Scanner;

import br.senai.sp.jandira.Calculador_Poligonos.App.dao.QuadradoDao;

public class Menu {
	
	public static void criarMenu() {
		
		Scanner leitor = new Scanner(System.in); 
		
		System.out.println("------------------");
		System.out.println("Calculadora de Polígonos");
		System.out.println("------------------");
		System.out.println("1 - QUADRADO");
		System.out.println("2 - RETÂNGULO");
		System.out.println("3 - TRIÂNGULO");
		System.out.println("4 - TRAPÉZIO");
		System.out.println("5 - CIRCUNFERENCIA");
		System.out.println("----------------");
		System.out.print("Escolha uma opção (1-5):");
		
		int opcao = leitor.nextInt();
		
		if (opcao == 1) {
			QuadradoDao.criar();
			//Chamar o QuadradoDao
		} else if (opcao == 2) {
			RetanguloDao.criar();
			//Chamar o RetanguloDao
		} else if (opcao == 3) {
			TrianguloDao.criar();
			//Chamar o TrianguloDao
		} else if (opcao == 4) {
			TrapezioDao.criar();
			//Chamar o TrapézioDao
		}else if (opcao == 5) {
			CircunferenciaDao.criar();
			//Chamar o CircunferênciaDao
		}else {
			System.out.println("Opção inaválida! Você deve escolher um número entre 1 e 5!");
		}
		

	}
}
