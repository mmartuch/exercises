/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cwiczenie;

/**
 *
 * @author Marta
 */
public class Cwiczenie {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] tab = {1,2,3};
        Cwiczenie cz = new Cwiczenie();
        System.out.println(cz.maxLiczba(tab));
        
    }
    
    int maxLiczba(int[] tab) {
    int liczba = Math.max(tab[0], Math.max(tab[1], tab[2]));
    return liczba;
    }
}
