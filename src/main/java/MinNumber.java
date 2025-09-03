public class MinNumber {
    public static void main(String[] args){
        int[] numbers = {-1,3,5,-25};
        System.out.println(minNumber(numbers));
    }

    private static int minNumber(int[] numbers){
        if(numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        int minNumber = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < minNumber){
                minNumber = numbers[i];
            }
        }
        return minNumber;
    }
}
