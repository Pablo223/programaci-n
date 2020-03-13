package Ejercicio2;

import java.util.Scanner;

public class NotaMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] a;
		a = new double[4];
		double suma = 0;
		int cont = 0;
		int cont2 = 0;
		
	for (int b=0;b<a.length;b++) {
		System.out.println("Dame una nota");
		a[b]=sc.nextDouble();
	}
	for (int y=0;y<a.length;y++) {
		if (a[y] > 0) {
			suma = suma+a[y];
			 cont++;			
		}
	}
	suma=suma/cont;
	System.out.println("La media de la nota de grupo es "+suma);
	
	for (int y=0;y<a.length;y++) {
		if(suma<a[y]) {
	System.out.println("Las notas que superan la media "+a[y]);
		}
	}
	}
}	

		
		
		
		
		
