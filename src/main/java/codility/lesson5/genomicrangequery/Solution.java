package codility.lesson5.genomicrangequery;

public class Solution {
    private final int IDX_A = 0;
    private final int IDX_C = 1;
    private final int IDX_G = 2;

    public int[] solution(String s, int[] p, int[] q) {
        int[] result = new int[p.length];
        int[][] prefixSum = calculatePrefixes(s);

        for (int i = 0; i < p.length; i++) {
            int idxFrom = p[i] - 1;
            int idxTo = q[i];

            if (isThere(IDX_A, idxFrom, idxTo, prefixSum)) {
                result[i] = 1;
            } else if (isThere(IDX_C, idxFrom, idxTo, prefixSum)) {
                result[i] = 2;
            } else if (isThere(IDX_G, idxFrom, idxTo, prefixSum)) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }

    boolean isThere(int charIndex, int idxFrom, int idxTo, int[][] prefixSum) {
        int sumTo = prefixSum[charIndex][idxTo];
        int sumFrom = idxFrom >= 0 ? prefixSum[charIndex][idxFrom] : 0;

        if (sumTo - sumFrom > 0) {
            return true;
        }
        return false;
    }

    int[][] calculatePrefixes(String s) {
        char[] dna = s.toLowerCase().toCharArray();
        int[][] prefix = new int[3][dna.length];

        int maxA = 0;
        int maxC = 0;
        int maxG = 0;

        for (int i = 0; i < dna.length; i++) {
            switch (dna[i]) {
                case 'a':
                    maxA++;
                    break;
                case 'c':
                    maxC++;
                    break;
                case 'g':
                    maxG++;
                    break;
            }

            prefix[IDX_A][i] = maxA;
            prefix[IDX_C][i] = maxC;
            prefix[IDX_G][i] = maxG;
        }

        return prefix;
    }
}
