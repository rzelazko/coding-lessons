package codility.lesson4.missinginteger;

class Solution {
    public int solution(int[] a) {
        int[] counters = new int[1_000_000];

        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                counters[a[i] - 1]++;
            }
        }

        for (int i = 0; i < counters.length; i++) {
            if (counters[i] < 1) {
                return i + 1;
            }
        }

        return 1;
    }
}