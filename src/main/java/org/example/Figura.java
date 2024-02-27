package org.example;
import java.util.Scanner;

//@Author Rafael López González
public class Figura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la BaseDeFigura de la figura: ");
        double BaseDeFigura = teclado.nextDouble();

        System.out.print("Introduce la AlturaDeFigura de la figura: ");
        double AlturaDeFigura = teclado.nextDouble();

        String figura = (BaseDeFigura == AlturaDeFigura) ? "cuadrado" : "rectángulo";
        double perimetro = 2 * (BaseDeFigura + AlturaDeFigura);

        System.out.printf("La figura es un %s y su perímetro es: %.2f%n", figura, perimetro);

        teclado.close();
    }
}
