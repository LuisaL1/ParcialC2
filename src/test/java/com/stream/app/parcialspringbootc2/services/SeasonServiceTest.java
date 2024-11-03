package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Episode;
import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.services.Impl.SeasonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class SeasonServiceTest {

    @Autowired
    SeasonServiceImpl seasonService;

    @Test
    void getAllSeasons() {
        List<Season> seasons = seasonService.getAllSeasons();
        for (Season season: seasons){
            System.out.println("--------------------------");
            System.out.println(season.getTitle()+" "+season.getAirDate());
            System.out.println("\nEpisodes:");
            for (Episode episode: season.getEpisodes()){
                System.out.println(episode.getTitle());
            }
            System.out.println("\nCharacters:");
            for (Character character: season.getCharacters()){
                System.out.println(character.getName());
            }

        }

    }

    @Test
    void getSeasonById() {

    }

    @Test
    void save() {

    }

    @Test
    void update() {

    }

    @Test
    void delete() {

    }
}
