// SeasonController.java
package com.stream.app.parcialspringbootc2.controllers;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.services.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/characters")
public class CharacterController {

    @Autowired
    private CharacterService characterService;

    @GetMapping("/all")
    public List<Character> getAllCharacters() {
        return characterService.getAllCharacters();
    }

    @GetMapping("/all/season/{id}")
    public List<Character> getAllCharacterBySeasonId(@PathVariable Long id) {
        return characterService.getAllCharactersBySeasonId(id);
    }

    @GetMapping("/{id}")
    public Character getCharacter(@PathVariable Long id) {
        return characterService.getCharacterById(id);
    }

    @PostMapping("/create")
    public Character createCharacter(@RequestBody Character character, @RequestBody Long seasonId) {
        return characterService.save(character, seasonId);
    }

    @PutMapping("/update/{id}")
    public Character updateCharacter(@PathVariable Long id, @RequestBody Character characterDetails) throws Exception {
        return characterService.update(id,characterDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSeason(@PathVariable Long id) {
        characterService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

