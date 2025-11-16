import java.util.*;

class MaxProductSubarray{

    int compute(int[] nums){

        int max_so_far = nums[0]; int min_so_far = nums[0];
        int result = nums[0];
        int temp;


        for(int i=1; i<nums.length; i++){
            if(nums[i]<0){
                temp = max_so_far;
                max_so_far = min_so_far;
                min_so_far = temp;
            }

            max_so_far = Math.max(nums[i], nums[i] * max_so_far);
            min_so_far = Math.min(nums[i], nums[i] * min_so_far);

            result = Math.max(result,max_so_far);
        }
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = input.nextInt();
        }

        MaxProductSubarray m1 = new MaxProductSubarray();
        int ans = m1.compute(nums);

        System.out.println("result: "+ans);

    }
}