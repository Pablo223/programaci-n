package Evaluable;			/*Pablo Langa Martí*/

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        
		Electrodomesticos Electrodomesticos1[]=new Electrodomesticos[10];
		   
		        
				Electrodomesticos1[0]=new Electrodomesticos(200, 60, 'C', "Verde");
		        Electrodomesticos1[1]=new Lavadora(150, 30);
		        Electrodomesticos1[2]=new Teles(500, 80, 'E', "negro", 42, false);
		        Electrodomesticos1[3]=new Electrodomesticos();
		        Electrodomesticos1[4]=new Electrodomesticos(600, 20, 'D', "gris");
		        Electrodomesticos1[5]=new Teles(300, 40, 'A', "blanco", 40);
		        Electrodomesticos1[6]=new Lavadora(250, 70);
		        Electrodomesticos1[7]=new Lavadora(400, 100, 'A', "verde", 15);
		        Electrodomesticos1[8]=new Teles(200, 60, 'C', "naranja", 30, true);
		        Electrodomesticos1[9]=new Electrodomesticos(50, 10);
		   
		        
		        double sumaElectrodomesticos=0;
		        double sumaTelevisiones=0;
		        double sumaLavadoras=0;
		   
		       
		        for(int i=0;i<Electrodomesticos1.length;i++){
		           
		   
		            if(Electrodomesticos1[i] instanceof Electrodomesticos){
		                sumaElectrodomesticos+=Electrodomesticos1[i].precioFinal();
		            }
		            if(Electrodomesticos1[i] instanceof Lavadora){
		                sumaLavadoras+=Electrodomesticos1[i].precioFinal();
		            }
		            if(Electrodomesticos1[i] instanceof Teles){
		                sumaTelevisiones+=Electrodomesticos1[i].precioFinal();
		            }
		        }
		   
		        System.out.println("La suma del precio de los electrodomesticos es de "+sumaElectrodomesticos);
		        System.out.println("La suma del precio de las lavadoras es de "+sumaLavadoras);
		        System.out.println("La suma del precio de las televisiones es de "+sumaTelevisiones);
		   
		    }

}
	
	
	
	
	
	
	
	
	
	
	
	
