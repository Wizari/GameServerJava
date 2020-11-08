
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
    "Id",
    "LineNumber",
    "Score",
    "Amount",
    "Side",
    "WinSymbolId",
    "SymbolsAmount",
    "WinLine"
})
public class WinLine {

    @JsonProperty("Id")
    private Integer id;
    @JsonProperty("LineNumber")
    private Integer lineNumber;
    @JsonProperty("Score")
    private Integer score;
    @JsonProperty("Amount")
    private Integer amount;
    @JsonProperty("Side")
    private Integer side;
    @JsonProperty("WinSymbolId")
    private Integer winSymbolId;
    @JsonProperty("SymbolsAmount")
    private Integer symbolsAmount;
    @JsonProperty("WinLine")
    private List<List<Integer>> winLine = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("Id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("Id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("LineNumber")
    public Integer getLineNumber() {
        return lineNumber;
    }

    @JsonProperty("LineNumber")
    public void setLineNumber(Integer lineNumber) {
        this.lineNumber = lineNumber;
    }

    @JsonProperty("Score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("Score")
    public void setScore(Integer score) {
        this.score = score;
    }

    @JsonProperty("Amount")
    public Integer getAmount() {
        return amount;
    }

    @JsonProperty("Amount")
    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @JsonProperty("Side")
    public Integer getSide() {
        return side;
    }

    @JsonProperty("Side")
    public void setSide(Integer side) {
        this.side = side;
    }

    @JsonProperty("WinSymbolId")
    public Integer getWinSymbolId() {
        return winSymbolId;
    }

    @JsonProperty("WinSymbolId")
    public void setWinSymbolId(Integer winSymbolId) {
        this.winSymbolId = winSymbolId;
    }

    @JsonProperty("SymbolsAmount")
    public Integer getSymbolsAmount() {
        return symbolsAmount;
    }

    @JsonProperty("SymbolsAmount")
    public void setSymbolsAmount(Integer symbolsAmount) {
        this.symbolsAmount = symbolsAmount;
    }

    @JsonProperty("WinLine")
    public List<List<Integer>> getWinLine() {
        return winLine;
    }

    @JsonProperty("WinLine")
    public void setWinLine(List<List<Integer>> winLine) {
        this.winLine = winLine;
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
