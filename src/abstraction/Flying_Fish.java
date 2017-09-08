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
public class Flying_Fish extends Fish implements IFly, ISwim, IMakeSound{
    boolean isSaltWater = true;
    String name;
    
    public Flying_Fish(String name)
    {
        this.name = name;
    }

    @Override
    String getWaterType() {
        if(isSaltWater)
        {
            return "salt water";
        }
        else
        {
            return "fresh water";
        }
    }

    @Override
    String getName() {
        return name;
    }

    @Override
    public void fly() {
        System.out.println(name + " begins to fly.");
    }

    @Override
    public void swim() {
        System.out.println(name + " swims forward.");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " splashes in the water.");
    }
}
