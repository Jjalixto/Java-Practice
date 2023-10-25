package MaestroObjeto2;

public class Human{
    
    //las propiedades se declaran aqui arriba 
    protected int health;

    public Human(){
        this.health = 100;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

}