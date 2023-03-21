package com.manoj;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter the temp in C :");
        float tempc = input.nextFloat();
        float tempf = (tempc * 9/5) + 32;
        System.out.println(tempf);
    }
}
