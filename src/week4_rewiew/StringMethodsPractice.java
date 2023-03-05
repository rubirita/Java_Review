package week4_rewiew;

public class StringMethodsPractice {
    public static void main(String[] args) {


        String str = "Cydeo School";
        char ch = str.charAt(1);

        int length = str.length();

        System.out.println(ch);
        System.out.println(length);

        int lastIndexNumber=str.length()-1;
        char ch2=str.charAt((lastIndexNumber));

        System.out.println(ch2);

        int indexofE=str.indexOf('e');
        System.out.println("indexofE = " + indexofE);

        int indexOfFirstO= str.indexOf("o");
        System.out.println("indexOfFirstO = " + indexOfFirstO);

        int indexOfSecondO=str.indexOf("oo");
        System.out.println("indexOfSecondO = " + indexOfSecondO);

        int indexOfThirdO=str.indexOf("ol");
        System.out.println("indexOfThirdO = " + indexOfThirdO);

        System.out.println("-------------------------------------");

        String imeKursa= "BATCH 28";
        imeKursa=imeKursa.toLowerCase();
        System.out.println(imeKursa);

        System.out.println("-------------------------------------");

        String mesto="I live in Naples and I love Naples";
        //mesto=mesto.replaceFirst("Naples", "Novi Sad");
        mesto=mesto.replace("e Naples", "e Sombor");
        System.out.println(mesto);

        String imekursa="Batch 28 students";// da izbaci samo Batch 28
        imekursa=imekursa.substring(0,8);

        System.out.println(imekursa);

        System.out.println("-------------------------------------");

        String name ="muHtar";
        name=name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        //name=(""+name.charAt(0)).toUpperCase()+ name.substring(1).toLowerCase();
        // ovde smo morali da stavimo znake navoda i zagradu okolo kako bismo to prikazali kao String

        System.out.println(name);

        System.out.println("-------------------------------------");

        String answer="yEs";
        System.out.println(answer.equalsIgnoreCase("yes"));

        System.out.println("-------------------------------------");

        // da li recenica sadrzi rec

        String recenica= "Today we will have Java and Soft Skill classes.";
        boolean hasSelenium=recenica.contains("Selenium");
        boolean hasJava=recenica.toLowerCase().contains("java");

        System.out.println("hasJava = " + hasJava);
        System.out.println("hasSelenium = " + hasSelenium);



    }
}
