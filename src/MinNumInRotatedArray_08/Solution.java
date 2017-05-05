package MinNumInRotatedArray_08;

/**
 * Created by bupt on 5/3/17.
 */
public class Solution {
    public static int min(int[] array){
        if(array.length <= 0 || array == null)
            throw new RuntimeException("incorrect input");
        int index1 = 0;
        int index2 = array.length -1;
        int midIndex = index1;

        while(array[index1] >= array[index2]) {
            if (index2 - index1 == 1) {
                midIndex = index2;
                break;
            }
            midIndex = (index1 + index2) / 2;
            if(array[index1] == array[index2]  && array[midIndex] == array[1])
                return minInorder(array);

            if (array[midIndex] >= array[index1])
                index1 = midIndex;
            else if (array[midIndex] <= array[index2])
                index2 = midIndex;

        }
        return array[midIndex];

    }

    public static int minInorder(int[] array){
        int result = array[0];
        for(int i = 1;i<array.length;i++){
            if(result < array[i]){
                result = array[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {3,4,5,1,2};
        System.out.println(min(array));
    }

}
