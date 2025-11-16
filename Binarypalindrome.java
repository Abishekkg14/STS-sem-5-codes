import java.util.*;
class Binarypalindrome{

    static boolean check(String num){
        int left = 0; int right = num.length()-1;
        while(left<right){
            if(num.charAt(left)!=num.charAt(right)){
                return false;
            }
            left++; right--;
        }
        return true;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        String x = Integer.toBinaryString(num);

        boolean result = check(x);

        System.out.print("result: " + result);
    }
}