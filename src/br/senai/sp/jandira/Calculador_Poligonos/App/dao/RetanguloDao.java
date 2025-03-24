package br.senai.sp.jandira.Calculador_Poligonos.App.dao;

import java.util.Scanner;

import br.senai.sp.jandira.Calculador_Poligonos.App.model.Retangulo;
import br.senai.sp.jandira.Calculador_Poligonos.App.ui.Menu;

public class RetanguloDao {
	
	public static void criar(){
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Criando um Retangulo...");
		
		Retangulo retangulo = new Retangulo();
		System.out.print("Digite a medida da base do Retangulo: ");
		retangulo.setBase(leitor.nextDouble());
		
		System.out.print("Digite a medida da altura: ");
		retangulo.setAltura(leitor.nextDouble());
		
		retangulo.exibirDados();

		Menu.retornar();
		
		
		
	}

}
