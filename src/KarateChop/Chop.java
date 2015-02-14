package KarateChop;

/**
 * Created on 2015-02-13.
 */
abstract class Chop {

    public abstract int chop(int lol, int[] array);

    public void testChop() {
        int[] testNull = {};
        assert -1 == chop(3, testNull);

        int[] testSingle = {1};
        assert -1 == chop(3, testSingle);
        assert 0 == chop(1, testSingle);

        int tripletArr[] = { 1, 3, 5 };
        assert 0 == chop(1, tripletArr);
        assert 1 == chop(3, tripletArr);
        assert 2 == chop(5, tripletArr);
        assert -1 == chop(0, tripletArr);
        assert -1 == chop(2, tripletArr);
        assert -1 == chop(4, tripletArr);
        assert -1 == chop(6, tripletArr);

        int quadArr[] = { 1, 3, 5, 7 };
        assert 0 == chop(1, quadArr);
        assert 1 == chop(3, quadArr);
        assert 2 == chop(5, quadArr);
        assert 3 == chop(7, quadArr);
        assert -1 == chop(0, quadArr);
        assert -1 == chop(2, quadArr);
        assert -1 == chop(4, quadArr);
        assert -1 == chop(6, quadArr);
        assert -1 == chop(8, quadArr);
    }
}