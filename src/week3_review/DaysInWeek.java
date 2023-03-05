package week3_review;

public class DaysInWeek {
    public static void main(String[] args) {
        int day=1;
        String result="";

        switch (day){
            case 1: result="Monday";
                break;
            case 2: result="Utorak";
                break;
            case 3: result="Sreda";
                break;
            case 4: result="Cetvrtak";
                break;
            case 5: result="Petak";
            break;
            case 6: result="Subota";
            break;
            case 7: result="Nedelja";
            break;
            default:
                if (day<1){
                    result= "Minimum day number can not be less than 1";
                }else{
                    result="Maximum day number can not be greater than 7";
                }
        }
        System.out.println(result);
    }
}
