package Sesion4;

public class ClinicaVeterinaria {
    private double precioDesparasitacion;

    public ClinicaVeterinaria(double precioDesparasitacion) {
        this.precioDesparasitacion = precioDesparasitacion;
    }

    public void setPrecioDesparasitacion(double precioDesparasitacion) {
        this.precioDesparasitacion = precioDesparasitacion;
    }

    public double getPrecioDesparasitacion() {
        return precioDesparasitacion;
    }
    
    public String toString() {
        return "La clínica cobra: " + precioDesparasitacion + " €";
    }
}
