package com.stream.app.parcialspringbootc2.services.Impl;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.reposities.CharacterRepository;
import com.stream.app.parcialspringbootc2.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CharacterServiceImpl implements CharacterService {

    @Autowired
    CharacterRepository characterRepository;
    @Autowired
    SeasonServiceImpl seasonService;

    @Override
    public List<Character> getAllCharacters() {
        return characterRepository.findAll();
    }

    @Override
    public List<Character> getAllCharactersBySeasonId(Long seasonId) {
        Season season = seasonService.getSeasonById(seasonId);
        return season.getCharacters();

    }


    @Override
    public Character getCharacterById(Long characterId) {
        Optional<Character> character = characterRepository.findById(String.valueOf(characterId));
        if (character.isPresent()){
            return character.get();
        }
        throw new RuntimeException("Character doesnt exist");
    }


    @Override
    public Character save(Character character, Long seasonID) {
        Season season = seasonService.getSeasonById(seasonID);
        character.getSeasons().add(season);
        season.getCharacters().add(character);
        return characterRepository.save(character);
    }

    @Override
    public Character update(Long id, Character character) {
        return characterRepository.save(character);
    }

    @Override
    public void delete(Long id) {
        Character character = getCharacterById(id);
        characterRepository.delete(character);
    }
}
