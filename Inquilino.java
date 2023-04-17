package Edificio;
public class Inquilino extends Vecino {
private double pagoMensual;


public Inquilino(String nombre, String nif, String nPiso, double pagoMensual) {
	super(nombre, nif, nPiso);
	this.pagoMensual = pagoMensual;
}


public double getPagoMensual() {
	return pagoMensual;
}

public void setPagoMensual(double pagoMensual) {
	this.pagoMensual = pagoMensual;
}
public String toString() {
	return "Pago Mensual: " +pagoMensual+" ";
}
public double CalculoImpuesto () {
	double result = 0;
	if (pagoMensual>500) {
		result = pagoMensual*IMPUESTOINQ1;
	}
	else {
		result = pagoMensual*IMPUESTOINQ2;
	}
	return result;
}

}
