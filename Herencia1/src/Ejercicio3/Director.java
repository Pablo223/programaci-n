package Ejercicio3;

public class Director extends Empleado {


	//Constructor
	public Director() {
		
	}
	
	public Director(String nombre) {
		super(nombre);
	}
	
	//Metodos
	@Override
	public String nombreEmpleado() {
		return super.nombreEmpleado() + " es un Director";
	}
	
	
	
}
