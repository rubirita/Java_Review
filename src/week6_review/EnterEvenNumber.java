package week6_review;

import java.util.Scanner;

public class EnterEvenNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter an even number:");
        int number=input.nextInt();

       while (number%2!=0){
           System.out.println(number + " is not even number, please try again");
           number=input.nextInt();



       }
        System.out.println("Even number: " + number);

       input.close();

    }
}
// Write a program that asks user to enter even number UNTIL user enters a valid input
