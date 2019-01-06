/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petle;

/**
 *
 * @author Marta
 */
public class Ex6 {
     public static void main(String[] args) {
        int[][] numberss = new int[][] {new int[] {1, 2}, new int[] {3, 4}, new int[] {5, 6, 7}};
        System.out.println(sumArray(numberss));
    }

    private static int sumArray(int[][] numbers) {
        int sum = 0;
        for (int[] otherNumbers : numbers) {
            for (int number : otherNumbers) {
                sum += number;
            }
        }
        return sum;
    }
}
