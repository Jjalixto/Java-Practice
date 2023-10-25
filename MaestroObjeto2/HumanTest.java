 package MaestroObjeto2;

public class HumanTest {
    public static void main(String[] args) {
        
        Wizard wizard = new Wizard();
        Ninja ninja = new Ninja();
        Samurai samurai1 = new Samurai();
        Samurai samurai2 = new Samurai();

        System.out.println("Salud inicial " + wizard.getHealth());
        System.out.println("Salud inicial " + ninja.getHealth());
        System.out.println("Salud inicial " + samurai1.getHealth());
        System.out.println("Salud inicial " + samurai2.getHealth());
        
        wizard.heal(samurai1);
        ninja.steal(wizard);
        samurai1.deathBlow(ninja);
        samurai2.meditate();

        System.out.println("Salud finally " + wizard.getHealth());
        System.out.println("Salud finally " + ninja.getHealth());
        System.out.println("Salud finally " + samurai1.getHealth());
        System.out.println("Salud finally " + samurai2.getHealth());

        System.out.println("Number of samurai instances "+ Samurai.howMany());
    }
}
