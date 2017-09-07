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
public class Dolphin extends Mammal implements ISwim, IMakeSound{
    double bodyTemp = 96.8;
    String name;

    public Dolphin(String name) {
        this.name = name;
    }

    @Override
    double getBodyTemp() {
        return bodyTemp;
    }

    @Override
    public void swim() {
        System.out.println(name + " swims forward.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a cooing sound.");
    }

    @Override
    String getName() {
        return name;
    }
}
