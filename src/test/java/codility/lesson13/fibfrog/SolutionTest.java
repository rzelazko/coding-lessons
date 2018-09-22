package codility.lesson13.fibfrog;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        // given
        int[] a = {0, 0, 0, 1, 1, 0, 1, 0, 0, 0, 0};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        assertEquals(3, result);
    }

    @Test
    public void testOnly0() {
        // given
        int[] a = {0, 0, 0, 0, 0};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(-1, result);
    }
    @Test
    public void testSimpleFunctional() {
        // given
        int[] a = {1, 1, 0, 0, 0};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(2, result);
    }
}