package com.stream.app.parcialspringbootc2.reposities;

import com.stream.app.parcialspringbootc2.entities.Season;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeasonRepository extends JpaRepository<Season, Long> {
}
