/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package petle;

/**
 *
 * @author Marta
 */
public class Excercise1 {
    
     public static void main(String[] args) {
       short shortValue = 1;
        int intValue = Integer.MAX_VALUE;
        long longValue = 2;
        float floatValue = 3.1F;
        double doubleValue = 4.1;

        System.out.println(intValue + doubleValue);
        System.out.println(intValue + floatValue);
        System.out.println(intValue + longValue);
        System.out.println(intValue + shortValue);
         System.out.println(Integer.MAX_VALUE);
         
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }
}
