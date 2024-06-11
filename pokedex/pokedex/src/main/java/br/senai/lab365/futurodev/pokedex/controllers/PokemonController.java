package br.senai.lab365.futurodev.pokedex.controllers;

import br.senai.lab365.futurodev.pokedex.dtos.PokemonCapturadoDTO;
import br.senai.lab365.futurodev.pokedex.dtos.PokemonVistoDTO;
import br.senai.lab365.futurodev.pokedex.models.Pokemon;
import br.senai.lab365.futurodev.pokedex.services.PokemonService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    private PokemonService pokemonService;

    public PokemonController(PokemonService pokemonService) {
        this.pokemonService = pokemonService;
    }

    @PostMapping("/visto")
    public ResponseEntity<Void> cadastraVisto(@Valid @RequestBody PokemonVistoDTO pokemonVistoDTO) {
        pokemonService.cadastraVisto(pokemonVistoDTO);

        return ResponseEntity.created(URI.create(String.format("/%d", pokemonVistoDTO.getNumero()))).build();
    }

    @PostMapping("/capturado")
    public ResponseEntity<Void> cadastraCapturado(@Valid @RequestBody PokemonCapturadoDTO pokemonCapturadoDTO) {
        pokemonService.cadastraCapturado(pokemonCapturadoDTO);

        return ResponseEntity.created(URI.create(String.format("/%d", pokemonCapturadoDTO.getNumero()))).build();
    }

/*
    @GetMapping("/{number}")
    public ResponseEntity<Pokemon> buscaPokemon() {

    }
*/

}
