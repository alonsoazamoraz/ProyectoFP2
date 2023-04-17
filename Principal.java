package edificio;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;
class Principal implements Constantes {
	final static Scanner CONSOLA = new Scanner(System.in);
	public static void main (String[]args) {
		EmpresaLimpieza empresa = new EmpresaLimpieza("La Más Limpia", "Calle Toledo", 10);
		Comunidad comunidad = new Comunidad(11,30);
		try {
			leerVecinos("Vecinos.txt", comunidad);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void leerVecinos(String cadena,Comunidad comunidad)throws IOException{
		
	    File f=new File(cadena);
	    Scanner nombre_f = new Scanner (f);
	    while (nombre_f.hasNext()){
	      char tipoVecino=nombre_f.next().charAt(0);
	      String nombre =nombre_f.next();
	      String nif =nombre_f.next();
	      String piso =nombre_f.next();
	     
	      System.out.println(tipoVecino+" "+nombre+" "+nif+" "+" "+piso+" ");
	      if  (tipoVecino == 'p'){
	        int anio=nombre_f.nextInt();
	       System.out.println(anio);
	       comunidad.addVecino(new Propietario (nombre,nif,piso,anio));
		
	      } else
	      {
	    	  double mensualidad=Double.parseDouble(nombre_f.next());
	    	  System.out.println(mensualidad);
	    	  comunidad.addVecino(new Inquilino (nombre,nif,piso,mensualidad));
	    	  
	      }
	      
	    	
	      
	    }
	    nombre_f.close();
	}
	public static String mostrarVecinos(String cadena, Comunidad comunidad) throws IOException {
		leerVecinos("Vecinos.txt",comunidad);
		return cadena;
		
	}

	public static int menu() {
		
		int opcion = 0;
		
		System.out.println("\nIndique el número de la consulta que desea realizar: \n");
		System.out.println("1.Consultar vecinos de la comunidad. \n");
		System.out.println("2.Añadir petición de mejora. \n");
		System.out.println("3.Mostrar el vecino que más paga de la comunidad. \n");
		System.out.println("4.Consultar peticiones urgentes realizadas por los vecinos. \n");
		System.out.println("5.Consultar la suma de impuestos anuales. \n");
		System.out.println("6.Mostrar los impuestos que debe pagar un determinado vecino. \n");
		System.out.println("7.Mostrar cuanto debe pagar la comunidad a la empresa de limpieza. \n");
		System.out.println("8.Salir. \n");
		
		opcion=CONSOLA.nextInt();
		
		return opcion;
	}
	public static void gestionarComunidad (Comunidad comunidad, EmpresaLimpieza empresa) {
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				String cadena;
				System.out.println(mostrarVecinos(cadena,comunidad));
				break;
			case 2: 
				System.out.println(Vecino.addPeticion(comunidad));
				break;
			case 3:
				System.out.println();
				break;
			case 4: 
				System.out.println(); 
						break;
			case 5: 
				System.out.println();
						break;
			case 6: 
				System.out.println();
						break;
			case 7: 
				System.out.println (Comunidad.CalculoEmpresaLimpieza (empresa));
			case 8:
				System.out.println ("Gracias, vuelva cuando requiera de algún servicio");
			
			}
			
			
				
			
			} while (opcion !=8);
		}

	public double CalculoImpuesto() {
		return 0;
	}

	

}



	
	


	
	
