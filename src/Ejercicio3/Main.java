package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        Transporte transporte1 = new Bicicleta();
        Transporte transporte2 = new Coche();

        transporte1.mover();
        transporte2.mover();

    }
}
