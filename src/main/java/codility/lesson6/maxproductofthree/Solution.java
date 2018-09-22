package codility.lesson6.maxproductofthree;

import java.util.Arrays;

public class Solution {
    public int solution(int[] a) {
        Arrays.sort(a);

        final int n = a.length;

        return Math.max(a[n - 1] * a[n - 2] * a[n - 3], a[0] * a[1] * a[n - 1]);
    }
}
