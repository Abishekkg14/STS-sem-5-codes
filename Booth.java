import java.util.Scanner;

class Booth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter multiplicand (M): ");
        int M = sc.nextInt();
        System.out.print("Enter multiplier (Q): ");
        int Q = sc.nextInt();
        sc.close();

        int n = 8;      // number of bits
        int A = 0;      // accumulator
        int Qn_1 = 0;   // Qn-1

        for (int i = 0; i < n; i++) {
            int Qn = Q & 1;          // current LSB of Q

            // Booth's decision
            if (Qn == 0 && Qn_1 == 1) A += M;
            else if (Qn == 1 && Qn_1 == 0) A -= M;

            // Arithmetic right shift of (A, Q, Qn-1)
            int combined = (A << n) | (Q & 0xFF); // combine A and Q
            combined >>= 1;                       // arithmetic shift
            Qn_1 = Q & 1;                         // update Qn-1
            Q = combined & 0xFF;                  // lower 8 bits → Q
            A = combined >> n;                    // upper 8 bits → A
        }

        int result = (A << n) | Q;  // final product
        System.out.println("Multiplication Result: " + result);
    }
}
