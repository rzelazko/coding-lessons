package codility.lesson10.countfactors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void defaultTest() {
        // given
        final int n = 24;

        //when
        Solution solution = new Solution();
        int result = solution.solution(n);

        assertEquals(8, result);
    }

}
