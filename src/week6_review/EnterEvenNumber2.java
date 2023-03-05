package week6_review;

import java.util.Scanner;

public class EnterEvenNumber2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number=0;

       /* while (){
            System.out.println("Enter a number:");
            number=input.nextInt();
        }

        */

        do {
            System.out.println("Enter a number:");
            number=input.nextInt();
        }while (number%2!=0);

        System.out.println(number + " is even number");

        input.close();
    }
}
