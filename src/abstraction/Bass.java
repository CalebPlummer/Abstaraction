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
public class Bass extends Fish implements ISwim, IMakeSound{
    boolean isSaltWater;
    String name;

    public Bass(String name, boolean isSaltWater) {
        this.name = name;
        this.isSaltWater = isSaltWater;
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
    public void swim() {
        System.out.println(name + " swims forward.");
    }

    @Override
    public void makeSound() {
        System.out.println(name = " splashes in the water.");
    }
    
}
