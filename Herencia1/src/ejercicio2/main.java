package ejercicio2;			/*Pablo Langa Marti*/

import ejercicio0.Coche;
import ejercicio0.Profesor;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Profesor profesor1=new Profesor("Antonio","A209");
		
		Coche coche1=new Coche("Opel","Corsa","Blanco");
		profesor1.setAuto(coche1);
		profesor1.sethoraTuto("Lunes y Jueves de 11:00 a 14:30");
		
		ProfesorEnfermo profesor2 = new ProfesorEnfermo("Antonio","A209");
		
		System.out.println(profesor2.gethoraTuto());
		
		
	}

}
