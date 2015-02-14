/**
 * Created by Ja on 2015-02-14.
 */

function assert(condition, message) {
    if (!condition) {
        throw message || "Assertion failed";
    }
}

function IterateChop () {

    if (!(this instanceof IterateChop)) {
        return new IterateChop();
    }

    this.field = "Witam z Javascriptu, proszę zapiąć pasy";

    this.chop = function (needle, haystack) {
        var index = -1;
        if (haystack.length != 0) {
            var start = 0;
            var end = haystack.length - 1;
            var pos;
            var flag = false;

            while (!flag) {
                if (start > end)
                    flag = true;

                pos = Math.floor((start + end) / 2);
                if (needle > haystack[pos]) start = pos + 1;
                else if (needle < haystack[pos]) end = pos - 1;
                else {
                    index = pos;
                    flag = true;
                }
            }
        }
        return index;
    };

    this.testChop = function () {

        print("Lecimy z prędkością światła");

        var testNull = [];
        assert(-1 === this.chop(3, testNull));

        var testSingle = [1];
        assert(-1 === this.chop(3, testSingle));
        assert(0 === this.chop(1, testSingle));

        var tripletArr = [ 1, 3, 5 ];
        assert(0 === this.chop(1, tripletArr));
        assert(1 === this.chop(3, tripletArr));
        assert(2 === this.chop(5, tripletArr));
        assert(-1 === this.chop(0, tripletArr));
        assert(-1 === this.chop(2, tripletArr));
        assert(-1 === this.chop(4, tripletArr));
        assert(-1 === this.chop(6, tripletArr));

        var quadArr = [ 1, 3, 5, 7 ];
        assert(0 === this.chop(1, quadArr));
        assert(1 === this.chop(3, quadArr));
        assert(2 === this.chop(5, quadArr));
        assert(3 === this.chop(7, quadArr));
        assert(-1 === this.chop(0, quadArr));
        assert(-1 === this.chop(2, quadArr));
        assert(-1 === this.chop(4, quadArr));
        assert(-1 === this.chop(6, quadArr));
        assert(-1 === this.chop(8, quadArr));
    };
}