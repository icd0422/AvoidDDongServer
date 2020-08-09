package com.ggujunhee.avoidddong.domain.ranking;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Ranking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false)
    private String name;

    private int score;

    @Builder
    public Ranking(String name, int score) {
        this.name = name;
        this.score = score;
    }
}
