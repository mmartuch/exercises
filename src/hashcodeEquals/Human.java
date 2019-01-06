/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashcodeEquals;

/**
 *
 * @author Marta
 */
public class Human {
    
    private int pesel;
    private String imie;
    private String nazwisko;

    public Human(int pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Human{" + "pesel=" + pesel + ", imie=" + imie + ", nazwisko=" + nazwisko + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.pesel;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Human other = (Human) obj;
        if (this.pesel != other.pesel) {
            return false;
        }
        return true;
    }

 
    
    
    public static void main(String[] args) {
    
        Human human1 = new Human(123,"Jurek", "Ogorek");
        Human human2 = new Human(122, "Jurek", "Ogorek");
        Human human3 = new Human (123,"Jurek", "Ogorek");
        
        System.out.println(human1.hashCode());
        System.out.println(human2.hashCode());
        System.out.println(human3.hashCode());
        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human1 + "==" + human2 + ":"+ human1.equals(human2));
        System.out.println(human1 + "==" + human3 + ":"+ human1.equals(human3));
        System.out.println(human2 + "==" + human3 + ":"+ human2.equals(human3));
        
        System.out.println("test == test: " + (new String("test") == new String("test")));
        System.out.println("test equals test: " + new String("test").equals(new String("test")));
    }
    
}
