package com.bta.brokeremulator.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bta.brokeremulator.dto.AlphaRequestDto;
import com.bta.brokeremulator.dto.AlphaResponseDto;
import com.bta.brokeremulator.service.AlphaService;

import java.net.URISyntaxException;

@Controller
@RequestMapping("alpha")
public class AlphaController {

    @Autowired
    private AlphaService alphaService;

    @GetMapping("statistics")
    public String getStatisticsRequestView() {
        return "alpha/alpha-request";
    }

    @PostMapping("statistics")                                 ///добавление URISyntaxException
    public ResponseEntity<AlphaResponseDto> getStatistics(
            @ModelAttribute AlphaRequestDto request) throws URISyntaxException {

        final AlphaResponseDto response = alphaService.getStatistics(request);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
