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
public class Lion extends Mammal implements IWalk, ISwim, IMakeSound{
    String name;
    double bodyTemp = 100.5;

    public Lion(String name) {
        this.name = name;
    }

    @Override
    double getBodyTemp() {
        return bodyTemp;
    }

    @Override
    public void walk() {
        System.out.println(name + " begins to walk forward.");
    }

    @Override
    public void swim() {
        System.out.println(name + " begins to swim.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " growls.");
    }

    @Override
    String getName() {
        return name;
    }
    
}
