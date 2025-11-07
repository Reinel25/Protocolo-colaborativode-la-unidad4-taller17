package Ejercicio2;

public class CuentaBancaria {
    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void retirar(double monto) {
        saldo -= monto;
    }
}
