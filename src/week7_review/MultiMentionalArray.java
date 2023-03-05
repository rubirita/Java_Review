package week7_review;

import java.util.Arrays;

public class MultiMentionalArray {
    public static void main(String[] args) {
        String [] row1={"Java", "SQL", "HTML", "CSS", "Python"};
        String [] row2={"Selenium", "API", "Genkin"};
        String [] row3={"Cydeo", "Wooden Spoon", "Batch 28"};

        String [][] allrows={row1, row2, row3};

        System.out.println(Arrays.deepToString(allrows));

    }
}
