package Edificio;
import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
public abstract class Principal implements Constantes {
	final static Scanner CONSOLA = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException, MaximoPeticionesException {
	EmpresaLimpieza empresa = new EmpresaLimpieza("La Más Limpia", "Calle Toledo", 10);
	int nEscaleras;
	
	System.out.println("Antes de empezar, indiquenos cuántas escaleras tiene el edificio.");
	nEscaleras = CONSOLA.nextInt();
	Comunidad comunidad = new Comunidad(nEscaleras);
	try {
		leerVecinos("Vecinos.txt", comunidad);
	} catch (IOException e) {
		e.printStackTrace();
	}
	gestionarComunidad(comunidad, empresa);
}

	
	public static void leerVecinos(String cadena,Comunidad comunidad)throws IOException{
	    File f=new File(cadena);
	    Scanner nombre_f = new Scanner (f);
	    while (nombre_f.hasNext()){
	      char tipoVecino=nombre_f.next().charAt(0);
	      String nombre =nombre_f.next();
	      String nif =nombre_f.next();
	      String piso =nombre_f.next();
	     
	      if  (tipoVecino == 'p'){
	        int anio=nombre_f.nextInt();
	       Propietario propietario = new Propietario(nombre, nif, piso, anio);
           comunidad.addVecino(propietario);
	       
	       
	       
		
	      } else {
	    	  double mensualidad=Double.parseDouble(nombre_f.next());
	    	  Inquilino inquilino = new Inquilino(nombre, nif, piso, mensualidad);
              comunidad.addVecino(inquilino); 	    	 
	    
	      }  	    	      
	    }
	    nombre_f.close();	  	    		
		}	
			
		
		
	public static void addMejora (Vecino[] vecinos) throws MaximoPeticionesException {
			int urgencia = 0;
			int posicion = 0;
			boolean no_urgente = false, urgente = false, muy_urgente = false;
			System.out.println("Bienvenido al apartado de petición de mejora");
			System.out.println("Seleccione que vecino es usted: ");
			String vecino = CONSOLA.next();
			boolean encontrado = false;
			System.out.println(Comunidad.EncontrarVecino(vecino,encontrado, vecinos,posicion));
			try {
			System.out.println("Por favor, díganos cuál es la gravedad de su petición(0 si no es urgente, 1 si es urgente o 2 si es muy urgente");
			urgencia = CONSOLA.nextInt();
			} catch (InputMismatchException e) {
	            System.out.println("Error: el dato ingresado no es un número, intentelo de nuevo ");
	        } finally {
	            CONSOLA.nextLine(); // Se libera el recurso del objeto Scanner
	            urgencia = CONSOLA.nextInt();
	        }
			while (urgencia < 0 || urgencia > 2) {
				System.out.println("ERROR. El valor debe ser 0(no urgente), 1(urgente) o 2(muy urgente). ");
				urgencia = CONSOLA.nextInt();
			}
			if (urgencia == 0) {
				no_urgente = true;
				System.out.println("Gravedad no urgente");
			}
			if (urgencia == 1) {
				urgente = true;
				System.out.println("Gravedad urgente");
			}
			if (urgencia == 2) {
				muy_urgente = true;
				System.out.println("Gravedad muy urgente");
			}
			System.out.println("Por favor, desarrolla su petición de mejora");
			String descripcion;
			descripcion = CONSOLA.next();
			PeticionDeMejora peticion = new PeticionDeMejora(descripcion, urgencia);
			vecinos[posicion].addPeticion(peticion);
			System.out.println("Gracias, vuelva pronto");
		}
	
	public static void ConsultarImpuesto(Vecino[] vecinos) {
		
		System.out.println("Bienvenido, introduzca su nombre por favor: ");
		String nombre = CONSOLA.next();
		boolean encontrado = false;
		System.out.println(Comunidad.CuantoPaga(nombre, encontrado, vecinos));
		
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
	public static void gestionarComunidad (Comunidad comunidad, EmpresaLimpieza empresa) throws IOException, MaximoPeticionesException {
	    int opcion;
	    do {
	        try {
	            opcion = menu();
	            switch (opcion) {
	                case 1:
	                    System.out.println(comunidad.mostrarVecinos(comunidad.getVecinos())); 
	                    break;
	                case 2: 
	                    addMejora(comunidad.getVecinos());
	                    break;
	                case 3:
	                    System.out.println("El vecino que más paga es "+comunidad.VecinoMasPaga());
	                    break;
	                case 4: 
	                	System.out.println(comunidad.mostrarPeticionesUrgentes(comunidad.getVecinos()));
	                    break;
	                case 5: 
	                    System.out.println("El total de impuestos a recaudar por parte de la comunidad es: "+comunidad.CalculoTotal(comunidad.getVecinos()));
	                    break;
	                case 6: 
	                    ConsultarImpuesto(comunidad.getVecinos());
	                    break;
	                case 7: 
	                    double coste = comunidad.CalculoAnualEmpresaLimpieza(empresa);
	                    System.out.println("La comunidad paga un total de: " + coste);
	                    break;
	                case 8:
	                    System.out.println ("Gracias, vuelva cuando requiera de algún servicio");
	                    break;
	                default:
	                    throw new OpcionInvalidaException("Opción inválida, por favor seleccione una opción válida.");
	            }
	        } catch (OpcionInvalidaException e) {
	            System.out.println(e.getMessage());
	            opcion = 0; // resetear la opción para solicitar de nuevo al usuario
	        }
	    } while (opcion != 8);
	}

}	
	
	
