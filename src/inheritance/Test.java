/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author Marta
 */
public class Test {
    
    public static void main(String[] args) {
        Animal human = new Human();
        Animal fish = new Goldfish();

        System.out.println(human);
        System.out.println(fish);
    }
    
}
