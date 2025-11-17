import java.util.*;

public class KCombinations {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int k = 2;

        List<List<Integer>> result = new ArrayList<>();
        combine(arr, 0, k, new ArrayList<>(), result);

        System.out.println(result);
    }

    static void combine(int[] arr, int index, int k,
                        List<Integer> current,
                        List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        if (index == arr.length) return;

        // Include arr[index]
        current.add(arr[index]);
        combine(arr, index + 1, k, current, result);

        // Exclude arr[index]
        current.remove(current.size() - 1);
        combine(arr, index + 1, k, current, result);
    }
}
