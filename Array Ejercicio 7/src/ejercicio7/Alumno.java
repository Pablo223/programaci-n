package ejercicio7;

public class Alumno {

	
	//Atributo
	private String nombre;
	private int Exp;
	private double notas;
	
	//Constructor
	public Alumno(String nombre, int Exp, double notas) {
		this.nombre = nombre;
		this.Exp = Exp;
		this.notas = notas;
	}
	
	//Metodos
	public Alumno() {	
	}
	
	public double getnotas() {
		return notas;
	}
	
	public void setnotas(double notas) {
		this.notas=notas;
	}
	
	public int getExp() {
		return Exp;
	}
	
	public void setExp(int Exp) {
		this.Exp=Exp;
	}
	
	public String getnombre() {
		return nombre;
	}
	
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String toString() {
		System.out.println("Alumno "+nombre+ " con expediente "+Exp);
		return nombre;
		
	}
	
	
	
	
	
	
	
}

	
