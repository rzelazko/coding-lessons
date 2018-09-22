package codility.lesson4.missinginteger;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void solutionTest() {
        // given
        int[] a = {1, 3, 6, 4, 1, 2};

        // when
        Solution runner = new Solution();
        int result = runner.solution(a);

        // then
        assertEquals(5, result);
    }

}
