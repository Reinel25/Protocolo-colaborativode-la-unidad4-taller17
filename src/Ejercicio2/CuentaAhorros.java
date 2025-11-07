package Ejercicio2;

public class CuentaAhorros extends CuentaBancaria {

    public CuentaAhorros(double saldo) {
        super(saldo);
    }

    @Override
    public void retirar(double monto) {

        retirarSaldo(monto);
    }
}
