/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excercise.objects;

/**
 *
 * @author Marta
 */
public class Human {

    private int age;
    private int weight;
    private double height;
    private String name;
    private boolean isMale;

    public Human(int age, int weight, String name, boolean isMale) {
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getName() {
        return name;
    }

    public boolean isIsMale() {
        return isMale;
    }

    
    
   

}
