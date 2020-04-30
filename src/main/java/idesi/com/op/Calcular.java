package idesi.com.op;

public class Calcular {

    public double resultado;

    public void calcular_suma(double numero1, double numero2) {
        resultado = numero1 + numero2;
    }

    public void calcular_resta(double numero1, double numero2) {
        resultado = numero1 - numero2;
    }

    public void calcular_multiplicacion(double numero1, double numero2) {
        resultado = numero1 * numero2;
    }

    public void calcular_division(double numero1, double numero2) {
        resultado = numero1 / numero2;
    }

    public void calcular_raiz(double numero1) {
        resultado = Math.sqrt(numero1);
    }

    public void calcular_potencia(double numero1, double numero2) {
        resultado = Math.pow(numero1, numero2);
    }
}
