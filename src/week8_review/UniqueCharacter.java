package week8_review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacter {
    public static void main(String[] args) {

        String str="aaabccccdeeef";

        //str.split(""); da svaki element Stringa prebaci u pojedinacni karakter

        ArrayList <String> list=new ArrayList<>(Arrays.asList(str.split("")));

        System.out.println(list);

        list.removeIf(p-> Collections.frequency(list,p)>1); // da ukloni elemente koji se pojavljuju vise od jednog puta


    }
}
/*
  4. Write a program that can return the unique characters from a string

            DO NOT use:
                for loop, for each loop, while loop, do while loop
 */