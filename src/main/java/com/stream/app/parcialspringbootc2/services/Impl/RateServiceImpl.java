package com.stream.app.parcialspringbootc2.services.Impl;

import com.stream.app.parcialspringbootc2.entities.Episode;
import com.stream.app.parcialspringbootc2.entities.Rate;
import com.stream.app.parcialspringbootc2.reposities.EpisodeRepository;
import com.stream.app.parcialspringbootc2.reposities.RateRepository;
import com.stream.app.parcialspringbootc2.services.EpisodeService;
import com.stream.app.parcialspringbootc2.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RateServiceImpl implements RateService {

    @Autowired
    private RateRepository rateRepository;
    @Autowired
    private EpisodeServiceImpl episodeService;


    @Override
    public Rate save(Rate rate, Long episodeID) {
        if (rate.getRate()>5 || rate.getRate()<1){
            throw new RuntimeException("Rate not valid");
        }
        Episode episode = episodeService.getEpisodeById(episodeID);
        rate.setEpisode(episode);
        episode.getRates().add(rate);
        return rateRepository.save(rate);
    }
}

