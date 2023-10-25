
package Pokemon;

public class Pokemon {
    private String name;
    private int health;
    private String type;
    private static int count = 0;

    public Pokemon(String name, int health, String type) {
        this.name = name;
        this.health = health;
        this.type = type;
        count++;
    }

    public void attackPokemon(Pokemon pokemon) {
        pokemon.setHealth(pokemon.getHealth() - 10);
        System.out.println(pokemon.getName() + " has been attacked! Health reduced by 10.");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    // Static method to get the count of created Pokemon
    public static int getCount() {
        return count;
    }

    // Method to get info of the Pokemon
    public String pokemonInfo() {
        return "Name: " + name + ", Health: " + health + ", Type: " + type;
    }
}
