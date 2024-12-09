package udla.mtorres.pooexcepciones.ejemplo;

public class DivisionPorCeroException extends RuntimeException {
    public DivisionPorCeroException(String mensaje){
        super(mensaje);
    }
}
