package Ejercicio3;

public class Tecnico extends Operativo{


	//Constructor
	public Tecnico() {
		
	}
	
	public Tecnico(String nombre) {
		super(nombre);
		
	}
	
	//Metodos
	@Override
	public String nombreEmpleado() {
		return super.nombreEmpleado() + " es un Tecnico";
	}
}
