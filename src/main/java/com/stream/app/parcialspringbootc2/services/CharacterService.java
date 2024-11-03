package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterService {
    List<Character> getAllCharacters();
    List<Character> getAllCharactersBySeasonId(Long seasonId);
    Character getCharacterById(Long characterId);
    Character save(Character character, Long seasonID);
    Character update(Long id, Character character);
    void delete(Long id);
}
