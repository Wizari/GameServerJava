
package com.gmail.wizaripost.gameserver.DTO.response;

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
    "result",
    "ReelStrips",
    "TotalScore",
    "SpinResult",
    "Reels",
    "AdvancedReels",
    "BaseGameResult",
    "SelectedBetPerLine",
    "SelectedLinesAmount",
    "p"
})
public class Rsp {

    @JsonProperty("result")
    private Boolean result;
    @JsonProperty("ReelStrips")
    private List<List<Integer>> reelStrips = null;
    @JsonProperty("TotalScore")
    private Integer totalScore;
    @JsonProperty("SpinResult")
    private Integer spinResult;
    @JsonProperty("Reels")
    private List<List<Integer>> reels = null;
    @JsonProperty("AdvancedReels")
    private List<List<Integer>> advancedReels = null;
    @JsonProperty("BaseGameResult")
    private BaseGameResult baseGameResult;
    @JsonProperty("SelectedBetPerLine")
    private Integer selectedBetPerLine;
    @JsonProperty("SelectedLinesAmount")
    private Integer selectedLinesAmount;
    @JsonProperty("p")
    private String p;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("result")
    public Boolean getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Boolean result) {
        this.result = result;
    }

    @JsonProperty("ReelStrips")
    public List<List<Integer>> getReelStrips() {
        return reelStrips;
    }

    @JsonProperty("ReelStrips")
    public void setReelStrips(List<List<Integer>> reelStrips) {
        this.reelStrips = reelStrips;
    }

    @JsonProperty("TotalScore")
    public Integer getTotalScore() {
        return totalScore;
    }

    @JsonProperty("TotalScore")
    public void setTotalScore(Integer totalScore) {
        this.totalScore = totalScore;
    }

    @JsonProperty("SpinResult")
    public Integer getSpinResult() {
        return spinResult;
    }

    @JsonProperty("SpinResult")
    public void setSpinResult(Integer spinResult) {
        this.spinResult = spinResult;
    }

    @JsonProperty("Reels")
    public List<List<Integer>> getReels() {
        return reels;
    }

    @JsonProperty("Reels")
    public void setReels(List<List<Integer>> reels) {
        this.reels = reels;
    }

    @JsonProperty("AdvancedReels")
    public List<List<Integer>> getAdvancedReels() {
        return advancedReels;
    }

    @JsonProperty("AdvancedReels")
    public void setAdvancedReels(List<List<Integer>> advancedReels) {
        this.advancedReels = advancedReels;
    }

    @JsonProperty("BaseGameResult")
    public BaseGameResult getBaseGameResult() {
        return baseGameResult;
    }

    @JsonProperty("BaseGameResult")
    public void setBaseGameResult(BaseGameResult baseGameResult) {
        this.baseGameResult = baseGameResult;
    }

    @JsonProperty("SelectedBetPerLine")
    public Integer getSelectedBetPerLine() {
        return selectedBetPerLine;
    }

    @JsonProperty("SelectedBetPerLine")
    public void setSelectedBetPerLine(Integer selectedBetPerLine) {
        this.selectedBetPerLine = selectedBetPerLine;
    }

    @JsonProperty("SelectedLinesAmount")
    public Integer getSelectedLinesAmount() {
        return selectedLinesAmount;
    }

    @JsonProperty("SelectedLinesAmount")
    public void setSelectedLinesAmount(Integer selectedLinesAmount) {
        this.selectedLinesAmount = selectedLinesAmount;
    }

    @JsonProperty("p")
    public String getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(String p) {
        this.p = p;
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
