package org.loadthecode.companySpecific.infosys;

import java.util.HashSet;
import java.util.Set;

public class InterSection {
    public static void main(String[] args){
        int[] arr1 = {80,10, 15, 2, 35, 60};
        int arr2[] = {35, 80, 60, 20, 75};
        commanElement(arr1,arr2);
        System.out.println("");
        union(arr1,arr2);
    }
    public static void commanElement(int arr1[], int arr2[]){
        Set newSet = new HashSet<>();
        for(int i=0; i<arr1.length; i++){
            newSet.add(arr1[i]);
        }
        for(int i=0; i< arr2.length; i++){
            if(newSet.contains(arr2[i]))
                System.out.print(arr2[i]+ " ");
        }
    }

    public static void union(int arr1[], int arr2[]){
        Set set = new HashSet<>();
        int i;
        for( i=0; i<arr1.length; i++){
            set.add(arr1[i]);
        }
        for( i=0; i<arr2.length; i++){
            set.add(arr2[i]);
        }
        System.out.println("It's union");
        System.out.println(set);
    }

}

