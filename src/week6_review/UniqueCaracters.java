package week6_review;

public class UniqueCaracters {
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
            if (count==1){
                result+=word.charAt(j);
            }
            }
        System.out.println(result);
        }

    }

