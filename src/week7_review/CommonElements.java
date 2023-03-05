package week7_review;

public class CommonElements {
    public static void main(String[] args) {

        String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
        String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};



       for (String element:arr1){// svaki element iz prvog arraya
           for (String each: arr2){ // each element iz drugog arraya
               if (each.equals(element)){ // ako je element iz prvog arraya unutar drugog arraya

                   System.out.println(element);
               }
           }

       }



    }
}
  /*  Write a program that can display the common elements from two arrays of string

            Ex:
                    String[] arr1 = {"Python", "Java", "C#", "Wooden Spoon", "Swift"};
                    String[] arr2 = {"Selenium", "SQL", "Java", "API", "Jenkins", "Wooden Spoon"};

                    Output:
                    Java
                    Wooden Spoon

   */
