/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitives;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Multiplier1 {

    public final double PI = 3.14;
    public int number;
    public double number1;

    public void getNumber() {

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą: ");

        while (true) {

            try {
                number = inputScanner.nextInt();
                number1 = inputScanner.nextInt();
                break;

            } catch (NoSuchElementException e) {
                System.out.println(e);
                System.out.println("Podaj liczbę CAŁKOWITĄ: ");
                inputScanner.next();
            }
        }
    }

    ;
    
    public void multiply() {
       // int wynik = number*(int)PI;
       // double wynik_2 = number*PI;
       // System.out.println("Wynik mnożenia liczba całkowita: " + wynik +" wynik mnożenia liczba zmiennoprzecinkowa " +wynik_2);
       
       //double wynik1= (number/number1); 
       System.out.println(number/number1); 
    }

    ;
    
    public static void main(String[] args) {

        Multiplier1 mul = new Multiplier1();
        mul.getNumber();
        mul.multiply();
    }
}
