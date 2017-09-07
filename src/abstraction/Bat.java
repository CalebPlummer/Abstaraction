/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

/**
 *
 * @author cplummer
 */
public class Bat extends Mammal implements IFly, IWalk, ISwim, IMakeSound{
    String name;
    double bodyTemp = 111;

    public Bat(String name) {
        this.name = name;
    }

    @Override
    double getBodyTemp() {
        return bodyTemp;
    }

    @Override
    public void fly() {
        System.out.println(name + " begins to fly.");
    }

    @Override
    public void walk() {
        System.out.println(name + " begins to walk.");
    }

    @Override
    public void swim() {
        System.out.println(name + " begins to swim.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a high pitched screech.");
    }
    
    @Override
    public String getName()
    {
        return name;
    }
    
    
}
