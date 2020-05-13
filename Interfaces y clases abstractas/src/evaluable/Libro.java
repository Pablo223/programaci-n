package evaluable;    //Pablo Langa Martí

public class Libro extends Publicaciones {

	//Atributo
	private String autor;
	
	
	//Constructor
	public Libro() {
		
	}
	
	public Libro(String autor) {
		this.autor=autor;
	}
	
	public Libro(String autor, int codigo, String agno) {
		super(codigo, agno);
		this.autor=autor;
	}
	
	//Metodos
	public String getAutor() {
		return autor;
	}
	
	public void setnumero(String autor) {
		this.autor=autor;
	}

	@Override
	public String toString() {
		return  "El libro esta prestado";
	}
	
}


	
	

