package evaluable;   //Pablo Langa Martí

public  class revista extends Publicaciones {

	//Atributos
	private int numero;
	
	//Constructor
	public revista() {
		
	}
	
	public revista(int numero) {
		this.numero=numero;
	}
	
	public revista(int numero, int codigo, String agno) {
		super(codigo, agno);
		this.numero=numero;
	}
	
	//Metodos
	public int getnumero() {
		return numero;
	}
	
	public void setnumero(int numero) {
		this.numero=numero;
	}

	@Override
	public String toString() {
		return "La revista esta prestada";
	}

}
