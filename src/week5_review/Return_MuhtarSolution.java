package week5_review;

public class Return_MuhtarSolution {
    public static void main(String[] args) {

        double a = calculate(10, '+', 30);

        System.out.println(a);


        System.out.println("---------------------------------------------");

        double multiplication = calculate(10,  '*', 20);

        System.out.println(multiplication);


        System.out.println( calculate(10,  '#', 20 ) );


        System.out.println("Hello World");

        System.out.println("------------------------------------------------------");

        System.out.println("Java".charAt(10000) );



    }

    public static double calculate(double num1, char mathOperator, double num2){
        double result = 0;

        switch (mathOperator){
            case '-':
                // return num1 - num2;
                result = num1 - num2;
                break;

            case '+':
                result = num1 + num2;
                break;
            case '*':
                result = num1 * num2;
                break;

            case '/':
                if(num2 != 0 ) {
                    result = num1 / num2;
                }
                break;

                /*
            default:
                System.err.println("Invalid Operator");
                System.exit(1);  // terminates the whole program. EVERYTHING will stop
                 */

        }

        return result;
    }


}

