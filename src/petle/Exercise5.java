/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petle;

import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Exercise5 {

    public static void main(String[] args) {

        int[] tab = new int[3];

        System.out.println("Wprowadz trzy liczby: ");
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {
            tab[i] = inputScanner.nextInt();

        }

        System.out.println("Srednia to: " + arraySum(tab));
    }

    static int arraySum(int[] tab) {
        int sum = 0;
        for (int number : tab) {
            sum += number;
        }
        return sum;
    }
;
}
