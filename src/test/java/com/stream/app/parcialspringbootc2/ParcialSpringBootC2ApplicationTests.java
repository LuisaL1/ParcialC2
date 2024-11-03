package com.stream.app.parcialspringbootc2;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Course;
import com.stream.app.parcialspringbootc2.reposities.CharacterRepository;
import com.stream.app.parcialspringbootc2.reposities.CourseRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ParcialSpringBootC2ApplicationTests {

    CharacterRepository characterRepository;

    @Test
    void contextLoads() {
    }


    @Test
    void crearserie(){
        Character character = new Character();
        character.setName("hola");
        characterRepository.save(character);
    }
}
