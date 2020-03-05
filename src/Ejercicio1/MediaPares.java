package Ejercicio1;

import java.util.Scanner;

public class MediaPares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] a;
		a = new double[10];
		double par = 0;
		double impar = 0;
		int cont = 0;
		int cont2 = 0;
		
		for (int b=0;b<a.length;b++) {
			System.out.println("Introduce un numero");
			a[b]=sc.nextDouble();
		}
			for (int y=0;y<a.length;y++) {
				if (y%2 == 0) {
					par = par+a[y];
					 cont++;
				}else {
					impar = impar+a[y];
					cont2++;	
				}
			}
			par=par/cont;
			impar=impar/cont2;
			
			System.out.println("La media de impares es "+impar+ " y la par es "+par);
	}
}

			
			
			
			





