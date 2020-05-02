package ejercicio1;

public class Programador extends Empleado{

	//Atributos
	private int lineaCodigoHora;
	private String dominioLenguaje;
	
	//Constructor
	public Programador() {
	}

	public Programador(String nombre, String dni, int edad, boolean casado, double salario, int lineasDeCodigoPorHora, String lenguajeDominante) {
		super(nombre, dni, edad, casado, salario);
		this.dominioLenguaje=lenguajeDominante;
		this.lineaCodigoHora=lineasDeCodigoPorHora;
	}

	//Metodos
	public int getlineasCodigoHora() {
		return lineaCodigoHora;
	}

	public void setlineasCodigoHora(int lineasCodigoHora) {
		this.lineaCodigoHora = lineaCodigoHora;
	}

	public String getdominioLenguaje() {
		return dominioLenguaje;
	}

	public void setdominioLenguaje(String dominiioLenguaje) {
		this.dominioLenguaje = dominioLenguaje;
	}

	
	public String nivelProgramacion() {
		String clase="";
		if (this.lineaCodigoHora>100 && this.lineaCodigoHora<200) {
			clase="Nivel-1";
		}else {
			if (this.lineaCodigoHora<=500) {
				clase="Nivel-2";
			}else {
				clase="Nivel-3";
			}
		}
	return clase;
	}
}
