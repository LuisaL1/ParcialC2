package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Episode;

import java.util.List;
import java.util.Optional;

public interface EpisodeService {
    List<Episode> getAllEpisodes();
    Episode getEpisodeById(Long id);
    List<Episode> getAllEpisodesBySeasonID(Long id);
    Episode save(Episode episode, Long seasonId);
    Episode update(Long id, Episode episodeDetails);
    void delete(Long id);
}

