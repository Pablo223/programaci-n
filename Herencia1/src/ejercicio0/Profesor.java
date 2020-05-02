package ejercicio0;

public class Profesor extends Persona {
	private String Despacho;
	private String horaTuto;
	
	public Profesor() {	
	}
	
	public Profesor(String Despacho, String horaTuto) {
		this.Despacho=Despacho;
		this.horaTuto=horaTuto;
	}
	
	public String getDespacho() {
		return Despacho;
	}
	
	public void setDespacho(String Despacho) {
		this.Despacho=Despacho;
	}
	
	public String gethoraTuto() {
		return horaTuto;
	}
	
	public void sethoraTuto(String horaTuto) {
		this.horaTuto=horaTuto;
	}
	
	public String Llamada(){
	String consultas;
	consultas="Despacho: "+this.Despacho+" Horario consultas: "+this.horaTuto;
	return consultas;
	}
}
	
	
	
	
	
	
	
	
	

