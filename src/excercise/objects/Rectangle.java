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
public class Rectangle {

    private double hight;
    private double width;

    public Rectangle(double hight, double width) {
        this.hight = hight;
        this.width = width;
    }

    public double getHight() {
        return hight;
    }

    public double getWidth() {
        return width;
    }

    public double getField() {
        return hight * width;
    }

    public double getArea() {
        return 2 * hight + 2 * width;
    }

    public double getDiagonal() {
        return Math.sqrt(hight * hight + width * width);
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(2,2);
        System.out.println(r.getDiagonal());
        System.out.println(r.getArea());
    }
    
}
