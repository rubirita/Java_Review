package week8_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NthLargestNumber {

    public static void main(String[] args) {

        ArrayList <Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,8));
        int n=5; // da bih nasla 5. najveci broj moram da uklonim prva 4 broja

        for (int i = 0; i < n-1; i++) {
            list.removeIf(p->p==Collections.max(list));
        }

        int result=Collections.max(list);
        System.out.println("result = " + result);



        /*
        list.removeIf(p-> p==Collections.max(list));//da je p jednako sa najvecim brojem iz Collectionsa koji je dat

        System.out.println(list);

         */

    }
}
/*
 3. write a program that can return the nth largest number from an arraylist
            ex:
                arraylist = {1,2,3,4,5,6,7,7,8,8}
                n = 5
            output:
                4
 */