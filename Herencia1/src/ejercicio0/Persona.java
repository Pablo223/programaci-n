package ejercicio0;



public class Persona {

	
	//Atributos
	
	
	private String name;
	private int edad;
	private Coche c;
	private Coche automobil;
	
	//Constructor
	public Persona() 
	{	
		
	}
	
	public Persona(String name) 
	{	
		this.name=name;
		this.edad=0;
		this.c=null;
	}		
	
	

	//Metodo
	
	public String getName() {
		return name;
	}
	
	public void setName (String name) {
		this.name = name;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setEdad (int edad) {
		this.edad = edad;
	}
	
	public Coche getCoche () {
		return c;
	}
	
	public void setCoche (Coche c) {
		this.c=c;
	}

	public Coche getAuto() {
		return automobil;
	}

	public void setAuto(Coche auto) {
		this.automobil = auto;
	}
	
	

	}


	







	