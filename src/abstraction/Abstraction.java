/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstraction;

import java.util.ArrayList;;

/**
 *
 * @author cplummer
 */
public class Abstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Birds
        Ostrich ostrich = new Ostrich("AG", 79);
        Penguin penguin = new Penguin("Aiden", 30);
        Eagle eagle = new Eagle("Tyler", 89);
        //Mammals
        Dolphin dolphin = new Dolphin("Parker", 96.8);
        Lion lion = new Lion("John", 100.5);
        Bat bat = new Bat("Zach", 111);
        //Fish
        Shark shark = new Shark("Mr. Geiger", true);
        Bass bass = new Bass("Caleb", true);
        Flying_Fish flyingFish = new Flying_Fish("Blake", true);
        
        //Animal List
        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(ostrich);
        animals.add(penguin);
        animals.add(eagle);
        animals.add(dolphin);
        animals.add(lion);
        animals.add(bat);
        animals.add(shark);
        animals.add(bass);
        animals.add(flyingFish);
        
        
        //Birds
        ArrayList<Bird> birds = new ArrayList<>();
        birds.add(ostrich);
        birds.add(penguin);
        birds.add(eagle);
        
        //Mammals
        ArrayList<Mammal> mammals = new ArrayList<>();
        mammals.add(dolphin);
        mammals.add(lion);
        mammals.add(bat);
        
        //Fishes
        ArrayList<Fish> fish = new ArrayList<>();
        fish.add(shark);
        fish.add(bass);
        fish.add(flyingFish);
        
        //Flyers
        ArrayList<IFly> flyers = new ArrayList<>();
        flyers.add(eagle);
        flyers.add(bat);
        flyers.add(flyingFish);
        
        //Walkers
        ArrayList<IWalk> walkers = new ArrayList<>();
        walkers.add(eagle);
        walkers.add(bat);
        walkers.add(lion);
        walkers.add(penguin);
        walkers.add(ostrich);
        
        //Swimmers
        ArrayList<ISwim> swimmers = new ArrayList<>();
        swimmers.add(ostrich);
        swimmers.add(penguin);
        swimmers.add(eagle);
        swimmers.add(dolphin);
        swimmers.add(lion);
        swimmers.add(bat);
        swimmers.add(shark);
        swimmers.add(bass);
        swimmers.add(flyingFish);
        
        //Sound makers
        ArrayList<IMakeSound> soundMakers = new ArrayList<>();
        soundMakers.add(ostrich);
        soundMakers.add(penguin);
        soundMakers.add(eagle);
        soundMakers.add(dolphin);
        soundMakers.add(lion);
        soundMakers.add(bat);
        soundMakers.add(shark);
        soundMakers.add(bass);
        soundMakers.add(flyingFish);
        
        //Outputs animal names by their associated abstract class.
        System.out.println("All animal names: " + animals);
        System.out.println("All bird names: " + birds);
        System.out.println("All fish names: " + fish);
        System.out.println("All mammal names: " + mammals);
        System.out.println("");
        
        //For-each loops that run through the lists and interfaces calling the methods associated.
        for(IWalk loop: walkers)
        {
            loop.walk();
        }
        System.out.println("");
        for(IFly loop: flyers)
        {
            loop.fly();
        }
        System.out.println("");
        for(ISwim loop: swimmers)
        {
            loop.swim();
        }
        System.out.println("");
        for(IMakeSound loop: soundMakers)
        {
            loop.makeSound();
        }
        System.out.println("");

    }
    
}
