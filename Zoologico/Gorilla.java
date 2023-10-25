package Zoologico;

public class Gorilla extends Mammal {

    public Gorilla(int energyLevel) {
        super(energyLevel);
        // todo Auto-generated constructor stub
    }
    
    public void throwSomething(){
        System.out.println("El gorila a lanzado algo");
        energyLevel -= 5;
    }

    public void eatBananas(){
        System.out.println("El gorila esta satisfecho");
        energyLevel += 10;
    }

    public void climb(){
        System.out.println("El gorila he trepado a la cima de un arbol");
        energyLevel -= 10;
    }
    
}
