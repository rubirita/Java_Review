package week8_review;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        System.out.println(list);

        list.add(10); //
        list.add(10);

        System.out.println(list);


        System.out.println(list.size());

        // 30, 40, 60, 90

        list.addAll( Arrays.asList(30, 40, 60, 90) );

        System.out.println(list);

        // 45 65, 75

        list.addAll(3,  Arrays.asList(45, 65, 75));

        System.out.println(list);


        list.remove(1);

        System.out.println(list);

        // remove: 45, 40, 90

        list.removeAll( Arrays.asList(90, 45, 40) );

        System.out.println(list);


        //list.remove(Integer.valueOf(75));
        // list.remove( new Integer(75) );
        Integer a = 75;
        list.remove(a);

        // list.remove( (Integer) 75);

        System.out.println(list);

        System.out.println("--------------------------------------------------");

        ArrayList<Integer> numbers = new ArrayList<>(list);
        numbers.addAll(Arrays.asList(100, 200, 300, 400, 500));

        System.out.println(numbers);

        // keep the elements 65, 300, 400, and remove the rest

        numbers.retainAll(Arrays.asList(65, 300, 400));

        System.out.println(numbers);

        System.out.println("------------------------------------");

        ArrayList <String> names=new ArrayList<>();

        names.addAll(Arrays.asList("Java","Softskills","Selenium", "Api", "Sql", "Wooden Spoon"));

        System.out.println(names);

        System.out.println(names.get(2).charAt(2));//da dobijemo neki karakter iz Stringa koji zadamo

        System.out.println("-------------------------------------");

        ArrayList <Integer> nums=new ArrayList<>();

        nums.addAll(Arrays.asList(10,20,30,40,50,60,70,80));

        nums.removeIf(p->p<40);

        System.out.println(nums);















    }
}
