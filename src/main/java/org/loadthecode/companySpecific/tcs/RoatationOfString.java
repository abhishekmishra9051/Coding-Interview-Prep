package org.loadthecode.companySpecific.tcs;

public class RoatationOfString {
    public static void main(String[]args){
        String str1 = "WXYZ";
        String str2 = "YZWX";
        if(isRoatation(str1,str2))
            System.out.println("There is roatation present");
        else
            System.out.println("Not present");
    }
    public static boolean isRoatation(String str1, String str2){
        return (str1.length() == str2.length()) && ((str1+str1).indexOf(str2) != -1);
    }
}

