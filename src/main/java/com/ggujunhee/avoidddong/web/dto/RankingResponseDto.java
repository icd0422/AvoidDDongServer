package com.ggujunhee.avoidddong.web.dto;

import com.ggujunhee.avoidddong.domain.ranking.Ranking;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RankingResponseDto {
    private int rank;
    private String name;
    private int score;

    public RankingResponseDto(Ranking ranking) {
        this.name = ranking.getName();
        this.score = ranking.getScore();
    }
}
