
package com.gmail.wizaripost.gameserver.DTO.response;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "p",
        "rsp",
        "c",
        "gp",
        "ec",
        "el"
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
    @JsonProperty("ec")
    private String ec;
    @JsonProperty("el")
    private String el;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    public GameParametersResponse() {
    }

    public GameParametersResponse(String ec, String el) {
        this.ec = ec;
        this.el = el;
    }

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

    @JsonProperty("ec")
    public String getEc() {
        return ec;
    }

    @JsonProperty("ec")
    public void setEc(String ec) {
        this.ec = ec;
    }

    @JsonProperty("el")
    public String getEl() {
        return el;
    }

    @JsonProperty("el")
    public void setEl(String el) {
        this.el = el;
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
