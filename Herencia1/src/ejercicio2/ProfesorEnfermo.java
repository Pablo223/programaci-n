package ejercicio2;

public class ProfesorEnfermo extends Profesor {
	
	public ProfesorEnfermo(String Tuto, String Despacho) {
		super(Tuto, Despacho);
	}
	
	@Override
	public String gethoraTuto() {
		String mensaje="El profesor no esta disponible. Se le avisara cuando vuelva a estar disponible";
		return mensaje;
	}
	
	
	
	
	
	
	
	
	
}
