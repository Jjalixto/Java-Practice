package MaestroObjeto2;

public class Wizard extends Human{

    private int intelligence;

    public Wizard(){
        this.health = 50;
        this.intelligence = 8;
    }

    public void heal(Human human){
        human.setHealth(human.getHealth() + this.intelligence);
        System.out.println("Wizard heal is " + this.intelligence + " points");
    }

    public void fireBall(Human human){
        int damage = this.intelligence *3;
        human.setHealth(human.getHealth() - damage);
        System.out.println("Wizard attack " + damage);
    }
}

