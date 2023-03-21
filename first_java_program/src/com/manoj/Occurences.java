package com.manoj;

import java.util.Scanner;

public class Occurences {
    public static void main(String[] args) {
        int num = 1773747;
        int n = 7;
        int count = 0;

        while(num>0){
           int rem = num%10;
           if(rem == n){
               count++;

           }
            num = num/10;

        }
        System.out.println(count);

    }
}
