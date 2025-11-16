import java.util.*;
class Leaders{
    void find_leaders(int[] arr, int n){
        List<Integer> leaders = new ArrayList<>();
        List<Integer> differences = new ArrayList<>();

        int maxfromright = arr[n-1];
        leaders.add(arr[n-1]);
        differences.add(0);
        int difference = Integer.MIN_VALUE;

        for(int i=n-2; i>=0; i--){
            if(arr[i]>maxfromright){
                leaders.add(arr[i]);
                maxfromright = arr[i];
            }
            else{
                maxfromright = Math.max(maxfromright,arr[i]);
            }
        }

        Collections.reverse(leaders);
        System.out.println("Leaders in array: ");

        for(int x: leaders){
            System.out.print(x+" ");
        }


    }
}

class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        Leaders l1 = new Leaders();
        l1.find_leaders(arr,n);
    }
}