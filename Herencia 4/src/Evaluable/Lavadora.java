package Evaluable;

public class Lavadora extends Electrodomesticos{
		 
	  

	    //Atributos
	    private int carga;
	  
	    //Atributos
	    public Lavadora(){
	    }
	  
	    public Lavadora(double precioBase, double peso) {
	    	super(precioBase, peso);
	    	this.precioBase=precioBase;
	    	this.peso=peso;
	    }
	  
	    public Lavadora(double precioBase, double peso, char consumoEnergetico, String color, int carga){
	        super(precioBase,peso, consumoEnergetico,color);
	        this.carga=carga;
	    }

	    public int getCarga() {
	        return carga;
	    }
	  
	    public void setCarga() {
	    	this.carga=carga;
	    }
	    
	    //Metodos
	    @Override
	    public double precioFinal(){
	        
	        double plus=super.precioFinal();
	  
	        if (carga>30){
	            plus+=50;
	        }
	  
	        return plus;
	    }
	  
	   
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

