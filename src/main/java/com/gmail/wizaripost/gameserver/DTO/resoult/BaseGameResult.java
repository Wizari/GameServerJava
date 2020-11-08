
package com.gmail.wizaripost.gameserver.DTO.resoult;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "WinLinesAmount",
    "WinLines"
})
public class BaseGameResult {

    @JsonProperty("WinLinesAmount")
    private Integer winLinesAmount;
    @JsonProperty("WinLines")
    private List<WinLine> winLines = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("WinLinesAmount")
    public Integer getWinLinesAmount() {
        return winLinesAmount;
    }

    @JsonProperty("WinLinesAmount")
    public void setWinLinesAmount(Integer winLinesAmount) {
        this.winLinesAmount = winLinesAmount;
    }

    @JsonProperty("WinLines")
    public List<WinLine> getWinLines() {
        return winLines;
    }

    @JsonProperty("WinLines")
    public void setWinLines(List<WinLine> winLines) {
        this.winLines = winLines;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
