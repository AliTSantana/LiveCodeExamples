public class Fibonacci {
    public static void main(String[] args) {
        int n = 20;
        fibonacci(n);
    }

    private static void fibonacci(int n) {
        if (n <= 0) return;

        long a = 0, b = 1;
        System.out.print(a);

        if (n == 1) return;

        System.out.print(" " + b);

        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}

