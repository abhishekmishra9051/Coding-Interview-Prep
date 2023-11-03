package org.loadthecode.basic;

import java.util.Scanner;

public class String_Palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the  String");
        String string = sc.nextLine();
        StringBuilder sb =new StringBuilder(string);
        sb.reverse();
        String newString = sb.toString();
        if(string.equals(newString))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
        sc.close();
    }
}
