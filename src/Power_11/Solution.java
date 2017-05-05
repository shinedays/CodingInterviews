package Power_11;

/**
 * Created by bupt on 5/3/17.
 */
public class Solution {
    public static double power(double base, int exponent){
        if(base == 0.0 && exponent < 0)
            throw new RuntimeException("invalid input");

        int absExponent = 0;
        if(exponent < 0){
            absExponent = -exponent;
        } else
            absExponent = exponent;

        double result = powerWithUnsignedExponent(base,absExponent);
        if(exponent < 0)
            result = 1/result;

        return result;
    }

    public static double powerWithUnsignedExponent(double base, int absExpenont){
        if(absExpenont == 0)
            return 1;
        if(absExpenont == 1)
            return base;
        double result = powerWithUnsignedExponent(base,absExpenont >> 1);
        result *= result;
        if((absExpenont & 1) == 1)
            return result *= base;
        return result;
    }

    public static void main(String[] args) {
        double a = 7.0;
        int exponent = 3;
        System.out.println(power(a,exponent));


    }
}
