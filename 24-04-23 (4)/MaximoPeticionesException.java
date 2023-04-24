package Edificio;

public class MaximoPeticionesException extends Exception {
    public MaximoPeticionesException() {
        super("El vecino ha alcanzado el máximo de peticiones permitidas.");
    }
}