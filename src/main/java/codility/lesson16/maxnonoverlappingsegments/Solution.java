package codility.lesson16.maxnonoverlappingsegments;

public class Solution {
    public int solution(int[] a, int[] b) {
        int result = 0;
        int lastEnd = -1;
        int i = 0;
        int n = a.length;

        while (i < n) {
            if (a[i] > lastEnd) {
                result++;
                lastEnd = b[i];
            }

            i++;
        }

        return result;
    }
}
