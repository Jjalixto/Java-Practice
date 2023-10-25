package MaestroObjeto2;

public class Ninja extends Human{
    
    private int stealth;

    public Ninja(){
        this.stealth = 10;
    }

    public void steal(Human human){
        int stolenHealth =  this.stealth;
        human.setHealth(human.getHealth() - stolenHealth);
        this.health += stolenHealth;
        System.out.println("Ninja "+ stolenHealth + " points of health");
    }

    public void runAway(){
        this.health -= 0;
        System.out.println("Se le resto 10 points of ninja");
    }
}
