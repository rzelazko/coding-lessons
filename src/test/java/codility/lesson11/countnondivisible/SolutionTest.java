package codility.lesson11.countnondivisible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        // given
        int[] a = {3, 1, 2, 3, 6};
        int[] expected = {2, 4, 3, 2, 0};

        // when
        Solution runner = new Solution();
        int[] result = runner.solution(a);

        // then
        assertArrayEquals(expected, result);
    }
}
