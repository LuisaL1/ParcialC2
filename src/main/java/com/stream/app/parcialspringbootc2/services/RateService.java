package com.stream.app.parcialspringbootc2.services;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Rate;

import java.util.List;
import java.util.Optional;

public interface RateService {
    Rate save(Rate rate, Long episodeID);

}
