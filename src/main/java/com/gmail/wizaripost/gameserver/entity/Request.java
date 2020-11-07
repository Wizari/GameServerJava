package com.gmail.wizaripost.gameserver.entity;

public class Request {
    private String a;
    private Long b;
    private Long ls;

    public Request(String a, Long b, Long ls) {
        this.a = a;
        this.b = b;
        this.ls = ls;
    }

    public Request() {
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
}
