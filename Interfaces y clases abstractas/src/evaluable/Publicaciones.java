package evaluable;      //Pablo Langa Martí

public class Publicaciones implements MiInterfaz{

	//Atributos
	private int codigo;
	private String agno;
	private boolean prestado;
	
	
	//Constructores
	public Publicaciones() {
		
	}
	
	public Publicaciones(int codigo, String agno) {
		this.codigo=codigo;
		this.agno=agno;
	}
	
	public Publicaciones(int codigo, String agno, boolean prestado) {
		this.codigo = codigo;
		this.agno = agno;
		this.prestado=prestado;
	}
	
	
	//Metodos
	public int getCodigo() {
		return codigo;
	}
	
	public void setCodigo(int codigo) {
		this.codigo=codigo;
	}
	
	public String getAgno() {
		return agno;
	}
	
	public void setAgno(String agno) {
		this.agno=agno;
	}
	
	public boolean getPrestado() {
		return prestado;
	}
	
	public void setPrestado(boolean prestado) {
		this.prestado=prestado;
	}
	
	
	public void prestado() {
		if (prestado == true) {
			System.out.println("No esta disponible");
			prestado = false;
		}else {
			System.out.println("Esta disponible para prestar");
		}
	}
	
	public void prestar() {
		if (prestado==true) {
			System.out.println("No podemos prestarte la publciación porque ya esta prestado");
		}else {
			System.out.println("No esta prestado, se lo puede llevar a casa");
			prestado = true;
		}
	}
	
	public void devolver() {
		if(prestado==false) {
			System.out.println("No podemos prestarlo porque no se ha devuelto");
			prestado = true;
		}else {
			System.out.println("Se ha devuelto, puede llevarselo");
		}
		
	}
	
	@Override
	public String toString() {
		return "El libro o revista esta prestado";
	}
	
}
