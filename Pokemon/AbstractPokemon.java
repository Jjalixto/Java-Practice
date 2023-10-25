package Pokemon;

public abstract class AbstractPokemon implements PokemonInterface {

    @Override
    public Pokemon createPokemon(String name, int health, String type) {
        return new Pokemon(name, health, type);
    }

    @Override
    public String pokemonInfo(Pokemon pokemon) {
        return "Name: " + pokemon.getName() + ", Health: " + pokemon.getHealth() + ", Type: " + pokemon.getType();
    }
}