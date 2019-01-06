/*
 Napisz program, który będzie pobierał od użytkownika imiona. Program powinien pozwolić użytkownikowi na wprowadzenie 
dowolnej liczby imion (wprowadzenie „-” jako imienia przerwie wprowadzanie). Na zakończenie wypisz liczbę unikalnych imion.
 */
package collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Marta
 */
public class Exercise1 {

    static final String NO_NAMES = "-";
    Set<String> names = new HashSet();

    public static void main(String[] args) {
        Exercise1 ex = new Exercise1();
        ex.getNamesfromUser();
        ex.printNames();
    }

    public void getNamesfromUser() {

        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imiona: ");

        do {
            name = scanner.next();
            if (!name.equals(NO_NAMES)) {
                names.add(name);
            }
        } while (!name.equals(NO_NAMES));
    }

    public void printNames() {
        System.out.println("Liczba unikalnych imion to: " + names.size());
    }
}
