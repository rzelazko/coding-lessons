package codility.lesson5.passingcars;

class Solution {
    public int solution(int[] a) {
        int passingCars = 0;
        int[] suffix = suffixSums(a);

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                passingCars += suffix[i];
            }
            if (passingCars > 1_000_000_000) {
                return -1;
            }
        }

        return passingCars;
    }

    int[] prefixSums(int[] a) {
        int[] prefix = new int[a.length];
        for (int i = 1; i < a.length; i++) {
            prefix[i] = prefix[i - 1] + a[i - 1];
        }

        return prefix;
    }

    int[] suffixSums(int[] a) {
        int[] suffix = new int[a.length];
        for (int i = a.length - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] + a[i + 1];
        }

        return suffix;
    }
}
