package Edificio;
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
	
		public static void MostrarVecinos(String cadena,Comunidad comunidad) throws IOException{
			
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
		
	public static void addMejora () {
		System.out.println("Bienvenido al apartado de petición de mejora\n");
		System.out.println("Por favor diganos cúal es la gravedad de su petición");
		int urgencia;
		urgencia = CONSOLA.nextInt();
		System.out.println("Por favor desarrolla su petición de mejora");
		String descripcion;
		descripcion = CONSOLA.next();
		PeticionDeMejora peticion = new PeticionDeMejora(descripcion,urgencia);
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
				MostrarVecinos("Vecinos.txt", comunidad);
				break;
			case 2: 
				addMejora();
				break;
			case 3:
				System.out.println();
				break;
			case 4: 
				System.out.println(); 
				break;
			case 5: 
				CalculoTotal();
				break;
			case 6: 
				 ImpuestoVecino(comunidad.getVecinos(opcion));
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


	public abstract double CalculoImpuesto();
	
	
	public static double CalculoTotal()  {
	    double totalImpuestos = 0;
	    List<Inquilino> inquilinos = new ArrayList<>();;
	    List<Propietario> propietarios =new ArrayList<>(); ;
	    
	    // Cálculo de impuestos para inquilinos
	    for (int i = 0; i < inquilinos.size(); i++) {
	        Inquilino inquilino = inquilinos.get(i);
	        totalImpuestos += inquilino.CalculoImpuesto();
	    }
	    
	    // Cálculo de impuestos para propietarios
	    for (int i = 0; i < propietarios.size(); i++) {
	        Propietario propietario = propietarios.get(i);
	        totalImpuestos += propietario.CalculoImpuesto();
	    }
	    
	    return totalImpuestos;
	}
public static int menuVecino() {
		
		int opcion = 0;
		
		System.out.println("\nIndique que vecino desea consultar : \n");
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
	public static void ImpuestoVecino (Vecino[] vecinos)  {
		int opcion;
		do {
			opcion = menuVecino();
			switch (opcion) {
			case 1:
				System.out.println("Pago: "+vecinos[0].CalculoImpuesto());
				break;
			case 2: 
				System.out.println("Pago: "+vecinos[1].CalculoImpuesto());
				break;
			case 3:
				System.out.println("Pago: "+vecinos[2].CalculoImpuesto());
				break;
			case 4: 
				System.out.println("Pago: "+vecinos[3].CalculoImpuesto());
				break;
			case 5: 
				System.out.println("Pago: "+vecinos[4].CalculoImpuesto());
				break;
			case 6: 
				System.out.println("Pago: "+vecinos[5].CalculoImpuesto());
				break;
			case 7: 
				System.out.println("Pago: "+vecinos[6].CalculoImpuesto());
				break;
			case 8:
				System.out.println("Pago: "+vecinos[7].CalculoImpuesto());
				break;
			case 9:
				System.out.println("Pago: "+vecinos[8].CalculoImpuesto());
				break;
			case 10:
				System.out.println("Pago: "+vecinos[9].CalculoImpuesto());
				break;
			case 11: 
				System.out.println("Pago: "+vecinos[10].CalculoImpuesto());
				break;
				
			
			}
			} while (opcion !=11);
		}
}
