/*
Napisz program, który pobierze od użytkownika ścieżkę do pliku i wyświetli zawartość pliku na ekranie
wraz z informacją ile linii znajduje się w pliku.
 */
package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Exercise2 {

    public static void main(String[] args) throws IOException {

        String filePath;
        String line;
        int lineNumber = 0;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Podaj ścieżkę do pliku: ");
        filePath = inputScanner.nextLine();

        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));

            while (true) {
                line = fileReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
                lineNumber++;

            }
            System.out.println(lineNumber);
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }
    }

}
