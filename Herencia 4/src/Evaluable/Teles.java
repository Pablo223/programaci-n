package Evaluable;

public class Teles  extends Electrodomesticos {
  
private final static int resolucion=20;
	  
	    //Atributos
	    private int resolucion1;
	  
	    private boolean smartTV;
	 
	  
	    //Constructores	
	    public Teles( int precio, int peso, char consumoEnergia, String color, int resolucion){	
	    }
	  
	    public Teles(double precioBase, int peso, char consumoEnergia, String color, int resolucion){
	    }

	    public Teles(double precioBase, double peso, char consumoEnergetico, String color, int resolucion, boolean smartTV){
	        super(precioBase, peso, consumoEnergetico, color);
	        this.resolucion1=resolucion;
	        this.smartTV=smartTV;
	    }
	
	    //Metodos
	    
	    public int getResolucion() {
	    	return resolucion1;
	    }
	    
	    public void setResolucion() {
	    	this.resolucion1=resolucion1;
	    }
	    
	    public boolean getsmartTV() {
	    	return smartTV;
	    }
	    
	    public void setsmartTV(boolean smartTV) {
	    	this.smartTV=smartTV;
	    }
	   
	    @Override
	    public double precioFinal() {
	    	double plus=super.precioFinal();
	    	//boolean sintonizadorTDT =false;
	    	if (resolucion1>40){
	    		plus+=precioBase*0.3;
	    	}  
	    	if (smartTV==true){
	    		plus+=50;
	    	}

	    	return plus;
	    }  
}










