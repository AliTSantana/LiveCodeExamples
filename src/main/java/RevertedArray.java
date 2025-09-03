import java.util.Arrays;

public class RevertedArray {
    public static void main(String[] args){
        System.out.println(Arrays.toString(revertArray(new int[]{1, 2, 3, 4})));
    }

    public static int[] revertArray(int[] numbers){
        if (numbers == null || numbers.length < 0){
            throw new IllegalArgumentException("The array is Empty");
        }

        int initArray = 0, finalArray = numbers.length - 1;

        while (initArray < finalArray){
            int temporalNumber = numbers[initArray];
            numbers[initArray] = numbers[finalArray];
            numbers[finalArray] = temporalNumber;
            initArray++;
            finalArray--;
        }
        return numbers;
    }
}
