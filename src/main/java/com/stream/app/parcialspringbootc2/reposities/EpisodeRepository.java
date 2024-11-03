package com.stream.app.parcialspringbootc2.reposities;

import com.stream.app.parcialspringbootc2.entities.Episode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EpisodeRepository extends JpaRepository<Episode, Long> {

    @Query("SELECT e FROM Episode e WHERE e.season.id = :seasonId")
    List<Episode> findAllBySeason(@Param("seasonId") Long seasonId);
}

