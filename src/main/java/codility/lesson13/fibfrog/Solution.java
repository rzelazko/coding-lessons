package codility.lesson13.fibfrog;

/**
 * Solution:
 * - find where we can go from initial position
 * - for each element in array a fill values of minJumps array which tells 'what is minimal jumps from beggining to  position i'
 */
public class Solution {
    public int solution(int[] a) {
        int[] fibs =
                {1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393};

        int[] minJumps = new int[a.length + 1];

        for (int i = 0; fibs[i] - 1 <= a.length; i++) {
            if (fibs[i] - 1 == a.length || a[fibs[i] - 1] == 1) {
                minJumps[fibs[i] - 1] = 1;
            }
        }

        for (int i = 0; i <= a.length; i++) {
            if ((i == a.length || a[i] == 1) && minJumps[i] > 0) {
                int lastMinJump = minJumps[i];
                for (int j = 0; j < fibs.length; j++) {
                    int next = i + fibs[j];
                    if (next > a.length) {
                        break;
                    }
                    if ((next == a.length || a[next] == 1)) {
                        if (minJumps[next] == 0 || lastMinJump + 1 < minJumps[next]) {
                            minJumps[next] = lastMinJump + 1;
                        }
                    }
                }
            }
        }

        return minJumps[a.length] > 0 ? minJumps[a.length] : -1;
    }
}