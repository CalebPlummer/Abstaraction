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
public abstract class Animal {
    public String name;
    public Animal(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }

    @Override
    public String toString() {
        return getName();
    }
    
    
}
