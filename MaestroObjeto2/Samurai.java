package MaestroObjeto2;

public class Samurai extends Human{
    
    public static int numberOfSamurais = 0;

    public Samurai(){
        this.health = 200;
        numberOfSamurais++;
    }

    public void deathBlow(Human human){
        human.setHealth(0);
        this.health /= 2;
        System.out.println("Samurai performancea death");
    }

    public void meditate(){
        int healingPoints = this.health /2;
        this.health += healingPoints;
        System.out.println("Samurai meditate and reganien "+ healingPoints);
    }

    public static int howMany(){
        return numberOfSamurais;
    }
}
