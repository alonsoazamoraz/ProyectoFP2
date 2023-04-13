package Sesion4;

public class Protectora implements Constantes {

    // IMPLEMENTACIÓN RELACION 1 A MUCHOS
    private Animal[] animales;
    private int nAnimales;

    public Protectora() {
        animales = new Animal[MAXIMO_ANIMALES];
        nAnimales = 0;  
    }

    public void addAnimal(Animal animal) {

        // if cabe animal
            animales[nAnimales] = animal;
            nAnimales ++;
        
    }

    public double calculoDesparasitacion(ClinicaVeterinaria clinica) {
        return clinica.getPrecioDesparasitacion() * nAnimales;
    }
    
}
