/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exeption;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Exercise {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double liczba = 0;
        try {
            System.out.println("Podaj liczbę: ");
            liczba = sc.nextDouble();

        } catch (InputMismatchException e) {
            System.out.println("To nie jest liczba!");

        }
        if (liczba < 0) {
            throw new IllegalArgumentException("Nie można pierwiastkować liczb ujemnych");
        }
        System.out.println("Pierwiastek z liczby " + liczba + "to "+ Math.sqrt(liczba) );
    }

}
