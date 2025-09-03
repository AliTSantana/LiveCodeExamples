public class SumNumArray {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4};
        System.out.println(sumNum(numbers));
    }

    private static int sumNum(int[] numbers){
        if (numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("The array is empty");

        int sum = 0;

        for (int i = 0; i < numbers.length; i++){
            sum+=numbers[i];
        }
        return sum;
    }
}
