package Evaluable2;

public class Perecedero extends Producto{

	
	//Atributos
	private int diasCaducar;
	private int promedio;
	
	//Constructores
	public Perecedero() {
		
	}
	
	public Perecedero(int diasCaducar, int promedio) {
		this.diasCaducar=diasCaducar;
		this.promedio=promedio;
	}
	
	//Metodos
	public int getdiasCaducar() {
		return diasCaducar;
	}
	
	public void setdiasCaducar(int diasCaducar) {
		this.diasCaducar=diasCaducar;
	}
	
	public int getpromedio() {
		return promedio;
	}
	
	public void setpromedio(int promedio) {
		this.promedio=promedio;
	}
	
	@Override
	public double calcular(int cantidad) {
			     double  precioTotal=cantidad*this.precio;
			     switch(this.diasCaducar){
			         case 1:
			               precioTotal=(precioTotal/4);
			             break;
			         case 2:
			             precioTotal=(precioTotal/3);
			             break;
			         case 3:
			             precioTotal=(precioTotal/2);
			             break;
			     }  
			       return (precioTotal);
			   
	}
	
	 public String MostrarDatos(){
	      return("NOMBRE: "+this.getNombre()+" PRECIO: "+this.precio+" DIAS A CADUCAR: "+this.diasCaducar);
	
	 }
	
	
}
