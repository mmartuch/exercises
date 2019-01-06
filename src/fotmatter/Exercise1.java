/*
Plik CSV zawiera trzy kolumny oddzielone znakiem ,. Pierwsza kolumna zawiera imię, druga liczbę zmiennoprzecinkową 
trzecia dzień tygodnia. Twoim zadaniem jest wczytanie zawartości tego pliku i wyświetlenie jej w formie tabeli.
 */
package fotmatter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Marta
 */
public class Exercise1 {

    public static void main(String[] args) throws IOException {

        String filePath = "C:\\java_cwiczenia\\test.txt";

        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));

            while (true) {
                String text = fileReader.readLine();

                if (text == null) {
                    break;
                }
                String[] columns = text.split(",");
                System.out.format("| %1$10s | %2$10.3f | %3$12s | %n", columns[0], Float.valueOf(columns[1]), columns[2]);
            }

        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }

    }

}
