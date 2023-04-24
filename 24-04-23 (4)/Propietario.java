package Edificio;
public class Propietario extends Vecino {
	private int añoPiso;
	
	public Propietario(String nombre, String nif, String nPiso, int añoPiso) {
		super(nombre, nif, nPiso);
		this.añoPiso = añoPiso;
	}

	public int getAñoPiso() {
		return añoPiso;
	}

	public void setAñoPiso(int añoPiso) {
		this.añoPiso = añoPiso;
	}

	public String toString() {
		return "Propietario [añoPiso=" + añoPiso + "]";
	}

	public double CalculoImpuesto () {
		double result = 0;
		if (añoPiso>17) {
			result = BASEPROP*IMPUESTOPROP;
		}
		return result;
	}

}
