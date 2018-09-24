package codility.lesson10.countfactors;

public class Solution {
    public int solution(int n) {
        long i = 1;
        int result = 0;
        while (i * i < n) {
            if (n % i == 0) {
                result += 2;
            }
            i++;
        }

        if (i * i == n) {
            result++;
        }

        return result;
    }
}