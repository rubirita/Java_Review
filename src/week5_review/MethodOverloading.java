package week5_review;

public class MethodOverloading {
    public static void main(String[] args) {

        System.out.println(reverse("Cydeo"));
    }

    public static String reverse(String word){
        String result="";
        for (int i = word.length()-1; i >=0 ; i--) {
            result+=word.charAt(i);
        }
        return result;
    }
}
