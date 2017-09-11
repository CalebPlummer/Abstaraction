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
public class Shark extends Fish implements ISwim, IMakeSound{

    public Shark(String name, boolean isSaltWater) {
        super(name, isSaltWater);
    }

    @Override
    public void swim() {
        System.out.println(name + " begins to swim.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " makes a shark noise.");
    }
    
}
