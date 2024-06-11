package br.senai.lab365.futurodev.pokedex.utils;

import br.senai.lab365.futurodev.pokedex.dtos.PokemonCapturadoDTO;
import br.senai.lab365.futurodev.pokedex.dtos.PokemonVistoDTO;
import br.senai.lab365.futurodev.pokedex.models.Pokemon;

public class PokemonMapping {

    public static Pokemon dtoToModel(PokemonVistoDTO dto) {
        Pokemon model = new Pokemon();

        model.setNumero(dto.getNumero());
        model.setNome(dto.getNome());
        model.setImagem(dto.getImagem());
        model.setArea(dto.getArea());

        return model;
    }

    public static Pokemon dtoToModel(PokemonCapturadoDTO dto) {
        Pokemon model = new Pokemon();

        model.setNumero(dto.getNumero());
        model.setNome(dto.getNome());
        model.setDescricao(dto.getDescricao());
        model.setImagem(dto.getImagem());
        model.setTipo(dto.getTipo());
        model.setCategoria(dto.getCategoria());
        model.setArea(dto.getArea());
        model.setAltura(dto.getAltura());
        model.setPeso(dto.getPeso());

        return model;
    }
}
