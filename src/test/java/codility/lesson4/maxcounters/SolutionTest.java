package codility.lesson4.maxcounters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int n = 5;

        // when
        Solution runner = new Solution();
        int[] result = runner.solution(n, a);

        // then
        assertArrayEquals(new int[] {3, 2, 2, 4, 2}, result);
    }

}
