package codility.lesson5.passingcars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        // given
        int[] a = {0, 1, 0, 1, 1};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(5, result);
    }

    @Test
    public void testPrefix() {
        // given
        int[] a = {1, 2, 3, 4};
        int[] p = {0, 1, 3, 6};

        // when
        Solution runner = new Solution();
        int[] actual = runner.prefixSums(a);

        // then
        Assertions.assertArrayEquals(p, actual);
    }

    @Test
    public void testSuffix() {
        // given
        int[] a = {1, 2, 3, 4};
        int[] s = {9, 7, 4, 0};

        // when
        Solution runner = new Solution();
        int[] actual = runner.suffixSums(a);

        // then
        Assertions.assertArrayEquals(s, actual);
    }
}
