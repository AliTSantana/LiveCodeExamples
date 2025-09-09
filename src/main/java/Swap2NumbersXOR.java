public class Swap2NumbersXOR {
    public static void main(String[] args){
        int a = 10, b = 20;

        System.out.println("Before: a = " + a + ", b = " + b);

        int[] swapped = swapXor(a, b);

        System.out.println("After: a = " + swapped[0] + ", b = " + swapped[1]);
    }

    public static int[] swapXor(int a, int b) {
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        return new int[]{a, b};
    }
}
