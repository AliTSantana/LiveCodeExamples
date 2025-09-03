public class MaxArray {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5};
        System.out.println(maxArray(numbers));
    }

    private static int maxArray(int [] numbers){
        if (numbers == null ||  numbers.length == 0 ){
            throw new IllegalArgumentException("Array is Empty");
        }

        int max = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] > max){
                max = numbers[i];
            }
        }
        return max;
    }
}
