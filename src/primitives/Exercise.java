/*
 * Napisz program, który policzy średnią z kilku przedmiotów. 
Możemy założyć, że uczeń w szkole ma 3 przedmioty i z każdego z nich dostał po 4 oceny.
 */
package primitives;

import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Exercise {

    private int numberOfClasses;
    private int numberOfNotes;
    private int[][] notes;

    public Exercise(int numberOfClasses, int numberOfNotes) {
        this.numberOfClasses = numberOfClasses;
        this.numberOfNotes = numberOfNotes;
        initializeNotes();
    }

    public void getNotes() {

        Scanner inputScanner = new Scanner(System.in);
        for (int i = 0; i < numberOfClasses; i++) {
            for (int j = 0; j < numberOfNotes; j++) {
                System.out.println("Wprowadz ocene: " + (j + 1) + " dla przedmiotu: " + (i + 1));
                notes[i][j] = inputScanner.nextInt();
            }

        }

    }

    public void averangeNote() {

        float averange = 0;
        float totalAverange = 0;
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                //int sum = 0;
                averange += notes[i][j];
            }
            averange /= numberOfNotes;
            System.out.println("Srednia ocen dla przedmiotu " + (i + 1) + "wynosi: " + averange);
            totalAverange += averange;
        }
        totalAverange /= numberOfClasses;
        System.out.println("Srednia ocen dla wszystkich przedmitów wynosi: " + totalAverange);
    }

    public static void main(String[] args) {

        int numberOfClasses = 3;
        int numberOfNotes = 4;
        Exercise ex = new Exercise(numberOfClasses, numberOfNotes);
        ex.getNotes();
        ex.averangeNote();

    }

    private void initializeNotes() {
        notes = new int[numberOfClasses][numberOfNotes];
    }

}
