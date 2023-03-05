package week10_Encapsulation.PizzaTask;

public class Pizza {
    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;
    public static String shape;

    static{
        shape = "Circle";
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public static void displayTheShapeOfPizza(){
        System.out.println("Shape of pizza is: "+shape);
    }


    public String getSize(){
        /*
        if(size == null){
            System.err.println("size can not be null");
            System.exit(1);
        }*/
        return size;
    }

    public void setSize(String size){
        boolean valid = size.equalsIgnoreCase("small") ||
                size.equalsIgnoreCase("medium") ||
                size.equalsIgnoreCase("large");
        if(!valid){
            System.err.println("Invalid size: "+ size);
            System.exit(1);
        }

        this.size = size;
    }


    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {

        if(numberOfCheeseTopping <= 0){
            System.err.println("Number of cheese topping can not be negative or zero");
            System.exit(1);
        }

        if(size.equalsIgnoreCase("small")){
            if(numberOfCheeseTopping > 3){
                System.err.println("Number of cheese topping can not be more than three for small sized pizzas");
                System.exit(1);
            }
        } else if (size.equalsIgnoreCase("medium")) {
            if(numberOfCheeseTopping > 4){
                System.err.println("Number of cheese topping can not be more than four for medium sized pizzas");
                System.exit(1);
            }
        }else{
            if(numberOfCheeseTopping > 5){
                System.err.println("Number of cheese topping can not be more than five for large sized pizzas");
                System.exit(1);
            }
        }


        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if(numberOfPepperoniTopping < 0){
            System.err.println("Number of pepperoni toppings can not be negative");
            System.exit(1);
        }


        if(size.equalsIgnoreCase("small")){
            if(numberOfPepperoniTopping > 4){
                System.err.println("Number of pepperoni topping can not be more than four for small sized pizzas");
                System.exit(1);
            }
        } else if (size.equalsIgnoreCase("medium")) {
            if(numberOfPepperoniTopping > 5){
                System.err.println("Number of pepperoni topping can not be more than five for medium sized pizzas");
                System.exit(1);
            }
        }else{
            if(numberOfPepperoniTopping > 6){
                System.err.println("Number of pepperoni topping can not be more than siz for large sized pizzas");
                System.exit(1);
            }
        }


        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public double calcCost(){
        double totalPrice = 0;

        if(size.equalsIgnoreCase("small")){
            totalPrice += 10;
        }else if(size.equalsIgnoreCase("medium")){
            totalPrice += 12;
        }else{
            totalPrice += 14;
        }

        totalPrice += (numberOfCheeseTopping * 1) + (numberOfPepperoniTopping *2);

        return totalPrice;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }

}
