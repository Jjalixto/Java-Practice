package Zoologico2;

public class BatTest {
    
    public static void main(String[] args) {
        
        Bat bat = new Bat(100);

        bat.attackTown();
        bat.attackTown();
        bat.attackTown();
        bat.desiplayEnergy();

        bat.eatHumans();
        bat.eatHumans();
        bat.desiplayEnergy();

        bat.fly();
        bat.fly();
        bat.desiplayEnergy();
    }
}
