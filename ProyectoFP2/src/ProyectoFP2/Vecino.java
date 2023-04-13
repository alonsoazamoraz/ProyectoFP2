package ProyectoFP2;

public class Vecino {
	protected String nombre;
	protected String nif;
	protected String nPiso;
	protected Peticion[] peticiones;
	protected int nPeticiones = 0;
	
	public Vecino(String nombre, String nif, String nPiso) {
		this.nombre = nombre;
		this.nif = nif;
		this.nPiso = nPiso;
		Peticion[] peticiones = new Peticion[10];
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
	
	public void addPeticion (Peticion peticion) {
		if (nPeticiones < 10) {
			peticiones[nPeticiones] = peticion;
			nPeticiones++;
		}
	}
	
	public String toString() {
		String result = "";
		result = "Nombre del vecino: " + nombre + ", NIF del vecino: " + nif + ", número de piso: " + nPiso + "\n";
		for (int i = 0; i < peticiones.length; i++) {
			result += peticiones[i].toString();
		}
		return result;
	}
	
	
	

}
