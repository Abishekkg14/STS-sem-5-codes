import java.util.*;

class Uniquepermutations{

    static List<String> generatepermutations(String word){

        List<String> result = new ArrayList<>();
        char[] letters = word.toCharArray();
        boolean [] used = new boolean[letters.length];
        StringBuilder current = new StringBuilder();

        backtrack(letters,used,current,result);

        return result;
    }

    static void backtrack(char[] letters,boolean [] used, StringBuilder current ,List<String> result){

        if(letters.length == current.length()){
            result.add(current.toString());
            return;
        }

        for(int i=0; i<letters.length; i++){

            if(used[i]){
                continue;
            }

            if(i>0 && letters[i]==letters[i-1] && !used[i-1]){
                continue;
            }

            used[i] = true;
            current.append(letters[i]);

            backtrack(letters,used,current,result);

            current.deleteCharAt(current.length()-1);
            used[i] = false;
        }
    }

    public static void main(String[] args){
        List<String> perms = generatepermutations("aab");

        for(String s: perms){
            System.out.println(s);
        }
    }
}

