package com.bta.brokeremulator.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.List;



@SuperBuilder
@NoArgsConstructor
@Data
public class AlphaResponseDto {
    private String sticker;
    private LocalDate lastRefreshed;
    private List<TradeItemDto> items;
}
