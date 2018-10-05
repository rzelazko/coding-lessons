package codility.lesson15.minabssumoftwo;

import java.util.Arrays;

public class Solution {
    public int solution(int a[]) {
        Arrays.sort(a);

        int i = 0, j = a.length - 1;
        int sum = Math.abs(a[i] + a[j]);
        int best = sum;
        while (i <= j) {
            sum = Math.abs(a[i] + a[j]);
            if (best > sum) {
                best = sum;
            }
            if (Math.abs(a[i]) > Math.abs(a[j])) {
                i++;
            } else {
                j--;
            }
        }

        return best;
    }
}