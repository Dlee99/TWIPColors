package com.company;

public class Hexadecimal {
    public static String[] RGB(String s){
        String[] hex = Hexadecimal(s);
        String[] RGB = new String[3];
        for(int i = 0; i < 3; i++){
            String h1 = hex[i].substring(0,1);
            String h2 = hex[i].substring(1,2);
            int c1 = 0;
            try{
                c1 = Integer.parseInt(h1) * 16;
            }catch(NumberFormatException e){
                char[] num1 = h1.toCharArray();
                c1 = (55 - (int)num1[0]) * -16;
            }
            try{
                RGB[i] = "" + (c1 + Integer.parseInt(h2));
            }catch(NumberFormatException e){
                char[] num2 = h2.toCharArray();
                RGB[i] = "" + (c1 - (55 - (int)num2[0]));
            }
        }
        return RGB;
    }
    public static String[] Hexadecimal(String s){
        String[] color = new String[3];
        color[0] = s.substring(0,2);
        color[1] = s.substring(2,4);
        color[2] = s.substring(4,6);
        return color;
    }
    public static String[] CommonName(String s, String[][] colors){
        return RGB.CommonName(RGB(s)[0] + "," + RGB(s)[1] + "," + RGB(s)[2], colors);
    }
}
