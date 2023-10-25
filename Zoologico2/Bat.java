package Zoologico2;

public class Bat extends Mammal {
    
    public Bat(int energyLevel) {
        super(energyLevel);
        //todo Auto-generated constructor stub
    }

    public void fly(){
        System.out.println("Sonido que hace al despegar");
        energyLevel -= 50;
    }

    public void eatHumans(){
        System.out.println("bueno, no importa");
        energyLevel += 25; 
    }

    public void attackTown(){
        System.out.println("Sonido de la ciudad en llamas");
        energyLevel -= 100;
    }
}
