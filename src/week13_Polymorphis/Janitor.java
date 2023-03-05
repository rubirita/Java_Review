package week13_Polymorphis;

public class Janitor extends Employee{
    public Janitor(String name, int age, char gender, String id, double salary) {
        super(name, age, gender, id, "Janitor", salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() +" "+getName() +" is cleaning");
    }
}
