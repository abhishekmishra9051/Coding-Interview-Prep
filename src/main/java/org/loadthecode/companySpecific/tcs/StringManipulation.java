package org.loadthecode.companySpecific.tcs;

public class StringManipulation {
    public static void oppositeConversition(StringBuffer str){
        int len = str.length();
        for(int i=0; i<len; i++){
            Character ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                char toUpperCase =(char) (ch -32);
                str.setCharAt(i,toUpperCase);
//                str.setCharAt(i,Character.toUpperCase(ch));
            }
            else{
                char toLowerCase = (char)(ch + 32);
                str.setCharAt(i,toLowerCase);
//                str.setCharAt(i,Character.toLowerCase(ch));

            }
        }
        System.out.println(str);
    }
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer("AbhishekMishra");
        oppositeConversition(sb);
    }
}