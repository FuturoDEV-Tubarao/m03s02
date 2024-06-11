package br.senai.lab365.futurodev.pokedex.services;

import br.senai.lab365.futurodev.pokedex.dtos.PokemonCapturadoDTO;
import br.senai.lab365.futurodev.pokedex.dtos.PokemonVistoDTO;
import br.senai.lab365.futurodev.pokedex.models.Pokemon;
import br.senai.lab365.futurodev.pokedex.repositories.PokemonRepository;
import br.senai.lab365.futurodev.pokedex.utils.PokemonMapping;
import org.springframework.stereotype.Service;

@Service
public class PokemonService {

    private final PokemonRepository repository;

    public PokemonService(PokemonRepository repository) {
        this.repository = repository;
    }

    public void cadastraVisto(PokemonVistoDTO pokemonVistoDTO) {
        Pokemon pokemonVisto = PokemonMapping.dtoToModel(pokemonVistoDTO);

        // TODO: validar se já existe registro com o mesmo numero. caso sim, retornar status 401
        repository.save(pokemonVisto);
    }

    public void cadastraCapturado(PokemonCapturadoDTO pokemonCapturadoDTO) {
        Pokemon pokemonCapturado = PokemonMapping.dtoToModel(pokemonCapturadoDTO);
        pokemonCapturado.setCapturado(true);

        repository.save(pokemonCapturado);
    }
}
