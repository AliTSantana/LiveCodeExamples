import java.util.Arrays;

public class moveZeroes {
    public static void main(String[] args){
        System.out.println(Arrays.toString(moveZeroesRight(new int[]{2, 3, 0, 2, 3, 0, 1})));
        System.out.println(Arrays.toString(moveZeroesLeft(new int[]{2, 3, 0, 2, 3, 0, 1})));
    }

    private static int[] moveZeroesRight(int [] numbers){
        if (numbers == null || numbers.length == 0) return new int[]{};

        int lastNonZeroFoundAt = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != 0) {
                numbers[lastNonZeroFoundAt] = numbers[i];
                lastNonZeroFoundAt++;
            }
        }

        for (int i = lastNonZeroFoundAt; i < numbers.length; i++) {
            numbers[i] = 0;
        }
        return numbers;
    }

    private static int[] moveZeroesLeft(int[] nums) {
        int lastNonZeroFoundAt = nums.length - 1;

        // Paso 1: mover todos los no-cero al final
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt--;
            }
        }

        for (int i = 0; i <= lastNonZeroFoundAt; i++) {
            nums[i] = 0;
        }

        return nums;
    }
}
