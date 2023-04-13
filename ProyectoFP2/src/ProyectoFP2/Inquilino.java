package ProyectoFP2;

public class Inquilino extends Vecino {
	private double pagoMensual;
	
	public Inquilino(String nombre, String nif, String nPiso, double pagoMensual, Peticion[] peticiones) {
		super(nombre, nif, nPiso);
		this.pagoMensual = pagoMensual;
		
	}

	public double getPagoMensual() {
		return pagoMensual;
	}

	public void setPagoMensual(double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}
	
	public String toString () {
		return "Pago mensual: " + pagoMensual + " €";
	}
	
	public double CalculoImpuesto() {
		double result = 0;
		if (pagoMensual< 500) {
			result = pagoMensual * 0.11;
		} else {
			result = pagoMensual * 0.05;
		}
		return result;
	}
}

	
