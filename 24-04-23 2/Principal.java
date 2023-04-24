package edificio;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class Principal implements Constantes {
	final static Scanner CONSOLA = new Scanner(System.in);
	
	public static void main(String[] args) throws IOException {
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
	
		public static void MostrarVecinos(Comunidad comunidad) {
			for (int i=0; i< comunidad.getnVecinos() ;i++) {
				System.out.println(comunidad.getVecinos(i).toString());
			}
		}
		
	public static void addMejora (Vecino[] vecinos) {
			int urgencia;
			boolean no_urgente, urgente, muy_urgente;
			System.out.println("Bienvenido al apartado de petición de mejora");
			System.out.println("Seleccione que vecino es usted: ");
			int num = 0;
			MejoraVecino(num);
			System.out.println("Por favor, díganos cuál es la gravedad de su petición(0 si no es urgente, 1 si es urgente o 2 si es muy urgente");
			urgencia = CONSOLA.nextInt();
			while (urgencia < 0 || urgencia > 2) {
				System.out.println("ERROR. El valor debe ser 0(no urgente), 1(urgente) o 2(muy urgente)");
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
			vecinos[num].addPeticion(peticion);
			System.out.println("Gracias, vuelva pronto");
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
	public static void gestionarComunidad (Comunidad comunidad, EmpresaLimpieza empresa) throws IOException {
		int opcion;
		do {
			opcion = menu();
			switch (opcion) {
			case 1:
				MostrarVecinos(comunidad);
				break;
			case 2: 
				addMejora(comunidad.getVecinos(opcion));
				break;
			case 3:
				System.out.println();
				break;
			case 4: 
				System.out.println(); 
				break;
			case 5: 
				System.out.println(comunidad.CalculoTotal(comunidad.getVecinos(opcion)));
				break;
			case 6: 
				break;
			case 7: 
				double coste = comunidad.CalculoAnualEmpresaLimpieza (empresa);
				System.out.println("La comunidad paga un total de: " +coste);
				break;
			case 8:
				System.out.println ("Gracias, vuelva cuando requiera de algún servicio");
			
			}
			
			
				
			
			} while (opcion !=8);
		}


	
	
	
public static int menuVecino() {
		
		int opcion = 0;
		
		System.out.println("\n Seleccione un vecino : \n");
		System.out.println("1.Ana \n");
		System.out.println("2.Juan \n");
		System.out.println("3.Pedro \n");
		System.out.println("4.Marco\n");
		System.out.println("5.Wirth \n");
		System.out.println("6.Dijkstra \n");
		System.out.println("7.Allen \n");
		System.out.println("8.Curie \n");
		System.out.println("9.Pearl \n");
		System.out.println("10.Liskov \n");
		System.out.println("11.Codd \n");
		
		opcion=CONSOLA.nextInt();
		
		return opcion;
	}
public static int MejoraVecino (int num)  {
	int opcion;
	do {
		opcion = menuVecino();
		switch (opcion) {
		case 1:
			num = 1;
			return num;
		case 2: 
			num = 2;
			return num;
		case 3:
			num = 3;
			return num;
		case 4: 
			num = 4;
			return num;
		case 5: 
			num = 5;
			return num;
		case 6: 
			num = 6;
			return num;
		case 7: 
			num = 7;
			return num;
		case 8:
			num = 8;
			return num;
		case 9:
			num = 9;
			return num;
		case 10:
			num = 10;
			return num;
		case 11: 
			num = 11;
			return num;
			
		
		}
		} while (opcion !=11);
	return num;
	}
}
