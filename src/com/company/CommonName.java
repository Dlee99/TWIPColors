package com.company;
public class CommonName{
    public static String[] CommonName(String s, String[][] colors){
        return Hexadecimal.CommonName(Hexadecimal(s, colors)[0] + Hexadecimal(s, colors)[1] + Hexadecimal(s, colors)[2], colors);
    }
    public static String[] Hexadecimal(String s, String[][] colors){
        for(int i = 0; i < colors[1].length; i++){
            if(colors[0][i].toLowerCase().equals(s)){
                return Hexadecimal.Hexadecimal(colors[1][i]);
            }
        }
        return new String[]{"This name is not an HTML color."};
    }
    public static String[] RGB(String s, String[][] colors){
        return Hexadecimal.RGB(Hexadecimal(s, colors)[0] + Hexadecimal(s, colors)[1] + Hexadecimal(s, colors)[2]);
    }

}
