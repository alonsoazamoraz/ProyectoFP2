package ProyectoFP2;

public class Propietario extends Vecino implements Constantes {
	private int anioPiso;
	
	public Propietario ( int anioPiso, String nombre, String nif, String nPiso) {
		super(nombre, nif, nPiso);
		this.anioPiso = anioPiso;
	}

	public int getAnioPiso() {
		return anioPiso;
	}

	public void setAnioPiso(int anioPiso) {
		this.anioPiso = anioPiso;
	}
	
	public String toString () {
		return "Año de compra del piso: " + anioPiso;
	}
	
	public double CalculoImpuesto() {
		double result = 0;
		if (anioPiso > 17) {
			result = BASE_INQUILINO * 0.12;
		}
		return result;
	}

}
