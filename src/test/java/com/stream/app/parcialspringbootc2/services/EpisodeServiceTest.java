package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Episode;
import com.stream.app.parcialspringbootc2.entities.Rate;
import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.services.Impl.EpisodeServiceImpl;
import com.stream.app.parcialspringbootc2.services.Impl.SeasonServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

@SpringBootTest
public class EpisodeServiceTest {

    @Autowired
    EpisodeServiceImpl episodeService;

    @Test
    void getAllEpisodes() {
        for (Episode episode: episodeService.getAllEpisodes()){
            System.out.println(episode.getTitle());
        }
    }


    @Test
    void getAllEpisodesBySeasonID() {
        for (Episode episode: episodeService.getAllEpisodesBySeasonID(1L)){
            System.out.println(episode.getTitle());
            System.out.println("\nRates:");
            for (Rate rate: episode.getRates()){
                System.out.println(rate.getId()+" "+rate.getRate());
            }
            System.out.println("-----------------------");
        }

    }

    @Test
    void save() {
        Episode episode = new Episode();
        episode.setId(2);
        episode.setTitle("The One with the Sonogram at the End");
        episode.setPhoto("url");
        episodeService.save(episode,1L);
    }


}
