public class CountNumber {
    public static void main (String[] args){
        int[] numbers = {1,2,4,2,2,5,5};
        int target = 2;
        System.out.println(countNumber(numbers, target));
    }

    private static int countNumber(int[] numbers, int target){
        if (numbers == null || numbers.length == 0){
            throw new IllegalArgumentException("Array is empty");
        }

        int countTarget = 0;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] == target){
                countTarget++;
            }
        }
        return countTarget;
    }
}
