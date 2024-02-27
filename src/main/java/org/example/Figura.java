package org.example;
import java.util.Scanner;

//Rafael López González
public class Figura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce la base de la figura: ");
        double base = teclado.nextDouble();

        System.out.print("Introduce la altura de la figura: ");
        double altura = teclado.nextDouble();

        String figura = (base == altura) ? "cuadrado" : "rectángulo";
        double perimetro = 2 * (base + altura);

        System.out.printf("La figura es un %s y su perímetro es: %.2f%n", figura, perimetro);

        teclado.close();
    }
}
