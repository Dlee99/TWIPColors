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
        if(r % 16 < 10){
            R = R + (r % 16);
        }
        else if(r % 16 = 10){
            R = R + ¨A¨;
        }
        else if(r % 16 = 11){
            R = R + ¨B¨;
        }
        else if(r % 16 = 12){
            R = R + ¨C¨;
        }
        else if(r % 16 = 13){
            R = R + ¨D¨;
        }
        else if(r % 16 = 14){
            R = R + ¨E¨;
        }
        r = r - (r % 16 * 16);
        G = R + (g % 16);
        g = g - (g % 16 * 16)

    }
}
