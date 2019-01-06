/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.methods;

/**
 *
 * @author Marta
 */
public class Methods {

    public static int getAge() {
        return 21;
    }

    public static String getName() {
        return "Marta";
    }

    public static void mathResults(int number1, int number2) {
        System.out.println("Suma liczb: " + (number1 + number2));
        System.out.println("Różnica liczb: " + (number1 - number2));
        System.out.println("Iloczyn liczb: " + (number1 * number2));
    }

    public static boolean isEven(double number) {
        return number % 2 == 0;
    }

    public static boolean isDevidedBy3and5(double number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    public static double pow(double number) {
        return Math.pow(number, 3);
    }

    public static double sqrt(double number) {
        return Math.sqrt(number);
    }

    public static boolean rectangularTriangle(double number1, double number2, double number3) {
        double a = number1;
        double b = number2;
        double c = number3;

        if (number1 > number2 && number1 > number3) {
            c = number1;
            a = number2;
            b = number3;
        } else if (number2 > number1 && number2 > number3) {
            c = number2;
            a = number1;
            b = number3;
        }

        return a * a + b * b == c * c;
    }

    public static void main(String[] args) {

        System.out.println("Wiek to: " + getAge());
        System.out.println("Imie: " + getName());
        mathResults(2, 3);
        System.out.println(isEven(4));
        System.out.println("Jest podzielna: " + isDevidedBy3and5(15));
        System.out.println("3 potęga: " + pow(2));
        System.out.println("Pierwiastek: " + sqrt(4.89));
        System.out.println("Trójkąt prostokątny: "+ rectangularTriangle(3, 4, 5));

    }

}
