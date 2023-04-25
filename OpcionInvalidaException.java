package Edificio;

public class OpcionInvalidaException extends Exception {
    
    public OpcionInvalidaException(String string) {
        super("La opción seleccionada no es válida. Por favor, seleccione una opción válida.");
    }

	
    
}