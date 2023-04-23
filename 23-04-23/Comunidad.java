package Edificio;


public class Comunidad {
	private int nEscaleras;
	private Vecino[] vecinos;
	private int nVecinos;
	
	public Comunidad(int nEscaleras) {
		this.nEscaleras = nEscaleras;
		this.vecinos = new Vecino [11];
		nVecinos = 0;
	}

	

	public Vecino[] getVecinos(int i) {
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
	public int getnVecinos() {
		return nVecinos;
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
		return "Comunidad [nEscaleras=" + nEscaleras + ", nVecinos=" + nVecinos + "]";
	}
	
	
	


	
	









	
	

}
