package edificio;
public class PeticionDeMejora {
	private String descripcion;
	private int urgencia;
	public PeticionDeMejora(String descripcion, int urgencia) {
		super();
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
	public String toString () {
		return " Descripción: "+descripcion+ "Urgencia: "+urgencia+ ""; 
	}


}
