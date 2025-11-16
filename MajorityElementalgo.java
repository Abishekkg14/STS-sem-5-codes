import java.util.Scanner;

class MajorityElementalgo{

    static int find_majority(int[] arr){
        int n = arr.length;
        int candidate = 0; int count = 0;

        for(int num: arr){
            if(count==0){
                candidate = num; count = 1;
            }
            if(num==candidate){
                count++;
            }
            else{
                count--;
            }
        }

        count = 0;

        for(int num: arr){
            if (num == candidate) {
                count++;
            }
        }

        if(count>(n/2)){
            return candidate;
        }

        return -1;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        System.out.println(find_majority(arr));
    }
}