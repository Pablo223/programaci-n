package Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] a;
		a = new double[10];
		int positivos = 0;
		int negativos = 0;
		int cero = 0;
		int pos = 0;
		int neg = 0;
		int ce = 0;
		
		for(int b=0;b<a.length;b++) {
			System.out.println("Introduce un numero");
			a[b]=sc.nextInt();
		}
		
		for(int y=0;y<a.length;y++) {
			if (a[y]>0) {
				pos++;
			}else if(a[y]<0) {
				neg++;
			}else if(a[y]==0) {
					ce++;
				}
			}
		System.out.println("Positivos "+pos);
		System.out.println("Negativos "+neg);
		System.out.println("Ceros "+ce);	
		}
}
	

