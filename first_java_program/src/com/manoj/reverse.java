package com.manoj;

public class reverse {
    public static void main(String[] args) {
        int num = 5678;
        int rev = 0;
        while (num>0){
            int last = num%10;
            rev = rev*10+last;
            num = num/10;
        }

        System.out.println(rev);

    }


}
