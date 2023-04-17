package edificio;
import java.util.Scanner;
import java.io.*;
public class LeerFichero {
	public class LecturaFicheros {
		public static void main(String []args) throws IOException{
			
			
			leerVecinos("Vecinos.txt");
			
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
		
	}
}


