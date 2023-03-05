package week6_review;

public class NestedLoop_Timer {

    public static void main(String[] args) throws InterruptedException {


        for (int m = 4; m >= 0 ; m--) {

            for (int s = 59; s >= 0; s--) {
                System.out.println(m +" minutes "+ s +" seconds" );
                Thread.sleep(100);// mili sekunda, da otklonim error kod ovog reda idem na crvenu lamicu i dodace kod main metoda throws InterruptedException
            }

        }


    }
}
