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

        String figura = tipoFigura(BaseDeFigura, AlturaDeFigura);
        double perimetro = CalculoPerimetro(BaseDeFigura, AlturaDeFigura);

        System.out.printf("La figura es un %s y su perímetro es: %.2f%n", figura, perimetro);

        teclado.close();
    }

    public static double CalculoPerimetro(double BaseDeFigura, double AlturaDeFigura) {
        return 2 * (BaseDeFigura + AlturaDeFigura);
    }
    public static String tipoFigura(double BaseDeFigura, double AlturaDeFigura) {
        return (BaseDeFigura == AlturaDeFigura) ? "cuadrado" : "rectángulo";
    }
}