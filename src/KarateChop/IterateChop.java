package KarateChop;

/**
 * Created on 2015-02-14.
 */
public class IterateChop extends Chop{

    @Override
    public int chop(int lol, int[] array) {
        int index = -1;
        if (array.length != 0) {
            int start = 0;
            int end = array.length - 1;
            int pos;
            boolean flag = false;

            while (!flag) {
                if (start > end)
                    flag = true;

                pos = ((start + end) / 2);
                if (lol > array[pos]) start = pos + 1;
                else if (lol < array[pos]) end = pos - 1;
                else {
                    index = pos;
                    flag = true;
                }
            }
        }
        return index;
    }
}
