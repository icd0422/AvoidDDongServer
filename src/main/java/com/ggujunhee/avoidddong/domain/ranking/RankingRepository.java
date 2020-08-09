package com.ggujunhee.avoidddong.domain.ranking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RankingRepository extends JpaRepository<Ranking, Long> {

    @Query("SELECT r FROM Ranking r ORDER BY r.score DESC")
    List<Ranking> findAllDesc();
}
