public class Factorial {
    public static void main (String[] args){
        System.out.println(getFactorial(5));
        System.out.println(getFactorial(3));
    }

    private static int getFactorial(int number){
        int factorial = 1;
        for (int i = 1; i <= number; i++){
            factorial*=i;
        }
        return factorial;
    }
}
