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
        try {
            r = Integer.parseInt(RGB[0]);
            g = Integer.parseInt(RGB[1]);
            b = Integer.parseInt(RGB[2]);
        }
        catch(NumberFormatException e){
            IllegalArgumentException t = new IllegalArgumentException("You did not choose the correct format.");
            throw t;
        }
        String R = Hexa(r), G = Hexa(g), B = Hexa(b);
        color[0] = R;
        color[1] = G;
        color[2] = B;
        return color;

    }
    public static String[] CommonName(String s, String[][] colors){
        String hex = Hexadecimal(s)[0] + Hexadecimal(s)[1] + Hexadecimal(s)[2];
        for(int i = 0; i < colors[1].length; i++){
            if(colors[1][i].equals(hex)){
                return new String[]{colors[0][i]};
            }
        }
        return new String[]{"There is no HTML equivalent"};
    }
    public static String Hexa(int r){
        String R = "";
        if(r / 16 < 10){
            R = R + (r / 16);
        }
        else if(r / 16 == 10){
            R = R + "A";
        }
        else if(r / 16 == 11){
            R = R + "B";
        }
        else if(r / 16 == 12){
            R = R + "C";
        }
        else if(r / 16 == 13){
            R = R + "D";
        }
        else if(r / 16 == 14){
            R = R + "E";
        }
        else if(r / 16 == 15){
            R = R + "F";
        }
        r = r - (r / 16 * 16);
        if(r < 10){
            R = R + (r % 16);
        }
        else if(r == 10){
            R = R + "A";
        }
        else if(r == 11){
            R = R + "B";
        }
        else if(r == 12){
            R = R + "C";
        }
        else if(r == 13){
            R = R + "D";
        }
        else if(r == 14){
            R = R + "E";
        }
        else if(r == 15){
            R = R + "F";
        }
        return R;
    }
}
