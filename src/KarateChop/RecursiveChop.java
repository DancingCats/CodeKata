package KarateChop;

/**
 * Created on 2015-02-13.
 */

class RecursiveChop extends Chop {

    private int[] array;
    int lol;

    private int innerChop (int start, int end) {
        if (start > end)
            return -1;

        int pos = ((start + end) / 2);
        if (lol > array[pos]) return innerChop(pos + 1, end);
        else if (lol < array[pos]) return innerChop(start, pos - 1);
        else return pos;
    }

    @Override
    public int chop(int lol, int[] array) {
        if (array.length != 0) {
            this.array = array;
            this.lol = lol;
            return innerChop(0, array.length - 1);
        } else {
            return -1;
        }
    }
}
