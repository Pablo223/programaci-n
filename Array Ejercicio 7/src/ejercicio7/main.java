package ejercicio7;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String nombre; 
		int Exp; 
		
		Alumno alumno1 = new Alumno();
		System.out.print("Introduce un nombre : ");
		nombre = sc.nextLine();
		System.out.print("Introduce el Expediente : ");
		Exp = sc.nextInt();
		alumno1.setnombre(nombre);
		alumno1.setExp(Exp);
		alumno1.toString();
		
		Notas notas1 = new Notas();
		notas1.leer();
		notas1.medianotas();
		notas1.mostrarnotas();
		System.out.println("La media de todas las notas es: "+notas1.medianotas());
		
		
	}

}
