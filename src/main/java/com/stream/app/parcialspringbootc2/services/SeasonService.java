package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Season;

import java.util.List;
import java.util.Optional;

public interface SeasonService {
    List<Season> getAllSeasons();
    Season getSeasonById(Long id);
    Season save(Season season);
    Season update(Long id, Season seasonDetails) throws Exception;
    void delete(Long id);
}
