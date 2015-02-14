package KarateChop;

public class Main {

    public static void main(String[] args) {
        Chop recursiveChop = new RecursiveChop();
        Chop iterateChop = new IterateChop();

        recursiveChop.testChop();
        System.out.println("Ok!");
        iterateChop.testChop();
        System.out.println("Ok!");
    }

}
