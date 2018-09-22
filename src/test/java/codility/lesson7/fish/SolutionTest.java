package codility.lesson7.fish;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void basicTest() {
        // given
        int[] a = {4, 3, 2, 1, 5};
        int[] b = {0, 1, 0, 0, 0};

        // when
        Solution s = new Solution();
        int result = s.solution(a, b);

        // then
        assertEquals(2, result);
    }
}
