import java.util.*;

class Karatsuba{

    public int total_digits(long num){
        if(num==0){
            return 1;
        }
        return (int) Math.log10(num) + 1;
    }

    public long karastuba(long x, long y){

        if(x<10 || y<10){
            return x*y;
        }

        int n = Math.max(total_digits(x),total_digits(y));

        int m = n/2;

        int poweroften = (int) Math.pow(10,m);

        long a,b,c,d;

        a = x/poweroften; c = y/poweroften;
        b = x%poweroften; d = y%poweroften;

        long z0,z1,z2;
        z0 = karastuba(b,d); z2 = karastuba(a,c); z1 = karastuba(a+b,c+d);

        return (int)(z2*Math.pow(10,2*m) + z0 + (z1-z2-z0)*Math.pow(10,m));
    }

    public static void main(String[] args){
        long a = 1234;
        long b = 5678;

        Karatsuba k1 = new Karatsuba();
        long result = k1.karastuba(a,b);

        System.out.println("Result: "+result);
    }
}