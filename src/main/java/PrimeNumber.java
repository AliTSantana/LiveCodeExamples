public class PrimeNumber {
    public static void main(String[] args){
        System.out.println(isPrime(25));
        System.out.println(isPrime(49));
        System.out.println(isPrime(7));
        System.out.println(isPrime(29));
    }

    private static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n <= 3) return true;
        if (n % 2 == 0 || n % 3 == 0) return false;

        int i = 5;
        while (i * i <= n) {
            if (n % i == 0 || n % (i + 2) == 0) return false;
            i += 6;
        }

        return true;
    }
}
