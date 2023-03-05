package week7_review;

import java.util.Arrays;

public class MergeTwoArrays {
    public static void main(String[] args) {

        String [] arr1={"Jelena", "Bojana", "Dina", "Vesna"};
        String [] arr2={"Erhad", "Nenad", "Milan", "Nemanja"};

        String [] arr3=new String[arr1.length + arr2.length];
        int k=0;

        for (int i = 0; i < arr1.length; i++, k++) {
            arr3[k]=arr1[i];
        }

        for (int i = 0; i < arr2.length; i++, k++) {
            arr3[k]=arr2[i];

        }
        System.out.println(Arrays.toString(arr3));

        }

    }
