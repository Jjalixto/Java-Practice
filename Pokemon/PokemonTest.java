package Pokemon;

public class PokemonTest {
    
    public static void main(String[] args) {
        Pokemon pikachu = new Pokemon("Pikachu", 100, "Electric");
        Pokemon bulbasaur = new Pokemon("Bulbasaur", 80, "Grass/Poison");

        pikachu.attackPokemon(bulbasaur);
        System.out.println(bulbasaur.pokemonInfo());
        
        Pokedex pokedex = new Pokedex();

        pokedex.addPokemon(pikachu);
        pokedex.addPokemon(bulbasaur);

        pokedex.listPokemon();

        // Probar el método para obtener el total de Pokemons en la Pokedex
        System.out.println("Total number of Pokemons in the Pokedex: " + pokedex.getTotalPokemons());
    }
}
