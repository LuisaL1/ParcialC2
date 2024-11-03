package com.stream.app.parcialspringbootc2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@Entity
@Table(name = "rates")
@Getter
@Setter
@NoArgsConstructor
public class Rate {
    @jakarta.persistence.Id
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_episode")
    private Episode episode;

    private Float rate; //del 1 al 5

}
