
package com.gmail.wizaripost.gameserver.DTO.resoult;

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
    "p",
    "rsp",
    "c",
    "gp"
})
public class GameParametersResponse {

    @JsonProperty("p")
    private String p;
    @JsonProperty("rsp")
    private Rsp rsp;
    @JsonProperty("c")
    private C c;
    @JsonProperty("gp")
    private String gp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("p")
    public String getP() {
        return p;
    }

    @JsonProperty("p")
    public void setP(String p) {
        this.p = p;
    }

    @JsonProperty("rsp")
    public Rsp getRsp() {
        return rsp;
    }

    @JsonProperty("rsp")
    public void setRsp(Rsp rsp) {
        this.rsp = rsp;
    }

    @JsonProperty("c")
    public C getC() {
        return c;
    }

    @JsonProperty("c")
    public void setC(C c) {
        this.c = c;
    }

    @JsonProperty("gp")
    public String getGp() {
        return gp;
    }

    @JsonProperty("gp")
    public void setGp(String gp) {
        this.gp = gp;
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
