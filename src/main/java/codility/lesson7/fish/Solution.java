package codility.lesson7.fish;

import java.util.*;

class Solution {
    private static final int UP = 0;
    private static final int DOWN = 1;

    public int solution(int[] a, int[] b) {
        Deque<Integer> stackUp = new ArrayDeque<>();
        Deque<Integer> stackDown = new ArrayDeque<>();

        for (int i = 0; i < a.length; i++) {
            int fish = a[i];
            int dir = b[i];

            if (dir == UP) {
                while (stackDown.peek() != null) {
                    int fishDown = stackDown.pop();
                    if (fishDown > fish) {
                        stackDown.push(fishDown);
                        break;
                    }
                }

                if (stackDown.size() == 0) {
                    stackUp.push(fish);
                }
            }
            else { // dir == DOWN
                stackDown.push(fish);
            }
        }

        return stackUp.size() + stackDown.size();
    }
}