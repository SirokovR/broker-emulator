package com.bta.brokeremulator.service.impl;

import com.bta.brokeremulator.dto.AlphaRequestDto;
import com.bta.brokeremulator.dto.AlphaResponseDto;
import com.bta.brokeremulator.service.AlphaService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class AlphaServiceImpl implements AlphaService {
    @Override
    public AlphaResponseDto getStatistics(AlphaRequestDto request) {
        RestTemplate restTemplate = new RestTemplate();
        //PWYPOSRER1FW8HU6
        String url = "https://www.alphavantage.co/query?function=TIME_SERIES_WEEKLY&symbol=NAT&apikey=PWYPOSRER1FW8HU6";
        ResponseEntity<String> responseEntity = restTemplate.getForEntity(url, String.class);
        AlphaResponseDto responseDto = AlphaResponseDto.builder()
                .value(responseEntity.getBody())
                .build();
        return responseDto;
    }
}
