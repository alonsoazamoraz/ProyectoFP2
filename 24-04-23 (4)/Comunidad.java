package Edificio;

import java.util.Arrays;

public class Comunidad {
	private int nEscaleras;
	private Vecino[] vecinos;
	private int nVecinos;
	
	public Comunidad(int nEscaleras) {
		this.nEscaleras = nEscaleras;
		this.vecinos = new Vecino [11];
		nVecinos = 0;
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
	public double CalculoTotal(Vecino[] vecinos)  {
		double totalImpuestos = 0;
		for (int i=0; i< nVecinos ;i++) {
			totalImpuestos += vecinos[i].CalculoImpuesto();
			
		}
	    
	    
	    return totalImpuestos;
	}
	public String VecinoMasPaga() {
		Vecino vecinoMayorPago = vecinos[0]; // Asignamos el primer vecino como el mayor pago inicialmente

		// Recorre la lista de vecinos para encontrar al vecino con el mayor pago
		for (int i = 1; i < vecinos.length; i++) {
		    Vecino vecinoActual = vecinos[i];
		    if (vecinoActual.CalculoImpuesto() > vecinoMayorPago.CalculoImpuesto()) {
		        vecinoMayorPago = vecinoActual;
		    }
		}

		return  vecinoMayorPago.getNombre();
			
	}
	
	public String mostrarVecinos(Vecino[] vecinos) {
	    String cadena = "";
	    for (int i = 0; i < vecinos.length; i++) {
	        cadena +="NOMBRE: " + vecinos[i].getNombre() + " NIF: " + vecinos[i].getNif()+ " PISO: " + vecinos[i].getnPiso()+ "\n";
	    }
	    return cadena;
	}
 public static String CuantoPaga(String nombre, boolean encontrado,Vecino[]vecinos) {
	 String result = null;
		for (int i = 0; i < vecinos.length; i++ ) {
		    if (vecinos[i].getNombre().equalsIgnoreCase(nombre)) {
		        encontrado = true;
		        result = "El vecino " + vecinos[i].getNombre() + " debe pagar: " + vecinos[i].CalculoImpuesto();  
		    }
		}

		// Mostrar mensaje si el vecino no fue encontrado
		if (!encontrado) {
		    result = "No se encontró un vecino con el nombre " + nombre;
		}
		return result;
	}
public static String EncontrarVecino(String nombre, boolean encontrado,Vecino[]vecinos,int posicion) {
	String result = null;
	for (int i = posicion; i < vecinos.length; i++) {
        if (vecinos[i].getNombre().equalsIgnoreCase(nombre)) {
            encontrado = true;
            result = "Bienvenido " + vecinos[i].getNombre();
            break;
        }
        posicion++; // Incrementar la posición en cada iteración
    }
    // Mostrar mensaje si el vecino no fue encontrado
    if (!encontrado) {
        result = "No se encontró un vecino con el nombre " + nombre;
        posicion = 12;
        Vecino[] x = new Vecino[posicion];
    }
    return result;
}
public String mostrarPeticionesUrgentes(Vecino vecinos[]) {
    boolean hayPeticionesUrgentes = false;
    String cadena = "";
    for (int i = 0; i < vecinos.length; i++) {
        for (PeticionDeMejora peticion : vecinos[i].getPeticiones()) {
            if (peticion != null && peticion.getUrgencia() == 1) {
                hayPeticionesUrgentes = true;
                cadena += "Vecino: " +vecinos[i].getNombre() + " - Petición: " + peticion.getDescripcion() + "\n";
            }
        }
    }
    if (!hayPeticionesUrgentes) {
        cadena = "No hay peticiones urgentes";
    }
    return cadena;
}

	public String toString() {
		return "Comunidad [nEscaleras=" + nEscaleras + ", vecinos=" + Arrays.toString(vecinos) + ", nVecinos="
				+ nVecinos + "]";
	}


	

}

