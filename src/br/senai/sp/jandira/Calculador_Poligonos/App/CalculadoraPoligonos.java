package br.senai.sp.jandira.Calculador_Poligonos.App;

import br.senai.sp.jandira.Calculador_Poligonos.App.model.Quadrado;
import br.senai.sp.jandira.Calculador_Poligonos.App.model.Retangulo;

public class CalculadoraPoligonos {

	public static void main(String[] args) {
		
		Quadrado quadrado1 = new Quadrado();
		quadrado1.setLado(9);
		quadrado1.exibirDados();
		
		Retangulo retangulo1 = new Retangulo();
		retangulo1.setBase(2);
		retangulo1.setAltura(4);
	}

}
