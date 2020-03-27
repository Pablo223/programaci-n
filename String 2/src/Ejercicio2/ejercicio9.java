package Ejercicio2;

import java.util.Scanner;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase, auxiliar="";
		System.out.println("Introduzca la frase a analizar");
		Scanner sc=new Scanner(System.in);
		frase=sc.nextLine();
				
		    int contador = 1, pos;
		    frase = frase.trim(); 
		    if (frase.isEmpty()) { 
		        contador = 0;
		    } else {
		         pos = frase.lastIndexOf(" "); 
		             if (pos != -1) { 
		               frase = frase.substring(0, pos); 
		             }else {
		               frase = ""; 
		                }  
		            
		    }
		    System.out.println("Se ha eliminado la ultima palabra de la frase introducida ");
		    System.out.println(frase);
	}

}
