
package com.gmail.wizaripost.gameserver.DTO.response;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "c1",
    "c2",
    "c3"
})
public class C {

    @JsonProperty("c1")
    private Double c1;
    @JsonProperty("c2")
    private Double c2;
    @JsonProperty("c3")
    private Double c3;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("c1")
    public Double getC1() {
        return c1;
    }

    @JsonProperty("c1")
    public void setC1(Double c1) {
        this.c1 = c1;
    }

    @JsonProperty("c2")
    public Double getC2() {
        return c2;
    }

    @JsonProperty("c2")
    public void setC2(Double c2) {
        this.c2 = c2;
    }

    @JsonProperty("c3")
    public Double getC3() {
        return c3;
    }

    @JsonProperty("c3")
    public void setC3(Double c3) {
        this.c3 = c3;
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
