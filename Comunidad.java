package Edificio;

import java.util.Arrays;

public class Comunidad {
	private static int nEscalera;
	private int nVecino;
	private Vecino [] vecinos;


	
		  
		public Comunidad(int nEscalera, int nVecino) {
		super();
		this.nEscalera = nEscalera;
		this.nVecino = nVecino;
		Vecino [] vecinos = new Vecino [nVecino];
	}


		 public int getnEscalera() {
			return nEscalera;
		}



		public void setnEscalera(int nEscalera) {
			this.nEscalera = nEscalera;
		}



		public int getnVecino() {
			return nVecino;
		}



		public void setnVecino(int nVecino) {
			this.nVecino = nVecino;
		}



		public Vecino[] getVecinos() {
			return vecinos;
		}


		public void setVecinos(Vecino[] vecinos) {
			this.vecinos = vecinos;
		}


		public static double CalculoEmpresaLimpieza (EmpresaLimpieza empresa) {
			  return empresa.getCoste()*nEscalera*12;
		  }
		 public void addVecino (Vecino vecino) {
				if (nVecino < vecinos.length) 
				vecinos [nVecino] = vecino;
				nVecino++;
		  }

		public String toString() {
			return "Comunidad [nEscalera=" + nEscalera + ", nVecino=" + nVecino + ", Vecinos="
					+ Arrays.toString(vecinos) + "]";
		}
		  

		
		}