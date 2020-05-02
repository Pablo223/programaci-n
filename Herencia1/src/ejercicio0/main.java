package ejercicio0;		//Pablo Langa Marti

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int numExp, edad;
		float[] notas;
		notas = new float[4];
		String cursoAct;
		String name, despacho, coche, horaTuto;
		
		Estudiante estudiante1 = new Estudiante("Juan","2º", 1234);
		estudiante1.setEdad(20);
		
		Coche c1=new Coche("Renault","Clio","Rojo");
		estudiante1.setAuto(c1);
		
		float notas1[]={9,6,4,4,8};
		estudiante1.setnotas(notas1);
		
		System.out.println("El estudiante: "+estudiante1.getName()+" tiene una media de: "+estudiante1.medianotas());
		
		Profesor profesor1=new Profesor("Antonio","A209");
		
		Coche coche1=new Coche("Opel","Corsa","Blanco");
		profesor1.setAuto(c1);
		profesor1.sethoraTuto("Lunes y Jueves de 11:00 a 14:30");
		

		System.out.println("El profesor: "+profesor1.getName()+" tiene: "+profesor1.Llamada());
		
	
		
		
	}

}
