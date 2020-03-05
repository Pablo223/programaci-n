package Arrays;

import java.util.Scanner;

public class Temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		double[] a;
		a = new double[10];
		double media = 0;
		double suma = 0;
		double positivos = 0;
		double negativos = 0;
		int x=0;
		int cont = 0;
		int cont2 = 0;
		
		
		System.out.println("Dame una temperatura");
		a[0]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[1]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[2]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[3]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[4]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[5]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[6]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[7]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[8]=sc.nextDouble();
		System.out.println("Dame una temperatura");
		a[9]=sc.nextDouble();
		
		
	for (int y=0;y<a.length;y++) {
		
		if (a[y] > 0) {
			
			suma = suma+a[y];
			 cont++;
				
		}else {
			
			negativos = negativos+a[y];
			cont2++;
				
		}
	}
	
	suma=suma/cont;
	negativos=negativos/cont2;
	
	System.out.println("La media de temperaturas negativas es "+negativos+ " La positiva es "+suma);
	}
}



