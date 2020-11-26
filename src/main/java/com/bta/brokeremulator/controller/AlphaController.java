package com.bta.brokeremulator.controller;


import com.bta.brokeremulator.dto.AlphaResponseDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bta.brokeremulator.dto.AlphaRequestDto;
import com.bta.brokeremulator.service.AlphaService;
import org.springframework.web.servlet.ModelAndView;

import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

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
    public ModelAndView showStatistics(
            @ModelAttribute AlphaRequestDto request) throws URISyntaxException, JsonProcessingException {

        final AlphaResponseDto responseDto = alphaService.getStatistics(request);

        Map<String, Object> params = new HashMap<>();
        params.put("tradeItems", responseDto.getItems());
        /*params.put("sticker",responseDto.getSticker());
        params.put("lastRefreshed",responseDto.getLastRefreshed());*/
        params.put("price", responseDto.getItems().get(0).getClose());

        return new ModelAndView("alpha/statistics", params);
    }
}
