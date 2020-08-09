package com.ggujunhee.avoidddong.service;

import com.ggujunhee.avoidddong.domain.ranking.RankingRepository;
import com.ggujunhee.avoidddong.web.dto.RankingResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class RankingService {

    private final RankingRepository rankingRepository;

    @Transactional(readOnly = true)
    public List<RankingResponseDto> findAll() {
        List<RankingResponseDto> rankingResponseDtoList = rankingRepository.findAllDesc().stream()
                .map(RankingResponseDto::new)
                .collect(Collectors.toList());

        int rank = 1;
        for (RankingResponseDto rankingResponseDto : rankingResponseDtoList) {
            rankingResponseDto.setRank(rank++);
        }

        return rankingResponseDtoList;
    }

}
