package week5_review;

public class MethodPractice_RETURN {
    public static void main(String[] args) {

        calculate(10, '-', 30);
        System.out.println(calculate(7,'/', 0));
    }

    public static double calculate(double num1, char mathOperator, double num2) {
        double result = 0;

        switch (mathOperator) {
            case '-':
                result=num1-num2;
                break;
            case '+':
                result=num1+num2;
                break;
            case '*':
                result=num1*num2;
               break;
            case '/':
                result=num1/num2;
                if(num2 != 0 ) {  // num2 is NOT zero
                    System.out.println("Division: " + (num1 / num2));
                }else{ // num2 is zero
                    System.out.println(num1 +" can not be divided by zero");
                }
                break;
            default:
                System.err.println("Invalid Math Operator");
                System.exit(1);// da pokaze u RUN-ovanom delu da postoji problem i pokaze gde je- terminates the whole program. EVERYTHING WILL STOP
        }
        return result;
    }
}
