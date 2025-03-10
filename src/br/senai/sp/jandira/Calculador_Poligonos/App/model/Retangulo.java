package br.senai.sp.jandira.Calculador_Poligonos.App.model;

public class Retangulo {
	
	private double base;
	
	private double altura;
	
	public void setBase (double base) {
		this.base = base;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	
	public double calcularArea() {
		double area = base * altura;
		return area;
		}
		
	public double calcularPerimetro() {
		double perimetro = 2 * base + altura;
		return perimetro;
	}
	
	public void exibirDados () {
		System.out.println("------------------------");
		System.out.println("DADOS DA FIGURA RETANGULAR");
		System.out.println("------------------------");
		System.out.println("Tamanho do base: " + base);
		System.out.println("Tamanho do altura: " + altura);
		System.out.println("Área total: " + calcularArea());
		System.out.println("Perimetro: " + calcularPerimetro());
		System.out.println("------------------------");
	}

}
