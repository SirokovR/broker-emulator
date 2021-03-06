
package com.bta.brokeremulator.dto.json;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

import java.util.Map;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "Meta Data",
    "Weekly Time Series"
})
public class AlphaResponseJson {

    @JsonProperty("Meta Data")
    private MetaDataJson metaData;


    @JsonProperty("Weekly Time Series")
    private Map<String, Map<String,String>> weeklyTimeSeries;



}
