package Evaluable2;

public class Producto {

	//Atributos
	private String nombre;
	protected double precio;
	
	
	//Constructor
	public Producto() {
		
	}
	
	public Producto(String nombre, double precio) {
		this.nombre=nombre;
		this.precio=precio;
	}
	
	//Metodos
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setPrecio(double precio) {
		this.precio=precio;
	}
	
	public double calcular(int cantidad) {
		return (this.precio*cantidad);
	}
	
	  public String MostrarDatos(){

	      return("NOMBRE: "+this.nombre+" PRECIO: "+this.precio);
	  }
}
