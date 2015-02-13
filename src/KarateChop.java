abstract class Chop {

    public abstract int chop(int lol, int[] array);

    public void testChop() {
        int[] testNull = {};
        assert(-1 == chop(3, testNull));

        int[] testSingle = {1};
        assert(-1 == chop(3, testSingle));
        assert(0 == chop(1, testSingle));

        int tripletArr[] = { 1, 3, 5 };
        assert(0 == chop(1, tripletArr));
        assert(1 == chop(3, tripletArr));
        assert(2 == chop(5, tripletArr));
        assert(-1 == chop(0, tripletArr));
        assert(-1 == chop(2, tripletArr));
        assert(-1 == chop(4, tripletArr));
        assert(-1 == chop(6, tripletArr));

        int quadArr[] = { 1, 3, 5, 7 };
        assert(0 == chop(1, quadArr));
        assert(1 == chop(3, quadArr));
        assert(2 == chop(5, quadArr));
        assert(3 == chop(7, quadArr));
        assert(-1 == chop(0, quadArr));
        assert(-1 == chop(2, quadArr));
        assert(-1 == chop(4, quadArr));
        assert(-1 == chop(6, quadArr));
        assert(-1 == chop(8, quadArr));
    }
}

class RecursiveChop extends Chop {

    private int[] array;
    int lol;

    private int innerChop (int start, int end) {
        int pos = (start + end) / 2;
        if (lol > array[pos]) return innerChop(start + pos, end);
        else if (lol < array[pos]) return innerChop(start, end - pos);
        else if (lol == array[pos]) return pos;
        else return -1;
    }

    @Override
    public int chop(int lol, int[] array) {
        this.array = array;
        this.lol = lol;
        return innerChop(0, array.length - 1);
    }
}


public class KarateChop {

    public static void main(String[] args) {
        Chop chop = new RecursiveChop();
        chop.testChop();
        System.out.println("ok!");
    }

}
