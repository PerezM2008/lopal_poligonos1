package br.senai.sp.jandira.Calculador_Poligonos.App.model;

public class Quadrado {

	private double lado;
	
	public void setLado(double lado) {
		this.lado = lado;
	}
	
	public double calcularArea() {
		double area = lado * lado;
		return area;
	}
	
	public double calcularPerimetro() {
		double perimetro = 4 * lado;
		return perimetro;
	}
	
	public void exibirDados() {
		System.out.println("-----------------------");
		System.out.println("DADOS DO QUADRADO");
		System.out.println("-----------------------");
		System.out.println("Tamanho do lado: " + lado);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		System.out.println("-----------------------");
	}
	
	
	
	
	
	
}
