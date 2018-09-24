package codility.lesson4.permcheck;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void defaultPositiveTest() {
        // given
        int[] a = {4, 1, 3, 2};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(1, result);
    }

    @Test
    void defaultNegativeTest() {
        // given
        int[] a = {4, 1, 3};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(0, result);
    }
}
