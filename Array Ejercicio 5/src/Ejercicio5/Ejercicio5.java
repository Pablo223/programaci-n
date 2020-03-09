package Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String[] nombre;
		nombre = new String[10];
		double[] sueldo;
		sueldo = new double[10];
		double sueldoMax = 0;
		int pos = 0;
		
		for(int b=0;b<nombre.length;b++) {
			System.out.println("Introduce un nombre");
			nombre[b]=sc.nextLine();
		}
		
		for(int b=0;b<sueldo.length;b++) {
			System.out.println("Introduce el sueldo");
			sueldo[b]=sc.nextInt();
		}
		
		for(int y=0;y<sueldo.length;y++) {
			if (sueldo[y]>sueldoMax) {
				sueldoMax=sueldo[y];
				pos = y;
			}
			
		
		}
		System.out.println("El empleado "+nombre[pos]+" con un sueldo de "+sueldoMax+" €");}
}


