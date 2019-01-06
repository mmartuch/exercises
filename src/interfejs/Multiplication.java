/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfejs;

/**
 *
 * @author Marta
 */
public class Multiplication implements Computation{

    @Override
    public double compute(double argument1, double argument2) {
        return argument1*argument2;
    };
    
    
    
}
