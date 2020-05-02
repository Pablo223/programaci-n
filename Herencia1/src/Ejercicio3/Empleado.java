package Ejercicio3;

public class Empleado {
	
	//Atributos
	private String nombre;
	
	
	//Constructores
	public Empleado() {
	
	}
	
	public Empleado(String nombre) {
		this.nombre=nombre;
		 System.out.println("Constructor de Empleado " + nombre);
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String nombreEmpleado() {
		return this.nombre+ "es un objeto de la clase empleado";
	}
	
}
