package week2_Review;

public class Operators {
    public static void main(String[] args) {
        System.out.println(20.0/3); // java ce izbaciti ceo broj-bez decimale, ukoliko iza nekog broja ne stavimo .0

        System.out.println("----------");


        int amount =730;
        int hundreds=amount/100;
        amount%=100; // da izracunamo koliko ostaje posle 700
        int tenth=amount/10; // koliko 10$ ce izbaciti
        amount%=10;


        System.out.println(hundreds);
        System.out.println(amount);
        System.out.println(tenth);
        System.out.println(amount);
    }
}
