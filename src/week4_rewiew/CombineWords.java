package week4_rewiew;

import java.util.Scanner;

public class CombineWords {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        System.out.println("Enter your first word");
        String s1=input.next();

        System.out.println("Enter your second woord");
        String s2= input.next();

        if (s1.charAt(s1.length()-1)==s2.charAt(0)){// da li je poslednji karakter prve reci isto sto i prvi karakter druge reci
            System.out.println(s1+s2.substring(1));// pocinje od drugog karaktera
        }else{
            System.out.println(s1+s2);
        }

    }
}
/*
6. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight

 */