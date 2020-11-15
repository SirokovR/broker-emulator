package com.bta.brokeremulator.service;

import com.bta.brokeremulator.dto.AlphaRequestDto;
import com.bta.brokeremulator.dto.AlphaResponseDto;

import java.net.URISyntaxException;

public interface AlphaService {
    AlphaResponseDto getStatistics(AlphaRequestDto request) throws URISyntaxException;   //добавлено исключение URISyntaxException
}
