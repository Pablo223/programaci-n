package Evaluable2; //Pablo Langa Martí

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto ListaProductos[]=new Producto[5];
	       
	       ListaProductos[0]=new Producto("Peras", 20);
	       ListaProductos[1]=new Perecedero(3, 20);
	       ListaProductos[2]=new NoPerecedero(1);
	       ListaProductos[3]=new Producto("Platano", 20);
	       ListaProductos[4]=new NoPerecedero(1);
	       
	       double suma=0;
	       for(int i=0;i<ListaProductos.length;i++){
	           suma=suma+ListaProductos[i].calcular(5);
	       }
	        
	       System.out.println("El precio tatal de productos es: "+suma);
	}

}
