package ProyectoFP2;

public class Peticion {

    private String descripcion;
    private int urgencia;
    
    public Peticion(String descripcion, int urgencia) {
        this.descripcion = descripcion;
        this.urgencia = urgencia;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(int urgencia) {
        this.urgencia = urgencia;
    }

    public String toString() {
        return "Descripción de la petición:" + descripcion + ", tipo de urgencia:" + urgencia;
    }


    
}
