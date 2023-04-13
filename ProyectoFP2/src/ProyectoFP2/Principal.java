package ProyectoFP2;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class Principal {
	
	final static Scanner consola = new Scanner(System.in);

	public static void main(String[] args) {
		
		Comunidad comunidad = new Comunidad();
		EmpresaLimpieza empresa = new EmpresaLimpieza("La Más Limpia", "Calle Toledo", 10);
		
	}
	
	public static void leerVecinos(String cadena)throws IOException{
		
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
	      } else
	      {
	    	  double mensualidad=Double.parseDouble(nombre_f.next());
	    	  System.out.println(mensualidad);
	      }
	      
	    	
	      
	    }
	    nombre_f.close();
	}
	
	public static int menu() {
		
		int opcion = 0;
		
		System.out.println("\nIndique el número de la consulta a realizar: \n");
		System.out.println("1. Consultar la información de los vecinos de la comunidad.");
		System.out.println("2. Añadir petición de mejora.");
		System.out.println("3. Mostrar el vecino que más paga de la comunidad.");
		System.out.println("4. Consultar peticiones urgentes realizadas por los vecinos.");
		System.out.println("5. Consultar la suma de los impuestos anuales.");
		System.out.println("6. Mostrar los impuestos que debe pagar un determinado vecino.");
		System.out.println("7. Mostrar cuanto debe pagar la comunidad por la empresa de limpieza.");
		System.out.println("8. Salir");
		
		opcion = consola.nextInt();
		
		return opcion;
		
	}
	
	public static void gestionarComunidad(Comunidad comunidad, EmpresaLimpieza empresa) {
		
		int opcion;
		
		do {
			
			opcion = menu();
			
			switch (opcion) {
			case 1: 
				System.out.println();
				
				
				break;
				
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			case 5:
				break;
			case 6:
				break;
			case 7: 
				break;
			case 8:
				System.out.println("");
				break;
				
			}
			
		} while (opcion != 0);
	}
	

}
