package udla.mtorres.pooexcepciones.ejemplo;


import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese un número");

        try{
            //int division = 10/0;
            //divisor
            //int division = 10/divisor;
            int denominador = Integer.parseInt(valor);
            double division = cal.dividir(10, denominador);
            System.out.println(division);
        }catch(DivisionPorCeroException ae){
            System.out.println("Captura el error matemático: " + ae.getMessage());
            main(args);
        }catch(NumberFormatException nfe){
            System.out.println("Captura el error de formato: " + nfe.getMessage());
            main(args);
        }
        finally{
            System.out.println("Es opcional y se ejecuta siempre...");
        }
        System.out.println("Continuamos con el flujo de aplicacion");

    }
}
