package Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Pokedex extends AbstractPokemon {

       // Aquí podrías agregar código para listar los nombres de todos los Pokemons que tienes en la Pokedex
    private List<Pokemon> myPokemons = new ArrayList<>();
    @Override
    public void listPokemon() {
        System.out.println("List of all Pokemons:");
        for (Pokemon pokemon : myPokemons) {
            System.out.println(pokemon.getName());
        }
    }

    // Method to add Pokemon to the Pokedex
    public void addPokemon(Pokemon pokemon) {
        myPokemons.add(pokemon);
    }

    // Method to get the total number of Pokemons in the Pokedex
    public int getTotalPokemons() {
        return myPokemons.size();
    }
}
