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
public class Ostrich extends Bird implements IWalk, ISwim, IMakeSound{


    public Ostrich(String name, int Wingspan) {
        super(name, Wingspan);
    }

    @Override
    public void walk() {
        System.out.println(name + " walks forward.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " cawks.");
    }
    
}
