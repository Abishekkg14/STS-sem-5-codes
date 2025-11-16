import java.util.*;

class Reversearray{

    static void reverse(int[] array, int l, int r){

        while(l<r){
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
            l++;
            r--;
        }
    }


    static void rotateleft(int[] array, int d){

        int n = array.length;
        d = d%n;

        reverse(array,0,d-1);
        reverse(array,d,n-1);
        reverse(array,0,n-1);

        System.out.println("Array elements after reversing: ");
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }

        int d = input.nextInt();

        rotateleft(arr,d);
    }
}