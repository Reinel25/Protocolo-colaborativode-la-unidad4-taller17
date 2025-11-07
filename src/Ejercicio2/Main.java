package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria(1000);
        CuentaBancaria cuenta2 = new CuentaAhorros(1000);

        cuenta1.retirar(200);
        cuenta2.retirar(200);

        System.out.println("Saldo de cuenta bancaria: " + cuenta1.getSaldo());
        System.out.println("Saldo de cuenta de ahorros: " + cuenta2.getSaldo());
    }
}
