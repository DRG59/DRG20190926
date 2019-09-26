package modelo;

public class Calculadora {

    private int num1;
    private int num2;

    public Calculadora() {
    }

    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int Sumar() {
        return this.num1 + this.num2;
    }

    public int Restar() {
        return this.num1 - this.num2;
    }

    public int Multiplicar() {
        return this.num1 * this.num2;
    }

    public int Dividir() {
        return this.num1 / this.num2;
    }
}
