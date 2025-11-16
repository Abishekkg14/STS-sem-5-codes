import java.util.*;

class MaxHourGlassSum{

    int findhourglasssum(int[][] matrix, int m, int n){
        if(m<3 || n<3){
            return -1;
        }

        int max_sum = Integer.MIN_VALUE;

        for(int i=0; i<=m-3; i++){
            for(int j=0; j<=n-3; j++){
                int sum = matrix[i][j] + matrix[i][j+1] + matrix[i][j+2] +
                          matrix[i+1][j+1] +
                          matrix[i+2][j] + matrix[i+2][j+1] + matrix[i+2][j+2];

                max_sum = Math.max(max_sum,sum);
            }
        }
        return max_sum;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int m = input.nextInt();
        int n = input.nextInt();

        int[][] matrix = new int[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        MaxHourGlassSum m1 = new MaxHourGlassSum();
        int res = m1.findhourglasssum(matrix,m,n);

        if(res!=-1){
            System.out.println("max hourglass sum: "+res);
        }
    }
}