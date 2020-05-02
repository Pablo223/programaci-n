package Evaluable2;

public class NoPerecedero extends Producto{

	//Atributos
	private int tipo;
	
	//Constructores
	public NoPerecedero() {
		
	}
	
	public NoPerecedero(int tipo) {
		this.tipo=tipo;
	}
	
	
	//Metodos
	public int gettipo() {
		return tipo;
	}
	
	public void settipo(int tipo) {
		this.tipo=tipo;
	}
	
	@Override
	public double calcular(int cantidad) {
		return (this.precio*cantidad);
	}
	
	 public String MostrarDatos(){
	      return("NOMBRE: "+this.getNombre()+" PRECIO: "+this.precio+" TIPO: "+this.tipo);
}
}