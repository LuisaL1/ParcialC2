
package com.stream.app.parcialspringbootc2.controllers;

import com.stream.app.parcialspringbootc2.entities.Character;
import com.stream.app.parcialspringbootc2.entities.Rate;
import com.stream.app.parcialspringbootc2.services.CharacterService;
import com.stream.app.parcialspringbootc2.services.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/rate")
public class RateController {

    @Autowired
    private RateService rateService;


    @PostMapping("/create")
    public Rate createRate(@RequestBody Rate rate, @RequestBody Long episodeId) {
        return rateService.save(rate, episodeId);
    }

}

