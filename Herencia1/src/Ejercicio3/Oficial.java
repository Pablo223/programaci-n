package Ejercicio3;

public class Oficial extends Operativo {

	//Constructor
	public Oficial() {
		
	}
	
	public Oficial(String nombre) {
		super(nombre);
		
	}
	
	//Metodos
	@Override
	public String nombreEmpleado() {
		return super.nombreEmpleado() + " es un Oficial";
	}
	
	
	
}
