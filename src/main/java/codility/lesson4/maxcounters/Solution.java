package codility.lesson4.maxcounters;

class Solution {
    public int[] solution(int n, int[] a) {
        int[] counters = new int[n];
        int maxLocal = 0;
        int maxApply = 0;

        for (int i = 0; i < a.length; i++) {
            int counter = a[i] - 1;
            if (counter < n) {
                if (counters[counter] < maxApply) {
                    counters[counter] = maxApply;
                }
                counters[counter]++;

                if (maxLocal < counters[counter]) {
                    maxLocal = counters[counter];
                }
            } else {
                maxApply = maxLocal;
            }
        }

        for (int j = 0; j < counters.length; j++) {
            if (counters[j] < maxApply) {
                counters[j] = maxApply;
            }

        }

        return counters;
    }
}