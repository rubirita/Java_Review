package week6_review;

import week4_rewiew.FrequencyOfWord;

public class NestedLoop_FREQUENCY {
    public static void main(String[] args) {

        String word = "abcdeeeekkkkiiii";
        String result="";

        //OVAKO BIH RADILA DA MI TREBA SAMO JEDAN KARAKTER IZ STRING-A
/*
        char karakter='a';
        int count=0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==karakter){
                count++;
            }
        }
        System.out.println(count);

 */

        for (int j = 0; j < word.length(); j++) {
            int count = 0;
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            if (result.contains(""+word.charAt(j))){
                continue;
            }
            result+="" + word.charAt(j) + count;
        }
        System.out.println(result);
    }
}