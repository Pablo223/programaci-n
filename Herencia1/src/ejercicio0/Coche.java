package ejercicio0;

public class Coche {

	
	//Atributos
	
	
	private String marca;
	private String color;
	private String modelo;
	
	
	//Constructor
	public Coche(){	
	}
	
	public Coche(String marca ,String color,String modelo)
	{	
		this.marca=marca;
		this.color=color;
		this.modelo=modelo;
	}		
	

	//Metodo
	
	public String getmarca() {
		return marca;
	}
	
	public void setmarca (String marca) {
		this.marca = marca;
	}
	
	public String getcolor() {
		return color;
	}
	
	public void setcolor (String color) {
		this.color = color;
	}
	
	public String getmodelo() {
		return modelo;
	}
	
	public void setmodelo (String modelo) {
		this.modelo = modelo;
	}
}

	







	