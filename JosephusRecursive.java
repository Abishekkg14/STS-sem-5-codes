public class JosephusRecursive {

    // Returns 1-indexed survivor position
    public static int josephus(int n, int k) {
        if (n == 1)
            return 1;               // Base case (only one person left)
        return (josephus(n - 1, k) + k - 1) % n + 1;
    }

    public static void main(String[] args) {
        int n = 6, k = 2;
        System.out.println(josephus(n, k));  // Output: 5
    }
}
