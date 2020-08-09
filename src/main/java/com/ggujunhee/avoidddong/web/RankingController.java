package com.ggujunhee.avoidddong.web;

import com.ggujunhee.avoidddong.service.RankingService;
import com.ggujunhee.avoidddong.web.dto.RankingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class RankingController {

    private final RankingService rankingService;

    @GetMapping("/api/v1/rankings")
    public List<RankingResponseDto> findAll() {
        return rankingService.findAll();
    }

}
