package ProyectoFP2;

public class Comunidad {
	private String nombre;
	private int nEscaleras;
	private Vecino[] vecinos;
	private int nVecinos;
	
	public Comunidad(String nombre, int nEscaleras, Vecino[] vecinos, int nVecinos) {
		this.nombre = nombre;
		this.nEscaleras = nEscaleras;
		this.vecinos = vecinos;
		this.nVecinos = nVecinos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getnEscaleras() {
		return nEscaleras;
	}

	public void setnEscaleras(int nEscaleras) {
		this.nEscaleras = nEscaleras;
	}
	
	public String getNombreVecino(int num) {
		return vecinos[num].getNombre();
	}
	
	public void setNombreVecino(int num, String nombre) {
		vecinos[num].setNombre(nombre);
	}
	
	public String getNifVecino(int num) {
		return vecinos[num].getNif();
	}
	
	public void setNifVecino(int num, String nif) {
		vecinos[num].setNif(nif);
	}
	
	public String getnPisoVecino(int num) {
		return vecinos[num].getnPiso();
	}
	
	public void setnPisoVecino(int num, String nPiso) {
		vecinos[num].setnPiso(nPiso);
	}
	
	public double CalculoEmpresaLimpieza (EmpresaLimpieza empresa) {
		return empresa.getCoste()*nEscaleras*12;
	}
	
	public void addVecino(Vecino vecino) {
		if (nVecinos < vecinos.length) {
			vecinos[nVecinos] = vecino;
			nVecinos++;
		}
	}
	
	public String toString() {
		String result = "";
		result = "Nombre de la comunidad: " + nombre + ", número de escaleras: " + nEscaleras + ", número de vecinos " + nVecinos + "\n";
		for (int i = 0; i < vecinos.length; i++) {
			result += vecinos[i].toString();
		}
		return result;
	}
	

}
