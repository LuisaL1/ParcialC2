package com.stream.app.parcialspringbootc2.services.Impl;

import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.reposities.SeasonRepository;
import com.stream.app.parcialspringbootc2.services.SeasonService;
import jakarta.transaction.Transactional;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@NoArgsConstructor
@Service
public class SeasonServiceImpl implements SeasonService {

    @Autowired
    private SeasonRepository seasonRepository;

    @Override
    public List<Season> getAllSeasons() {

        return seasonRepository.findAll();
    }

    @Override
    public Season getSeasonById(Long id) {
        Optional<Season> season = seasonRepository.findById(id);
        if (season.isPresent()){
            return season.get();
        }
        throw new RuntimeException("Season doesnt exist");
    }

    @Override
    public Season save(Season season) {
        return seasonRepository.save(season);
    }

    @Override
    public Season update(Long id, Season seasonDetails) throws Exception {
        Season season = getSeasonById(id);
        season.setTitle(seasonDetails.getTitle());
        season.setNumber(seasonDetails.getNumber());
        season.setAirDate(seasonDetails.getAirDate());
        return seasonRepository.save(season);
    }

    @Override
    public void delete(Long id) {
        seasonRepository.deleteById(id);
    }
}

