package ejercicio7;

import java.util.Scanner;

public class Notas {

	//Atributos
	private double[] notas = new double [5];
	Scanner sc = new Scanner(System.in);
	
	
	//Constructores
	public Notas() {
		
	}
	
	public Notas(double[] notas) {
		this.notas = notas;
	}
	
	
	//Metodos
	public double[] getNotas() {
		return notas;
	}
	
	public void setnotas(double[] notas) {
		this.notas = notas;
	}
	
	public void leer() {
		for(int i=0;i<notas.length;i++) {
			System.out.println(" Nota de la asignatura ");
			notas[i]=sc.nextDouble();
		}
	}
	
	public double medianotas() {
		double suma=0;
		int cont=0;
		for(int i=0;i<notas.length;i++) {
			suma=suma+notas[i];
			cont++;
		}
		suma=suma/cont;
		return suma;
	}
	
	public void mostrarnotas() {
		for (int i=0;i<notas.length;i++) {	
		System.out.println("Notas de la asignatura " +notas[i]);
		}
	}
}
	
	
	
	
	

