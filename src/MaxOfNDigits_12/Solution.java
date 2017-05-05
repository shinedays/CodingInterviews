package MaxOfNDigits_12;

/**
 * Created by bupt on 5/4/17.
 */
public class Solution {
    public static void print1ToMaxOfN(int n){
        if(n <= 0)
            return;
        char[] number = new char[n];
        for(int i = 0;i< 10;i++){
            number[0] = (char)(i + '0');
            print1ToMaxOfNRecursively(number,n,0);
        }
    }
    public static void print1ToMaxOfNRecursively(char[] number, int length, int index){
        if(index == length - 1){
            printnumber(number);
            return;
        }
        for(int i = 0;i< 10;i++){
            number[index + 1] = (char)(i + '0');
            print1ToMaxOfNRecursively(number,length,index + 1);
        }
    }

    public static void printnumber(char[] number){
        boolean isStart = false;

        for(int i = 0;i<number.length;i++){
            if(number[i] != '0' && !isStart)
                isStart = true;
            if(isStart){
                System.out.print(number[i]);
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int n = 3;
        print1ToMaxOfN(3);
    }
}
