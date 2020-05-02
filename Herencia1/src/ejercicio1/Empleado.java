package ejercicio1;

public class Empleado {

	//Atributos
	private String nombre;
	private String dni;
	private int edad;
	private boolean casado;
	private double salario;
	
	//Constructor
	public Empleado() {
	}
	
	public Empleado(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Empleado(String nombre, String dni, int edad, boolean casado, double salario) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.casado = casado;
		this.salario = salario;
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public boolean getCasado() {
		return casado;
	}
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public String clasificacion() {
		String resultado;
		if (this.edad<=18) {
			resultado="Principiante";
		}else { 
			if (this.edad<=25) {
				resultado="Junior (Medio)";
			}else {
				resultado="Senior (Alto)";
			}
		}
		return resultado;
	}
	public void mostrarDatos() {
		System.out.println("<------Datos de los empleados------>");
		System.out.println("Nombre empleado: "+this.nombre);
		System.out.println("DNI del empleado: "+this.dni);
		System.out.println("Edad del empleado: "+this.edad);
		System.out.println("Salario del empleado: "+this.salario);
		System.out.println("<----------------------------------->");
		if (casado) {
		System.out.println("El empleado esta casad@");
	}else {
		System.out.println("El empleado no esta casad@");
	}
}
	
	public double subirSueldo(double aumento) {
		double sueldo;
		sueldo=this.salario+this.salario*aumento/100;
		this.salario = sueldo;
		return sueldo; 
	}
	
	public double bajarSueldo(double descuento) {
		double sueldo;
		sueldo=(descuento*this.salario)/100;
		this.salario = sueldo;
		return sueldo; 
	}
	
	
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}

}
