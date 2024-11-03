
package com.stream.app.parcialspringbootc2.controllers;

import com.stream.app.parcialspringbootc2.entities.Season;
import com.stream.app.parcialspringbootc2.services.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/seasons")
public class SeasonController {

    @Autowired
    private SeasonService seasonService;

    @GetMapping("/all")
    public List<Season> getAllSeasons() {
        return seasonService.getAllSeasons();
    }

    @GetMapping("/{id}")
    public Season getSeasonById(@PathVariable Long id) {
        return seasonService.getSeasonById(id);
    }

    @PostMapping("/create")
    public Season createSeason(@RequestBody Season season) {
        return seasonService.save(season);
    }

    @PutMapping("/update/{id}")
    public Season updateSeason(@PathVariable Long id, @RequestBody Season seasonDetails) throws Exception {
        return seasonService.update(id, seasonDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSeason(@PathVariable Long id) {
        seasonService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

