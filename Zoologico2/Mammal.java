package Zoologico2;

public class Mammal{
    
    protected  int energyLevel;


    public Mammal(int energyLevel){
        this.energyLevel = energyLevel;
    }

    public int desiplayEnergy(){
        System.out.println("Nivel de energia " + energyLevel);
        return energyLevel;
    }

}
