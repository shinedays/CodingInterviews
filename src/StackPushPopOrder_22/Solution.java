package StackPushPopOrder_22;

import java.util.Stack;

/**
 * Created by bupt on 5/8/17.
 */
public class Solution {
    public static boolean isPopOrder(int[] push, int[] pop) {
        boolean result = false;
        int length = push.length;
        if (push != null && pop != null && length > 0) {
            Stack<Integer> s = new Stack<>();
            int pushIndex = 0;
            int popIndex = 0;

            while (popIndex < length) {
                while (s.isEmpty() || s.peek() != pop[popIndex]) {
                    if (pushIndex == length)
                        break;

                    s.push(push[pushIndex]);
                    pushIndex++;
                }

                if (s.peek() != pop[popIndex])
                    break;
                s.pop();
                popIndex++;
            }
            if (s.isEmpty() && pushIndex == length)
                result = true;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 3, 5, 1, 2};

        System.out.println(isPopOrder(push, pop));
    }
}
