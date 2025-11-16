class Maxequilibriumsum{

    int find(int[] nums){
        int n = nums.length;
        int totalsum = 0;

        for(int num: nums){
            totalsum+=num;
        }
        int maxsum = Integer.MIN_VALUE; int leftsum = 0;
        int index = 0;

        for(int i=0; i<n; i++){
            int rightsum = totalsum-leftsum-nums[i];

            if(leftsum == rightsum){
                if(leftsum>maxsum){
                    maxsum = leftsum;
                    index = i;
                    return index;
                }
            }
            leftsum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args){
        int n;
        int[] nums = {2,1,-1};
        Maxequilibriumsum m1 = new Maxequilibriumsum();
        int res = m1.find(nums);
        System.out.println("res: "+res);








    }












}