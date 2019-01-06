/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples.equals;

/**
 *
 * @author Marta
 */
public class Testowa {
    
    public static void main(String[] args) {
        
       // Base s = new Sub();
       Sub s = new Sub();
        System.out.println(s.i);
        System.out.println(s.j);
        s.method1();
        s.method2();
        System.out.println(Sub.j);
        Base b = (Base)s;
        b.method1();
    }
    
}
