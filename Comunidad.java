package edificio;

public class Comunidad {
	private int nEscaleras;
	private Vecino[] vecinos;
	private int nVecinos;
	
	public Comunidad( int nEscaleras) {
		this.nEscaleras = nEscaleras;
		Vecino [] vecinos = new Vecino [11];
		this.nVecinos = 0;
	}

	

	public Vecino[] getVecinos() {
		return vecinos;
	}



	public void setVecinos(Vecino[] vecinos) {
		this.vecinos = vecinos;
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
	
	public double CalculoAnualEmpresaLimpieza (EmpresaLimpieza empresa) {
		return empresa.getCoste()*nEscaleras*12;
	}
	
	public void addVecino(Vecino vecino) {
		if (nVecinos < 11) {
			vecinos[nVecinos] = vecino;
			nVecinos++;
		}
	}
	
	public String toString() {
		String result = "";
		result = "Número de escaleras: " + nEscaleras + ", número de vecinos " + nVecinos + "\n";
		for (int i = 0; i < vecinos.length; i++) {
			result += vecinos[i].toString();
		}
		return result;
	}
	

}