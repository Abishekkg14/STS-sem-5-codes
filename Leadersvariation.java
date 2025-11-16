import java.util.*;

class Leadervariation{

    void find(int[] arr){
        int n = arr.length;
        int diff = 0;
        List<Integer> leaders = new ArrayList<>();
        List<Integer> differences = new ArrayList<>();
        int maxfromright = Integer.MIN_VALUE;

        for(int i=n-1; i>=0; i--){
            if(arr[i]>=maxfromright){
                leaders.add(arr[i]);
                if(i==n-1){
                    differences.add(0);
                }
                else{
                    diff = arr[i] - maxfromright;
                    differences.add(diff);
                }
                maxfromright  = arr[i];
            }
            else{
                maxfromright = Math.max(arr[i],maxfromright);
            }
        }
        Collections.reverse(leaders); Collections.reverse(differences);

        for(int x: leaders){
            System.out.print(x+" ");
        }

        for(int x: differences){
            System.out.print(x+" ");
        }


    }


    public static void main(String[] args){



    }











}