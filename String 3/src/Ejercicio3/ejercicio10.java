package Ejercicio3;


import java.util.Scanner;

public class ejercicio10 {

	public static void main(String[] args) {
		String frase, auxiliar="";
		char letra;
		System.out.println("Introduzca la frase a analizar");
		Scanner sc=new Scanner(System.in);
		frase=sc.nextLine();
		 System.out.print("Introduce un carácter: ");
		// letra = (char) System.in.read();
		 letra = sc.nextLine().charAt(0);      
		
		 int contador = 0, pos;

		    if (frase.isEmpty()) { 
		        contador = 0;
		    } else {
		         pos = frase.indexOf(letra); 
		             while (pos != -1) { 
		            	contador= contador+1; 
		               //frase = frase.substring(0, pos);
		            	pos = frase.indexOf(letra, pos+1);
		               frase = ""; 
		             }  
		             
		            
		    }
		    System.out.println("La letra "+letra+" sale "+contador+ " veces"); 
	}
}

	
			
	   









