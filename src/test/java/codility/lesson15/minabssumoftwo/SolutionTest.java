package codility.lesson15.minabssumoftwo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void testDefaultSmall() {
        // given
        int[] a = {1, 4, -3};

        // when
        Solution s = new Solution();
        int result = s.solution(a);

        // then
        assertEquals(1, result);
    }

    @Test
    void testDefaultLarge() {
        // given
        int[] a = {-8, 4, 5, -10, 3};

        // when
        Solution s = new Solution();
        int result = s.solution(a);

        // then
        assertEquals(3, result);
    }
}
