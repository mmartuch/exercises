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
public class Exercise6 {

    public static void main(String[] args) {

        int[][] tab = new int[3][2];

        System.out.println("Wprowadz trzy liczby: ");
        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < tab.length; i++) {

            for (int x = 0; x < tab[i].length; x++) {
                System.out.println("Podaj liczby dla przykładu:" + (i + 1));
                tab[i][x] = inputScanner.nextInt();

            }

        }
        // int[][] tab = new int[][]{new int[]{1, 2}, new int[]{3, 4}, new int[]{5, 6, 7}};

        System.out.println("Srednia to: " + arraySum(tab));
    }

    static int arraySum(int[][] tab) {
        int sum = 0;

        for (int i = 0; i < tab.length; i++) {
            for (int x = 0; x < tab[i].length; x++) {
                sum += tab[i][x];
            }
        }
        return sum;
    }

}
