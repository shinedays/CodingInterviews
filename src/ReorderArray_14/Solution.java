package ReorderArray_14;

import java.util.function.Predicate;

/**
 * Created by bupt on 5/4/17.
 */
public class Solution {
    public static void recoder(int[] array, Predicate<Integer> check) {
        int length = array.length;
        if (array == null || check == null)
            return;
        int beginIndex = 0;
        int endIndex = length - 1;

        while (beginIndex < endIndex) {
            while (beginIndex < endIndex && !check.test(array[beginIndex]))
                beginIndex++;
            while (beginIndex < endIndex && check.test(array[endIndex]))
                endIndex--;

            if (beginIndex < endIndex) {
                int temp = array[beginIndex];
                array[beginIndex] = array[endIndex];
                array[endIndex] = temp;
            }
        }

        print(array);
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    //use functional programming interface
    public static Predicate<Integer> isEden() {
        return e -> e % 2 == 0;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        recoder(array, isEden());
    }
}
