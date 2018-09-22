package codility.lesson6.maxproductofthree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution() {
        // given
        int[] a = {-3, 1, 2, -2, 5, 6};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(60, result);
    }
}
