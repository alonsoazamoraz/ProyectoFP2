package Edificio;
public class EmpresaLimpieza {
private String nombre;
private String direccion;
private double coste;


 public EmpresaLimpieza(String nombre, String direccion, double coste) {
	super();
	this.nombre = nombre;
	this.direccion = direccion;
	this.coste = coste;
}


public String getNombre() {
	return nombre;
}


public void setNombre(String nombre) {
	this.nombre = nombre;
}


public String getDireccion() {
	return direccion;
}


public void setDireccion(String direccion) {
	this.direccion = direccion;
}


public double getCoste() {
	return coste;
}


public void setCoste(double coste) {
	this.coste = coste;
}


public String toString() {
	 return "Dirección: "+direccion+ "Nombre: "+nombre+" Coste: " +coste+ " ";
 }

}
