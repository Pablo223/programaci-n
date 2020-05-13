package evaluable;   //Pablo Langa Martí

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Publicaciones [] publicacion1=new Libro[5];
		
		int prestados = 0;
		
		publicacion1[0]=new Libro("Cervantes",201432, "2001");
		publicacion1[1]=new revista(12, 23453, "2014");
		publicacion1[2]=new Libro("Celestina", 256553, "2008");
		publicacion1[3]=new revista(14, 24751, "2016");
		publicacion1[4]=new Libro("Mario", 250222, "2013");
		
		
		publicacion1[0].setPrestado(false);
		publicacion1[0].devolver();
		publicacion1[0].prestar();
		
		publicacion1[1].setPrestado(true);
		publicacion1[1].devolver();
		publicacion1[1].prestar();
		
		publicacion1[2].setPrestado(true);
		publicacion1[2].devolver();
		publicacion1[2].prestar();
		
		publicacion1[3].setPrestado(false);
		publicacion1[3].devolver();
		publicacion1[3].prestar();
		
		publicacion1[4].setPrestado(true);
		publicacion1[4].devolver();
		publicacion1[4].prestar();
	
		
		
		
		
		
		
		/*for(int cont=0; cont<publicacion1.length; cont++) {
			System.out.println(publicacion1[cont].toString());
			if (publicacion1[cont].getPrestado()) {
				prestados++;
				
			}
		}*/
		System.out.println("Libros y revistas prestados: " +prestados);
		}

}
