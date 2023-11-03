package org.loadthecode.companySpecific.tcs;

public class FromStringRemoveSpecialCharacter {
    public static void main(String[]args){
        String str = "Abhishek_Mishra@1#2$3%4^5&6*7*8(9)0";
        int count = 0;
        String specialCharacter = "" ;
        String specialCharacterRemoved = " ";
        for(int i=0; i<str.length(); i++){
            if(!Character.isDigit(str.charAt(i))
                    && !Character.isLetter(str.charAt(i))
                    && !Character.isWhitespace(str.charAt(i))){
                count++;
                specialCharacter = specialCharacter + str.charAt(i);
            }else {
                specialCharacterRemoved = specialCharacterRemoved + str.charAt(i);
            }
        }
        if(count == 0 ){
            System.out.println(" Special Chareacter is not present ");
        }else{
            System.out.println("Special Character is present" + count);
        }
        System.out.println("Special Chracter "+specialCharacter);
        System.out.println("Special Character is Removed "+specialCharacterRemoved);
    }

}

