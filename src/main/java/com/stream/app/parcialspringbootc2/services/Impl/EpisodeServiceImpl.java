package com.stream.app.parcialspringbootc2.services.Impl;

import com.stream.app.parcialspringbootc2.entities.Episode;
import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.reposities.EpisodeRepository;
import com.stream.app.parcialspringbootc2.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodeServiceImpl implements EpisodeService {

    @Autowired
    private EpisodeRepository episodeRepository;
    @Autowired
    private SeasonServiceImpl seasonService;

    @Override
    public List<Episode> getAllEpisodes() {
        return episodeRepository.findAll();
    }

    @Override
    public Episode getEpisodeById(Long id) {
        Optional<Episode> episode = episodeRepository.findById(id);
        if (episode.isPresent()){
            return episode.get();
        }
        throw new RuntimeException("Episode doesnt exist");
    }

    @Override
    public List<Episode> getAllEpisodesBySeasonID(Long id) {
        return episodeRepository.findAllBySeason(id);
    }

    @Override
    public Episode save(Episode episode, Long seasonId) {
        Season season = seasonService.getSeasonById(seasonId);
        episode.setSeason(season);
        season.getEpisodes().add(episode);
        return episodeRepository.save(episode);
    }

    @Override
    public Episode update(Long id, Episode episodeDetails) {
        Episode episode = getEpisodeById(id);
        episode.setTitle(episodeDetails.getTitle());
        episode.setPhoto(episode.getPhoto());
        return episodeRepository.save(episode);
    }

    @Override
    public void delete(Long id) {
        episodeRepository.deleteById(id);
    }
}

