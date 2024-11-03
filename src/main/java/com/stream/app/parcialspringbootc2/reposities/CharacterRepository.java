package com.stream.app.parcialspringbootc2.reposities;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.stream.app.parcialspringbootc2.entities.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, String> {

}
