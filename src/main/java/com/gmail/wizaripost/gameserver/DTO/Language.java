package com.gmail.wizaripost.gameserver.DTO;

public class Language {
    private String c;
    private String w;

    public Language(String c, String w) {
        this.c = c;
        this.w = w;
    }

    public Language() {
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public String getW() {
        return w;
    }

    public void setW(String w) {
        this.w = w;
    }
}
