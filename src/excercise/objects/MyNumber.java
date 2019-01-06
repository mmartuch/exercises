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
public class MyNumber {

    private double number;

    public MyNumber(double number) {
        this.number = number;
    }

    public boolean isOdd() {
        if (number % 2 == 0) {
            return false;
        }
        return true;
    }

    public boolean isEven() {
        return number % 2 == 0;
    }
    
    public double sqrt(){
    return Math.sqrt(number);
    }

  //  public double pow(MyNumber x){
    
  //  }
    
    public static void main(String[] args) {
        MyNumber my = new MyNumber(4);
        System.out.println(my.isOdd());
        System.out.println(my.isEven());
    }
}

