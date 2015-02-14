package KarateChop;

/**
 * Created on 2015-02-14.
 */
public class Iterate2Chop extends Chop {
    @Override
    public int chop(int lol, int[] array) {
        int start = 0;
        int end = array.length - 1;
        int pos;

        while (start < end) {
            pos = ((start + end) / 2);
            if (pos >= end) break;
            if (lol > array[pos]) start = pos + 1;
            else end = pos;
        }

        if (start == end && array[start] == lol)
            return start;
        return -1;
    }
}
