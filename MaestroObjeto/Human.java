package MaestroObjeto;

public class Human{
    
    //las propiedades se declaran aqui arriba 
    private int strength;
    private int intelligence;
    private int stealth;
    private int health;

    public Human(){
        this.strength = 3;
        this.intelligence = 3;
        this.stealth = 3;
        this.health = 100;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void Attack(Human target){
        int damage = this.strength;
        target.takeDamage(damage);
    }

    private void takeDamage(int damage) {
        this.health -= damage;
        if(this.health < 0){
            this.health = 0;
        }
    }
}