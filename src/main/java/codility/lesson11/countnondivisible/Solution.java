package codility.lesson11.countnondivisible;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] a) {
        // b: copy of a, sorted & without duplicates
        int[] b = Arrays.copyOf(a, a.length);
        Arrays.sort(b);
        int max = b[b.length - 1];
        int previous = -1;
        int lastIndex = 0;
        for (int i = 0; i < b.length; i++) {
            if (previous != b[i]) {
                b[lastIndex] = b[i];
                previous = b[i];
                lastIndex++;
            }
        }

        // divisorsMap: key is divisor, value how many times it appears in a
        int[] divisorsMap = new int[max + 1];
        for (int divisor : a) {
            divisorsMap[divisor] = divisorsMap[divisor] + 1;
        }

        // nonDivisors: array with result - amount of non divisors, for whole range [0, max + 1]
        int[] nonDivisors = new int[max + 1];
        for (int divisor : a) {
            nonDivisors[divisor] = a.length - divisorsMap[divisor];
        }

        for (int i = 0; b[i] <= max / 2; i++) {
            int k = b[i] + b[i];
            while (k <= max) {
                nonDivisors[k] = nonDivisors[k] - divisorsMap[b[i]];
                k += b[i];
            }
        }

        // result: non divisors for elements from original array a
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = nonDivisors[a[i]];
        }

        return result;
    }
}