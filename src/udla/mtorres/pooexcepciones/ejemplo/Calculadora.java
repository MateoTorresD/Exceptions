package udla.mtorres.pooexcepciones.ejemplo;

public class Calculadora {

    public double dividir(int dividendo, int divisor) throws DivisionPorCeroException{
        if(divisor==0){
            throw new DivisionPorCeroException("No es posible dividir por cero");
        }
        return dividendo/(double)divisor;
    }

    public double dividir (String dividendo, String divisor)
            throws DivisionPorCeroException, FormatoNumeroException{

        try{
            int divid = Integer.parseInt(dividendo);
            int divos = Integer.parseInt(divisor);
            return this.dividir(divid, divos);
        } catch(NumberFormatException nfe){
            throw new FormatoNumeroException("Ingresar numeros no caracteres");
        }

    }
}
