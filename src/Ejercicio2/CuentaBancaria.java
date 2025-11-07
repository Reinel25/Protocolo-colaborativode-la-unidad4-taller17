package Ejercicio2;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void retirarSaldo(double monto) {
        saldo -= monto;
    }

    public void retirar(double monto) {
        retirarSaldo(monto);
    }
}
