package com.bta.brokeremulator.dto;


import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;

@Data
@SuperBuilder
@NoArgsConstructor
public class TradeItemDto {


    private LocalDate period;
    private double open;
    private double high;
    private double low;
    private double close;
    private long volume;
}
