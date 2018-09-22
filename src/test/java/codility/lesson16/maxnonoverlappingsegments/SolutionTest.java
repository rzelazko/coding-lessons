package codility.lesson16.maxnonoverlappingsegments;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSolution() {
        // given
        int[] a = {1, 3, 7, 9, 9};
        int[] b = {5, 6, 8, 9, 10};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a, b);

        // then
        assertEquals(3, result);
    }
}
