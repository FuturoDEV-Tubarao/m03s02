package br.senai.lab365.futurodev.pokedex.utils;

import br.senai.lab365.futurodev.pokedex.dtos.PokemonAtualizadoDTO;
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

  public static Pokemon dtoToModel(PokemonAtualizadoDTO dto) {
    Pokemon model = new Pokemon();

    model.setNumero(dto.getNumero());
    model.setNome(dto.getNome());
    if (dto.getDescricao() != null) model.setDescricao(dto.getDescricao());
    model.setImagem(dto.getImagem());
    if (dto.getTipo() != null) model.setTipo(dto.getTipo());
    if (dto.getCategoria() != null) model.setCategoria(dto.getCategoria());
    model.setArea(dto.getArea());
    if (dto.getAltura() != null) model.setAltura(dto.getAltura());
    if (dto.getPeso() != null) model.setPeso(dto.getPeso());
    model.setCapturado(dto.getCapturado());

    return model;
  }
}
