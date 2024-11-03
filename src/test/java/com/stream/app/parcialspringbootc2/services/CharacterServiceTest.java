package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Course;
import com.stream.app.parcialspringbootc2.services.Impl.CharacterServiceImpl;
import com.stream.app.parcialspringbootc2.services.Impl.CourseServiceImpl;
import com.stream.app.parcialspringbootc2.services.Impl.SeasonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class CharacterServiceTest {

    @Autowired
    CharacterServiceImpl characterService;


    @Test
    void getAllCharacters() {
        for (Character character: characterService.getAllCharacters()){
            System.out.println(character.getId()+"\n"+character.getName()+"\n"+character.getDescription());
        }
    }

    @Test
    void getCharacterById() {

    }

    @Test
    void getCharactersBySeasonId() {
        for (Character character: characterService.getAllCharactersBySeasonId(1L)){
            System.out.println(character.getName());
        }
    }

    @Test
    void save() {
        Character character = new Character();
        character.setId(3);
        character.setName("Monica Geller");
        character.setDescription("Created by David Crane and Marta Kauffman, and portrayed by actress Courteney Cox, Monica appears in all of the show's 236 episodes, from its premiere in 1994, to its finale in 2004. ");
        character.setPhoto("urlejemplo");
        characterService.save(character, 1L);
    }

    @Test
    void update() {


    }

    @Test
    void delete() {

    }
}
