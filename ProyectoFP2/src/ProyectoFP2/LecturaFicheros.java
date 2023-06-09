package ProyectoFP2;

import java.io.*;
import java.util.*;

/**
 * Clase para la lectura de ficheros clientes y viviendas
 
 *
 */
public class LecturaFicheros {
	public static void main(String []args) throws IOException{
		
		leerVecinos("Vecinos.txt");
		
	}

 
  
  /**
   * Metodo para leer los clientes de un fichero 
   * @param cadena ruta del fichero
   * @return matriz de clientes leidos
   * @throws IOException
   */
  public static void leerVecinos (String cadena)throws IOException{
	
    File f=new File(cadena);
    Scanner nombre_f = new Scanner (f);
    while (nombre_f.hasNext()){
      char tipoVecino = nombre_f.next().charAt(0);
      String nombre=nombre_f.next();
      String nif=nombre_f.next();
      String piso=nombre_f.next();


      System.out.print(tipoVecino+" "+nombre+" "+nif+" "+" "+piso);


      if (tipoVecino == 'p'){
        int anio =nombre_f.nextInt();
       System.out.println(anio);
      } else 
      {
        double mensualidad = Double.parseDouble(nombre_f.next());
        System.out.println(mensualidad);
      }
      
    	
      
    }
    nombre_f.close();
    
  }  
}