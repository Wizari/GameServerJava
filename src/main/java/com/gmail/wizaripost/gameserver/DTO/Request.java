package com.gmail.wizaripost.gameserver.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;




@JsonIgnoreProperties(ignoreUnknown = true)
public class Request {
    private String a;
    private Long b;
    private Long ls;
    private Language l;

    public Request() {
    }

    public Request(String a, Long b, Long ls, Language l) {
        this.a = a;
        this.b = b;
        this.ls = ls;
        this.l = l;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Long getB() {
        return b;
    }

    public void setB(Long b) {
        this.b = b;
    }

    public Long getLs() {
        return ls;
    }

    public void setLs(Long ls) {
        this.ls = ls;
    }

    public Language getL() {
        return l;
    }

    public void setL(Language l) {
        this.l = l;
    }
}
