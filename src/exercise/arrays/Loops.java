/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.arrays;

import javax.naming.spi.DirStateFactory;

/**
 *
 * @author Marta
 */
public class Loops {

    public static void main(String[] args) {
        Loops l = new Loops();
        l.from0toN(3);
        printCharPerLine(123);
        System.out.println(l.reverse("dupa"));
        System.out.println(l.convertToBinary(21));
        System.out.println("Czy słowo jest palindromem ? " + l.isPalindrome("kajak"));
        l.printArray(new int[]{1, 2, 3});
    }

    public void from0toN(int number) {
        if (number > 0) {
            for (int i = 0; i <= number; i++) {
                System.out.println(i);
            }
        } else {
            System.err.println("Podana liczba jest liczbą ujemną.");
        }
    }

    //  public void printCharPerLine(int number){
    //   }
    private static void printCharPerLine(int number) {
        while (number > 0) {
            int reminder = number % 10;
            number /= 10;
            System.out.println(reminder);
        }
    }

    public String reverse(String word) {

        String result = "";

        char[] toCharArray = word.toCharArray();
        for (int i = toCharArray.length - 1; i >= 0 && i < toCharArray.length; i--) {
            result += toCharArray[i];
        }

        return result;
    }

    public String convertToBinary(int number) {

        String binary = "";
        while (number > 0) {
            binary += number % 2;
            number /= 2;
        }
        return binary;

    }

    public boolean isPalindrome(String word) {

        return word.equals(reverse(word));
    }

    private static boolean isPalindrome2(String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            char currentLetter = chars[i];
            char correspondantLetterFromEnd = chars[chars.length - i - 1];
            if (!(currentLetter == correspondantLetterFromEnd)) {
                return false;
            }
        }
        return true;
        //return word.equals(reverse(word));
    }

    public void printArray(int[] tab) {

      //  System.out.println("[");
      
String x ="[";
        for (int i = 0; i < tab.length; i++) {

            if (i == tab.length - 1) {
               // System.out.println(tab[i]);
x+=tab[i];
            } else {
               // System.out.println(tab[i]);
               // System.out.println(",");
               x+=tab[i];
               x+=",";
            }

        }
       // System.out.println("]");
x+="]";
        System.out.println(x);
        StringBuilder c= "[";
    }
}
