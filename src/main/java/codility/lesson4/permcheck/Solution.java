package codility.lesson4.permcheck;

class Solution {
    public int solution(int[] a) {
        int[] counters = getCounters(a);

        for (int i = 0; i < a.length; i++) {
            if (counters[i] < 1) {
                return 0;
            }
        }

        return 1;
    }

    private int[] getCounters(int[] a) {
        int[] counters = new int[a.length];
        for (int elem : a) {
            int value = elem - 1;
            if (value < counters.length) {
                counters[value]++;
            }
        }

        return counters;
    }
}