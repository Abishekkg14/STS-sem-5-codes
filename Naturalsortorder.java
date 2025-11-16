import java.util.*;

class compare{

    int naturalsortorder(String A, String B){

        int n1 = A.length(); int n2 = B.length();
        int i=0; int j = 0;

        while(i<n1 && j<n2){
            char c1 = A.charAt(i); char c2 = B.charAt(j);
            boolean d1 = Character.isDigit(c1); boolean d2 = Character.isDigit(c2);

            if(d1 && d2){
                int start1 = i;
                while(i<n1 && Character.isDigit(A.charAt(i))){
                    i++;
                }
                String numA = A.substring(start1,i);

                int start2 = j;
                while(j<n2 && Character.isDigit(B.charAt(j))){
                    j++;
                }
                String numB = A.substring(start2,j);

                String nzA = stripzeros(numA);
                String nzB = stripzeros(numB);

                if(nzA.length()!= nzB.length()){
                    return nzA.length() - nzB.length();
                }

                int cmp = nzA.compareTo(nzB);

                if(cmp!=0){
                    return cmp;
                }

                return numA.length() - numB.length();
            }

            if(!d1 && !d2){
                if(c1!=c2){
                    return c1-c2;
                }
                i++; j++;
                continue;
            }

            return d1 ? -1:1;
        }
        return (n1-i) - (n2-j);
    }

    String stripzeros(String num){
        int k = 0;
        while(k<num.length() && num.charAt(k)=='0'){
            k++;
        }
        return num.substring(k);
    }

}

/*class Naturalsortorder{

    public static void

}*/


