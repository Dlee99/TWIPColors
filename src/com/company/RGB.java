package com.company;

public class RGB {
    public static String[] RGB(String s){
        String[] color = s.split("\\s*,\\s*");
        return color;
    }
    public static String[] Hexadecimal(String s){
        String[] color = new String[3];
        String[] RGB = RGB(s);
        int r, g, b;
        r = Integer.parseInt(RGB[0]);
        g = Integer.parseInt(RGB[1]);
        b = Integer.parseInt(RGB[2]);
        String R = "", G = "", B = "";
        R = R + (r % 16);
        r = r - r % 16;

    }
}
