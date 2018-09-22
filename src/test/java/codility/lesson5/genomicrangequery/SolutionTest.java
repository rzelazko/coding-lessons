package codility.lesson5.genomicrangequery;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        // given
        String s = "CAGCCTA";
        int[] p = {2, 5, 0};
        int[] q = {4, 5, 6};

        // when
        Solution runner = new Solution();
        int[] result = runner.solution(s, p, q);

        // then
        assertArrayEquals(new int[]{2, 4, 1}, result);
    }

}
