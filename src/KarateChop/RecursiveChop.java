package KarateChop;

/**
 * Created on 2015-02-13.
 */

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
