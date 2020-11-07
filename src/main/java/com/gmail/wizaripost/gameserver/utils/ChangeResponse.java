package com.gmail.wizaripost.gameserver.utils;

public class ChangeResponse {

    public String changeCredits(String string, String find, double credits) {
        int indexM = string.indexOf(find);
        int first = indexM + 5;
        int last = string.indexOf(",", first);
//        String s = string.substring(first, last);
//        System.out.println(s);
//        Double d = Double.valueOf(s);
//        System.out.println(d);
//        double dd = d;
//        dd += credits;
//        System.out.printf("%.2f\n", dd);
//        String s1 = toString("%.2f\n", credits);
        String s1 = String.format("%.2f\n", credits);
        System.out.println(s1);

        return string.substring(0, first) + String.format("%.2f\n", credits)+ string.substring(last + 1);
    }
}
