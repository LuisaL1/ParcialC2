package com.stream.app.parcialspringbootc2.entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "characters")
@Getter
@Setter
@NoArgsConstructor
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;
    private String photo;
    private String description;

    @ManyToMany(mappedBy = "characters", fetch = FetchType.EAGER)
    private List<Season> seasons = new ArrayList<>();


}
