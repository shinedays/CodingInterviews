package NumberOf1InBinary_10;

/**
 * Created by bupt on 5/3/17.
 */
public class Solution {
    public static int numberOf1(int n){
        int count = 0;
        while(n != 0){
            count ++;
            n = (n-1) & n;
        }
        return count;
    }

    public static void main(String[] args) {
        int n = 9;
        double a = 1.0;
        double b = 1.0;
        System.out.println(a == b);

        System.out.println(numberOf1(n));
    }
}
