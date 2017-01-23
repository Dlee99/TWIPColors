package com.company;
import java.util.Scanner;
public class Main {
    public static String[][] RHC = new String[3][];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a color in RGB, hexadecimal or the common name.");
        System.out.println("Examples for RGB, hexadecimal and common name in order:" +
                "\n138,43,226\t#8A2BE2\tBlueViolet");
        String color = sc.nextLine().toLowerCase();
        System.out.println("Which format did you use?\t(RGB)\t(Hexadecimal)\t(Common)");
        String format = sc.nextLine().toLowerCase();
        if(format.equals("rgb")){
            RHC[0] = RGB.RGB(color);
            for(int i = 0; i < RHC.length; i++){
                System.out.println(RHC[i]);
            }
        }


    }
}
