import java.util.*;

class MajorityElement{

    void majority(int[] nums, int n, int k){

        int k1 = k-1;
        int[] candidates = new int[k1]; int[] count = new int[k1]; boolean flag;

        for(int i=0; i<k1; i++){
            count[i] = 0; candidates[i] = Integer.MIN_VALUE;
        }

        for(int i=0; i<n; i++){
            flag = false;
            for(int j=0; j<k1; j++){
                if(candidates[j]==nums[i]){
                    count[j]++;
                    flag = true;
                    break;
                }
            }

            if(flag){
                continue;
            }

            for(int j=0; j<k1; j++){
                if(count[j]==0){
                    candidates[j] = nums[i];
                    count[j]++;
                    break;
                }
            }

            if(flag){
                continue;
            }

            for(int j=0; j<k1; j++){
                count[j]--;
            }
        }

        //verifying the candidates

        for(int i=0; i<k1; i++){
            count[i] = 0;
        }


        for(int i=0; i<n; i++){
            for(int j=0; j<k1; j++){
                if(candidates[j]==nums[i]){
                    count[j]++;
                }
            }
        }

        for(int i=0; i<k1; i++){
            if(count[i]>(n/k)){
                System.out.print(candidates[i]+" ");
            }
        }
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n]; for(int i=0; i<n; i++){arr[i] = input.nextInt();}
        int k = n-1;

        MajorityElement m1 = new MajorityElement();
        m1.majority(arr,n,k);

    }

}