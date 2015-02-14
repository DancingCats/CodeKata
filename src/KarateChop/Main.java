package KarateChop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Chop> chops = new ArrayList<>();
        chops.add(new RecursiveChop());
        chops.add(new IterateChop());
        chops.add(new Iterate2Chop());

        for (Chop chop: chops) {
            chop.testChop();
        }
        System.out.print("Ok!");
    }

}
