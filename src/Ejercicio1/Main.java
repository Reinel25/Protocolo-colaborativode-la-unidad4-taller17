package Ejercicio1;

public class Main {
    public static void main(String[] args) {

        Figura f1 = new Circulo(5);
        Figura f2 = new Rectangulo(4, 6);

        System.out.println("Area del circulo: " + f1.area());
        System.out.println("Area del rectangulo: " + f2.area());
    }
}
