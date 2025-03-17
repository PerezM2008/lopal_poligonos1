package br.senai.sp.jandira.Calculador_Poligonos.App.dao;

import java.util.Scanner;

import br.senai.sp.jandira.Calculador_Poligonos.App.model.Quadrado;

public class QuadradoDao {
	
	public static void criar() {
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um Quadrado");
		
		Quadrado quadrado = new Quadrado();
		
		System.out.print("Digite a medida do lado do Quadrado: ");
		quadrado.setLado(leitor.nextDouble());
		quadrado.exibirDados();
		
	}

}
