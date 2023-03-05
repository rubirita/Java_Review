package week8_review;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2_firstLastChar {
    public static void main(String[] args) {


        String [] arr= {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"};

        //konvertovanje arraya u arrayList

        ArrayList <String> names=new ArrayList<>(Arrays.asList(arr));

        System.out.println(names);


        names.removeIf(p->p.toLowerCase().charAt(0)==p.charAt(p.toLowerCase().length()-1));//prvo i poslednje slovo da je isto
        names.removeIf(p->(""+p.charAt(0)).equalsIgnoreCase(""+p.charAt(p.length()-1)));//moze i ovako

        System.out.println(names);

        //convertovanje ArrayLista u Array

        arr=names.toArray(new String[0]);
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

        Integer [] numbers=nums.toArray(new Integer[0]);

        System.out.println(Arrays.toString(numbers));

        int [] a1= {10,20,30,40};
        //ArayList<Integer> list=new ArrayList<>(Arrays.asList(a1)); OVO NE MOZE, MOZE SAMO NON PRIMITIVES

        /*
        for (int each : a1){
            list.add(each);
        }

         */

















    }
}
 /*
    2. Write a program that can remove string elements from an arraylist if the firt and last characters of the string are same
            ex:
            list = {"Anna", "Canada", "Bob", "David", "Lan", "Abida", "Ebrahim", "Farida"}
            output:
            ["Canada", "Lan", "Ebrahim", "Farida"]

  */