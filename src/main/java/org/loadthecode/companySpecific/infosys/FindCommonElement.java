package org.loadthecode.companySpecific.infosys;

public class FindCommonElement {
    public static void main(String[] args){
        int arr1[] = {80,10, 15, 2, 35, 60};
        int arr2[] = {35, 80, 60, 20, 75};
        for(int i = 0; i<arr1.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(arr1[i] == arr2[j]){
                    System.out.print(arr1[i]+ " ");
                }
            }
        }

    }
}
