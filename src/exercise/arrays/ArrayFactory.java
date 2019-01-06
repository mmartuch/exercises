/*
 *Napisz klasę ArrayFactory, która w konstruktorze pobierze liczbę całkowitą X większą od zera. Klasa powinna mieć 2 metody:
int[] oneDimension - zwróci instancję tablicy jednowymiarowej o długości X,
int[][] twoDimension - zwróci instację tablicy dwuwymiarowej gdzie liczba wierszy i liczba kolumn równa się X,
 */
package exercise.arrays;

/**
 *
 * @author Marta
 */
public class ArrayFactory {

    private int size;

    public ArrayFactory(int size) {
        this.size = size;
    }

    public int[] oneDimension(int size) {
        return new int[size];
    }

    public int[][] twoDimension(int size) {
        return new int[size][size];
    }

    public int[][] twoDimensionLong(int size) {
        int[][] array = new int[size][];

        for (int i = 0; i < size; i++) {
            array[i] = new int[size];
        }

        return array;
    }

    public int[][] macierzJednostkowa(int size) {
        int[][] array = new int[size][];
        for (int i = 0; i < size; i++) {
//for(){}

        }

        return array;
    }

}
