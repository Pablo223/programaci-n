package Evaluable;

public class Electrodomesticos {

	 /*protected final static String Colores="blanco";
	   
	    protected final static char consumoEnergia='F';
	   
	    protected final static double precio=100;
	   
	    protected final static double peso=5;*/
	   
	    //Atributos
	   
	    protected double precioBase;
	 
	    protected String color;
	   
	    protected char consumoEnergetico;
	   
	    protected double peso;
	   
	  
	   
	     public Electrodomesticos(){
	    	color="blanco";	  	   
	 	    consumoEnergetico='F';	 	   
	 	    precioBase=100;	 	   
	 	    peso=5;
	 	 
	 	 }
	 	   
	 	 public Electrodomesticos(double precioBase, double peso){
	 		 this.precioBase =precioBase;
	 		this.peso =peso;
	 	    }
	 	   
	 	 public Electrodomesticos(double precioBase, double peso, char consumoEnergetico, String color){
	 	        this.precioBase=precioBase;
	 	        this.peso=peso;
	 	        comprobarConsumoEnergetico(consumoEnergetico);
	 	        comprobarColor(color);
	 	    }
	 	   
	   
	    public double getPrecioBase() {
	        return precioBase;
	    }
	    
	    public void setPrecioBase() {
	    	this.precioBase=precioBase;
	    }
	  
	    public String getColor() {
	        return color;
	    }
	  
	    public void setColor() {
	    	this.color=color;
	    }
	    public char getConsumoEnergetico() {
	        return consumoEnergetico;
	    }
	
	    public void setConsumoEnergetico() {
	    	this.consumoEnergetico=consumoEnergetico;
	    }
	    public double getPeso() {
	        return peso;
	    }
	
	    public void setPeso() {
	    	this.peso=peso;
	    }
	    
	    private void comprobarColor(String color){
        String colores[]={"blanco", "negro", "rojo", "azul", "gris"};
        boolean Color=false;
        
        if((color=="blanco") || (color=="negro") || (color=="gris")) {
        	this.color =color;
        }else {
        	this.color="blanco";
        }
        
        /*for(int i=0;i<colores.length && !Color;i++){ 
            if(colores[i].equals(color)){
                Color=true;
            }     
        }
        if(Color){
            this.color=color;
        }else{
            this.color=Colores;
        } */  
	 }
      
    public void comprobarConsumoEnergetico(char consumoEnergetico){     
    	if((consumoEnergetico=='A')|| (consumoEnergetico=='B')) {
    		this.consumoEnergetico = consumoEnergetico;
    	}else {
    		this.consumoEnergetico = 'F';
    	}
        /*if(consumoEnergetico>=65 && consumoEnergetico<=70){
            this.consumoEnergetico=consumoEnergetico;
        }else{
            this.consumoEnergetico=consumoEnergia;
        }*/
          
    }
	    public double precioFinal(){
	        double plus=0;
	        switch(consumoEnergetico){
	            case 'A':
	                plus=100; //plus = plus +100;
	                break;
	            case 'B':
	                plus=80;
	                break;
	            case 'C':
	                plus=60;
	                break;
	            case 'D':
	                plus=50;
	                break;
	            case 'E':
	                plus=30;
	                break;
	            case 'F':
	                plus=10;
	                break;
	        }
	   
	        if(peso>=0 && peso<19){
	            plus+=10;
	        }else if(peso>=20 && peso<49){
	            plus+=50;
	        }else if(peso>=50 && peso<=79){
	            plus+=80;
	        }else if(peso>=80){
	            plus+=100;
	        }
	   
	        return precioBase+plus;
	    }
	   
	   
	}































