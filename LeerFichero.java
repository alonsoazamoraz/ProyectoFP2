package Edificio;
	import java.util.Scanner;
	import java.io.*;
	public class LeerFichero {

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
			      } else
			      {
			    	  double mensualidad=Double.parseDouble(nombre_f.next());
			    	  System.out.println(mensualidad);
			      }
			      

}
			    nombre_f.close();
			  }
			  
	}
