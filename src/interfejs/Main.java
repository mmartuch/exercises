/*
Napisz dwie klasy implementujące interfejs Computation. 
Niech jedna z implementacji przeprowadza operację dodawania, druga mnożenia.
 */
package interfejs;

import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Main {

    Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Main main = new Main();
        Computation computation;

        if (main.shouldMultiply()) {
            computation = new Multiplication();
        } else {
            computation = new Addition();
        }

        double argument1 = main.getArgument();
        double argument2 = main.getArgument();

        double result = computation.compute(argument1, argument2);
        System.out.println("Wynik: " + result);
    }

    private boolean shouldMultiply() {
        System.out.println("Jesli chcesz mnozyc wcisnij M, inny znak to dodawanie:");

        return inputScanner.next().equals("M");
    }

    private double getArgument() {
        System.out.println("Podaj liczbe: ");
        return inputScanner.nextDouble();
    }
}
