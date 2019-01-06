/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku tekstowego oraz kilka linijek tekstu (dopóki użytkownik 
nie wprowadzi „-” jako linijki) i zapisze je do pliku tekstowego. 
Do wykonania tego zadania może Ci się przydać metoda System.lineSeparator() zwracająca znak nowej linii 
(jeśli chciałbyś oddzielić linie wprowadzone przez użytkownika).
 */
package files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Excercise1 {

    public static void main(String[] args) throws IOException {

        String filePath;
        FileWriter fileWriter = null;
        Scanner inputScanner = new Scanner(System.in);
        String text;

        System.out.println("Podaj ściężkę do pliku: ");

        try {
            filePath = inputScanner.nextLine();

            System.out.println("Wpisz tekst do pliku: ");

            while (true) {
                text = inputScanner.nextLine();
                if (inputScanner.nextLine().equals("-")) {
                    break;
                }
            }

            fileWriter = new FileWriter(filePath);
            fileWriter.write(text);
            fileWriter.write(System.lineSeparator());
        } finally {
            if (fileWriter != null) {
                fileWriter.close();
            }
        }

    }

}
