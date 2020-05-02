package ejercicio2;

public class Estudiante extends Persona{

	//Atributos
	private int numExp;
	private String cursoAct;
	private float [] notas;
	
	
	//Constructor
	public Estudiante () {	
		
	}

	public Estudiante (int numExp, String cursoAct, float[]notas) {
		this.cursoAct=cursoAct;
		this.notas=notas;
		this.numExp=numExp;
	}
	public Estudiante (String name, String cursoAct,int numExp) {
		super(name);
		this.cursoAct=cursoAct;
		
		this.numExp=numExp;
	}
	
	//Metodos
	public int getnumExp () {
		return numExp;
	}

	public void setnumExp (int numExp) {
		this.numExp=numExp;
	}
	
	public String getcursoAct() {
		return cursoAct;
	}
	
	public void setcursoAct(String cursoAct) {
		this.cursoAct=cursoAct;
	}
	
	public float[] getnotas() {
		return notas;
	}
	
	public void setnotas(float[] notas) {
		this.notas=notas;
	}
	
	public double medianotas() {
		double suma=0;
		int cont=0;
		for(int i=0;i<notas.length;i++) {
			suma=suma+notas[i];
			cont++;
		}
		suma=suma/cont;
		return suma;
	}
	
	
}
