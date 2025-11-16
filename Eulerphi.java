import java.util.*;

class Eulerphi{

    public static int eulerphi(int n){

        int result = n;

        for(int p=2 ; p*p<=n; p++){
            if(n%p==0){
                while(n%p==0){
                    n = n/p;
                }
                result = result - result/p;
            }
        }

        if(n>1){
            result = result - result/n;
        }
        return result;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int q = input.nextInt();

        int[] queries = new int[q];

        for(int i=0; i<q; i++){
            queries[i] = input.nextInt();
        }

        int[] results = new int[q];

        for(int i=0; i<q; i++){
            results[i] = eulerphi(queries[i]);
        }

        for(int i=0; i<results.length; i++){
            System.out.print(results[i]+" ");
        }






    }













}

