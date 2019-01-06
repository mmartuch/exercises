/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise.arrays;

/**
 *
 * @author Marta
 */
public class Arrays {

    private String[] tab;

    public String[] getTab() {
        return tab;
    }

    public static void main(String[] args) {

        Arrays a = new Arrays();
        a.get5alphabetLetters();
        System.out.println(a.get5alphabetLetters());
        System.out.println(a.getTab());
        a.print(a.getTab());
        int[] array = {1, 2, 3};
        a.revertArray(array);

    }

    public String[] get5alphabetLetters() {
        tab = new String[]{"a", "b", "c", "d", "e"};

        return tab;
    }

    public void print(String[] tab) {

        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);

        }

    }

    public int[] revertArray(int[] array) {

        return new int[]{array[2], array[1], array[0]};
    }
}
