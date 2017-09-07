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
public class Penguin extends Bird implements IWalk, ISwim, IMakeSound{
    
    private String name;
    private int Wingspan = 30;

    public Penguin(String name) {
        this.name = name;
    }

    int getWingspan() {
        return Wingspan;
    }

    String getName() {
        return name;
    }

    @Override
    public void walk() {
        System.out.println(name + " walks forward.");
    }

    @Override
    public void swim() {
        System.out.println(name + " goes for a swim.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a cawk.");
    }
    
}
