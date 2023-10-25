package MaestroObjeto;

public class HumanTest {
    public static void main(String[] args) {
        
        Human human1 = new Human();
        Human human2 = new Human();

        System.out.println("Atributos del primer humano:");
        System.out.println("Fuerza: " + human1.getStrength());
        System.out.println("Sigilo: " + human1.getStealth());
        System.out.println("Inteligencia: " + human1.getIntelligence());
        System.out.println("Salud: " + human1.getHealth());


        System.out.println("Atributos del segundo humano:");
        System.out.println("Fuerza: " + human2.getStrength());
        System.out.println("Sigilo: " + human2.getStealth());
        System.out.println("Inteligencia: " + human2.getIntelligence());
        System.out.println("Salud: " + human2.getHealth());


        human1.Attack(human2);
        System.out.println();
        System.out.println("Salud del segundo humano después del ataque: " + human2.getHealth());
    }
}
