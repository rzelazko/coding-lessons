package codility.lesson13.fibfrog;


/**
 *
 * TODO! Only 41%
 *
 */
public class Solution {
    public int solution(int[] a) {
        final int n = a.length;
        int[] fibonacci = fibonacci();

        int position = -1;
        int nextJumpIdx = fibonacci.length - 1;
        int nextJump = position + fibonacci[nextJumpIdx];

        int totalJumps = 0;

        while (position < n && nextJumpIdx > 0) {
            if (nextJump > n) {
                nextJumpIdx--;
                nextJump = position + fibonacci[nextJumpIdx];
            }
            else if (nextJump == n) {
                return totalJumps + 1;
            }
            else if (a[nextJump] == 1) {
                position = nextJump;
                nextJumpIdx = fibonacci.length - 1;
                nextJump = position + fibonacci[nextJumpIdx];
                totalJumps++;
            }
            else {
                nextJumpIdx--;
                nextJump = position + fibonacci[nextJumpIdx];
            }
        }

        return -1;
    }

    private int[] fibonacci() {
        int[] fibonacci = new int[6];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        for (int i = 2; i < fibonacci.length; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        return fibonacci;
    }
}
