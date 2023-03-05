package week6_review;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String word="XXXXYYYYZZZZ";
        String result="";

        for (int i = 0; i < word.length(); i++) {
            if (result.contains("" + word.charAt(i))){
                continue; //da skipuje i onda nastavi da proverava dalje
            }
            result+= word.charAt(i);


        }
        System.out.println(result);
    }
}
