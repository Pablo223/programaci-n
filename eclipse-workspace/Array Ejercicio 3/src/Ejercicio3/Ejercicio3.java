package Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] a;
		a = new double[20];
		double suma = 0;
		int cont = 0;
		 
		
	for (int b=0;b<a.length;b++) {
		//System.out.println("Dame un numero par");
		cont = cont+2;
		a[b]=cont;
	}	
	for (int y=0;y<a.length;y++) {			
	System.out.println("Los 20 numeros pares "+a[y]);
		}	
	}
	}

