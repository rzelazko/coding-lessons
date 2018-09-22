package codility.lesson4.maxcounters;

/**
 *
 * TODO! Only 77%
 *
 */
class Solution {
    private int[] counters;
    private int currentMax;

    public int[] solution(int n, int[] a) {
        counters = new int[n];
        currentMax = 0;

        for (int k = 0; k < a.length; k++) {
            int x = a[k];
            if (x >= 1 && x <= n) {
                increase(x);
            }
            else if (x == n + 1) {
                maxCounter();
            }
        }

        return counters;
    }

    private void maxCounter() {
        for (int i = 0; i < counters.length; i++) {
            counters[i] = currentMax;
        }
    }

    private void increase(int x) {
        int normalizedX = x - 1;
        counters[normalizedX]++;
        if (currentMax < counters[normalizedX]) {
            currentMax = counters[normalizedX];
        }
    }
}
