package Ejercicio3;

public class Operativo extends Empleado {


	//Constructor
	public Operativo() {
		
	}
	
	public Operativo(String nombre) {
		super(nombre);
		
	}
	
	//Metodos
	@Override
	public String nombreEmpleado() {
		return super.nombreEmpleado() + " es un Operativo";
	}
}
