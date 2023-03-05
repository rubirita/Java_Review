package week2_Review;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        int c=20;
        boolean a_isMedian= a>c && a<b || a<c && b<a;
        boolean b_isMedian= a>b && b>c || c>b && b>a;
        boolean c_isMedian= !a_isMedian&&!b_isMedian;


        if (a_isMedian){
            System.out.println(a + " is the median number");
        }
        if (b_isMedian){
            System.out.println(b + " is median number");
        }
        if (c_isMedian){
            System.out.println(c + " is median number");
        }

    }

}
//calculate median number