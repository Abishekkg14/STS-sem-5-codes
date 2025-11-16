import java.util.*;

class LongestSequence {

    int findLongest(int n) {
        if (~n == 0) return 32;  // all bits are 1

        int previous = 0;
        int current = 0;
        int best = 1;            // flipping one 0 gives at least 1

        while (n != 0) {

            if ((n & 1) == 1) {
                current++;       // extend current streak of 1s
            } else {
                // zero found → check if next bit is 1
                if ((n & 2) != 0) {
                    previous = current;  // connectable
                } else {
                    previous = 0;        // cannot connect
                }
                current = 0;
            }

            best = Math.max(best, previous + 1 + current);
            n >>>= 1;  // move to next bit
        }

        return best;
    }
}

public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt("11011101111", 2);
        LongestSequence ls = new LongestSequence();
        System.out.println("Longest sequence after one flip = " + ls.findLongest(n));
    }
}
