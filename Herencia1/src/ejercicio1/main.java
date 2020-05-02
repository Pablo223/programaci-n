package ejercicio1;		//Pablo Langa Marti

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		Programador programador1=new Programador("Juan","234512",20,false,2000,300,"Java");
		programador1.mostrarDatos();
		System.out.println();
	
		System.out.println("Aumento un 25% del sueldo a Juan");
		programador1.subirSueldo(25);
		programador1.mostrarDatos();
	
		programador1.mostrarMensaje("Los viernes libra Juan");
		System.out.println("Dominio de programacion de Juan es "+programador1.clasificacion());
		System.out.println("El nivel de dominio es: "+programador1.nivelProgramacion());

		Programador programador2=new Programador("Felipe","125412",56,true,1600,230,"Felipe");
		programador2.mostrarDatos();
		System.out.println();
		
		System.out.println("Rebaja un 25% del sueldo a Felipe");
		programador2.bajarSueldo(25);
		programador2.mostrarDatos();
		
		programador2.mostrarMensaje("Los martes libra Felipe");
		System.out.println("Dominio de programacion de Feñipe es "+programador2.clasificacion());
		System.out.println("El nivel de dominio es: "+programador2.nivelProgramacion());
	}

}
