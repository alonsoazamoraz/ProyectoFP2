package Edificio;

import java.util.Arrays;

abstract class Vecino implements Constantes {
protected String nombre;
protected String nif;
protected String nPiso;
protected PeticionDeMejora [] peticiones;
protected int nPeticion=0;
public Vecino(String nombre, String nif, String nPiso) {
	this.nombre = nombre;
	this.nif = nif;
	this.nPiso = nPiso;
	PeticionDeMejora[] Peticiones = new PeticionDeMejora [10];
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
public PeticionDeMejora[] getPeticiones() {
	return peticiones;
}
public void setPeticiones(PeticionDeMejora[] peticiones) {
	this.peticiones = peticiones;
}

public void addPeticion (PeticionDeMejora peticion) {
	if (nPeticion < 10) {
	peticiones[nPeticion] = peticion;
	nPeticion++;
}
	
}
public String toString() {
	return "Vecino [nombre=" + nombre + ", nif=" + nif + ", nPiso=" + nPiso + ", peticiones="
			+ Arrays.toString(peticiones) + ", nPeticion=" + nPeticion + "]";
}  
}

