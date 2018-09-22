package codility.lesson11.countnondivisible;

/**
 *
 * TODO! Only 41%
 *
 */
public class Solution {
    public int[] solution(int[] a) {

        int[] result = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] != a[j]) {
                    if (a[i] % a[j] != 0) {
                        result[i]++;
                    }
                }
            }
        }

        return result;
    }
}
