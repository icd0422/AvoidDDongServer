package com.ggujunhee.avoidddong.domain.ranking;

import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RankingRepositoryTest {

    @Autowired
    private RankingRepository rankingRepository;

    @After
    public void cleanup() {
        rankingRepository.deleteAll();
    }

    @Test
    public void 랭킹저장_불러오기() {
        //given
        String name = "장준희";
        int score = 1123;

        rankingRepository.save(Ranking.builder()
                .name(name)
                .score(score)
                .build());

        //when
        List<Ranking> rankingList = rankingRepository.findAll();

        //then
        Ranking ranking = rankingList.get(0);
        assertThat(ranking.getName()).isEqualTo(name);
        assertThat(ranking.getScore()).isEqualTo(score);
    }
}