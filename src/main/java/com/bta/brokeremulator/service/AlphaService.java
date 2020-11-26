package com.bta.brokeremulator.service;

import com.bta.brokeremulator.dto.AlphaRequestDto;
import com.bta.brokeremulator.dto.AlphaResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.net.URISyntaxException;

public interface AlphaService {
    AlphaResponseDto getStatistics(AlphaRequestDto request) throws URISyntaxException, JsonProcessingException;   //добавлено исключение URISyntaxException
}
