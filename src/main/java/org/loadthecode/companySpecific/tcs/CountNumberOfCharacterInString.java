package org.loadthecode.companySpecific.tcs;

public class CountNumberOfCharacterInString {
    public static void main(String[] args){
        String str = "abc, def , ghi";
        int count =0;
        String speicalCharacter =" ";
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && str.charAt(i) != ',')
                count++;
//            else
//                speicalCharacter = speicalCharacter+str.charAt(i);
        }
        System.out.println(count);
        System.out.println(speicalCharacter);
    }
}
