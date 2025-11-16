import java.util.*;

class Karatsubaalgo {

    static int total_digits(long num){
        if(num == 0) return 1;
        return (int)Math.log10(num) + 1;
    }

    static long karatsuba(long x, long y){

        // Base case: single digit numbers
        if(x < 10 || y < 10){
            return x * y;
        }

        int n = Math.max(total_digits(x), total_digits(y));
        int m = n / 2;

        long power = (long)Math.pow(10, m);

        // Split x into a|b and y into c|d
        long a = x / power;
        long b = x % power;
        long c = y / power;
        long d = y % power;

        // Correct Karatsuba multiplications
        long z0 = karatsuba(b, d);           // small-small
        long z2 = karatsuba(a, c);           // large-large
        long z1 = karatsuba(a + b, c + d);   // cross term

        // Combine using the Karatsuba formula
        long result = z2 * (long)Math.pow(10, 2*m)
                + (z1 - z2 - z0) * (long)Math.pow(10, m)
                + z0;

        return result;
    }

    public static void main(String[] args){
        long x = 1234;
        long y = 5678;

        long result = karatsuba(x, y);

        System.out.println("Result: " + result);
    }
}
