/*
 * Napisz program, który będzie pobierał od użytkownika imiona par dopóki nie wprowadzi imienia „-”,
następnie poproś użytkownika o podanie jednego z wcześniej wprowadzonych imion i wyświetl imię odpowiadającego mu partnera.
 */
package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Marta
 */
public class Exercise2 {
    
    public static void main(String[] args) {
        
        Map<String, String> pairs = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String name1, name2;
        
        while (true) {            
            System.out.println("Podaj imię partnerki: ");
            name1 = sc.next();
            if (name1.equals("-")) {
                break;
            }
            
            System.out.println("Podaj imię partnera: ");
            name2 = sc.next();
            if (name2.equals("-")) {
                break;
            }
            
            pairs.put(name1, name2);
        }
        
        System.out.println("Podaj imię partnerki, żeby sprawdzić imię jej partnera: ");
        name1 = sc.next();
        System.out.println("Partnerem " + name1 + " jest: " + pairs.get(name1));
    }
    
}
