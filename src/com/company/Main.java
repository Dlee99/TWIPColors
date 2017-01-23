package com.company;
import java.util.*;
import java.io.*;
public class Main {
    public static String[][] RHC = new String[3][];
    public static void main(String[] args) throws java.io.IOException, NumberFormatException{
        BufferedReader colors = new BufferedReader(new FileReader("Colors.txt"));
        String[][] Colors = new String[2][140];
        for(int u = 0; u < 140; u++){
            String s = colors.readLine();
            String[] ind = s.split("-#");
            Colors[0][u] = ind[0];
            Colors[1][u] = ind[1];
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a color in RGB, hexadecimal or the common name.");
        System.out.println("Examples for RGB, hexadecimal and common name in order:" +
                "\n138,43,226\t\t#8A2BE2\t\tBlueViolet");
        String color = sc.nextLine();
        System.out.println("Which format did you use?\t(RGB)\t(Hexadecimal)\t(Common)");
        String format = sc.nextLine().toLowerCase();
        boolean common = false;
        if(format.equals("rgb")){
            color = color.toLowerCase();
            RHC[0] = RGB.RGB(color);
            RHC[1] = RGB.Hexadecimal(color);
            RHC[2] = RGB.CommonName(color, Colors);
        }
        else if(format.equals("hexadecimal")){
            String[] hexythingy = color.split("#");
            color = hexythingy[hexythingy.length - 1];
            RHC[0] = Hexadecimal.RGB(color);
            RHC[1] = Hexadecimal.Hexadecimal(color);
            RHC[2] = Hexadecimal.CommonName(color, Colors);
        }
        else if(format.equals("common")){
            for(int i = 0; i < Colors[1].length; i++){
                if(Colors[0][i].toLowerCase().equals(color)){
                    common = true;
                }
            }
            if(common) {
                color = color.toLowerCase();
                RHC[0] = CommonName.RGB(color, Colors);
                RHC[1] = CommonName.Hexadecimal(color, Colors);
                RHC[2] = CommonName.CommonName(color, Colors);
            }
            else{
                IllegalArgumentException e = new IllegalArgumentException("This name is not an HTML color.");
                throw e;

            }
        }
        else{
            IllegalArgumentException e = new IllegalArgumentException("You did not input a proper format.");
            throw e;
        }
        System.out.print("RGB:\t\t\t");
        System.out.println(RHC[0][0] + "," + RHC[0][1] + "," + RHC[0][2]);
        System.out.print("Hexadecimal:\t");
        System.out.println("#" + RHC[1][0] + RHC[1][1] + RHC[1][2]);
        System.out.print("Common Name:\t");
        System.out.println(RHC[2][0]);

    }
}
