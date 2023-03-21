package com.manoj;

import java.util.Scanner;

public class Alphabet_case_check {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println(ch + " is lowercase");
        }
        else{
            System.out.println(ch + " is uppercase");
        }
    }
}
