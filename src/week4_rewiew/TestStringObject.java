package week4_rewiew;

import java.util.Scanner;

public class TestStringObject {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        String str=new String("Java");// nova memorija se otvori u Heap

        String str1="Java";

        System.out.println(str.equals(str1)); // kao sto je u brojevima == u Stringu je .equal

        String rec1="Jelena";
        String rec2="Jelena";
        System.out.println(rec2==rec1);// u ovom slucaju ce izbaciti true zato sto su oba literal



    }
}
