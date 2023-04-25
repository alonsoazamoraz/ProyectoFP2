package Edificio;

abstract class Vecino implements Constantes { //La clase vecino será abstacta, implementamos el metodo CalculoImpuesto el cual es abstracto y ademas implementamos constantes.
protected  String nombre;
protected  String nif;   // Importante resaltar que al tratarse de una relacion de herencia las variables serán protected
protected  String nPiso;
protected  PeticionDeMejora [] peticiones;
protected int nPeticion=0;
public Vecino(String nombre, String nif, String nPiso) {
	this.nombre = nombre;
	this.nif = nif;
	this.nPiso = nPiso;
	this.peticiones = new PeticionDeMejora [10]; //cambiamos el constructor para las peticiones 
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getNif() {
	return nif;
}
public void setNif(String nif) {
	this.nif = nif;
}
public String getnPiso() {
	return nPiso;
}
public void setnPiso(String nPiso) {
	this.nPiso = nPiso;
}
public String getDescripcionPeticion(int num) {
	return peticiones[num].getDescripcion();
}

public void setDescripcionPeticion(int num, String descripcion) {
	peticiones[num].setDescripcion(descripcion);
}

public int getUrgenciaPeticion(int num) {
	return peticiones[num].getUrgencia();
}

public void setUrgenciaPeticion(int num, int urgencia) {
	peticiones[num].setUrgencia(urgencia);
}

public PeticionDeMejora[] getPeticiones() {
	return peticiones;
}
public int getnPeticion() {
	return nPeticion;
}

public void addPeticion (PeticionDeMejora peticion) throws MaximoPeticionesException { 
	// Creamos el metodo addPeticion para añadir peticiones a un vecino, le añadimos también una excepcion por si se pasa de 10 peticiones
	if (nPeticion < 10) {
	peticiones[nPeticion] = peticion;
	nPeticion++;
	} else
		throw new MaximoPeticionesException();

}
public abstract double CalculoImpuesto(); //Declaramos el método abstracto CalculoImpuesto.


	

public String toString() {
	return "Nombre del vecino: " + nombre + ", NIF del vecino: " + nif + ", número de piso: " + nPiso + "\n";
}

}