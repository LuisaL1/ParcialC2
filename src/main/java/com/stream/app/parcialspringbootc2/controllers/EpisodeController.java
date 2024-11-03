package com.stream.app.parcialspringbootc2.controllers;

import com.stream.app.parcialspringbootc2.entities.Episode;
import com.stream.app.parcialspringbootc2.services.EpisodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/episodes")
public class EpisodeController {

    @Autowired
    private EpisodeService episodeService;

    @GetMapping("/all")
    public List<Episode> getAllEpisodes() {
        return episodeService.getAllEpisodes();
    }

    @GetMapping("/{id}")
    public Episode getEpisodeById(@PathVariable Long id) {
        return episodeService.getEpisodeById(id);
    }

    @PostMapping("/create")
    public Episode createEpisode(@RequestBody Episode episode, @RequestBody Long seasonId) {
        return episodeService.save(episode,seasonId);
    }

    @PutMapping("/update/{id}")
    public Episode updateEpisode(@PathVariable Long id, @RequestBody Episode episodeDetails) throws Exception {
        return episodeService.update(id, episodeDetails);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteSeason(@PathVariable Long id) {
        episodeService.delete(id);
        return ResponseEntity.noContent().build();
    }
}

