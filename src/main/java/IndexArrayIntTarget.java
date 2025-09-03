public class IndexArrayIntTarget {
    public static void main(String[] args){
        int[] numbers = {1,4,5,6,2};
        int target = 6;
        System.out.println(getIndex(numbers,target));
    }

    private static int getIndex(int[] numbers, int target){
        if (numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("The Array is Empty");

        for (int i=0; i < numbers.length; i++){
            if(numbers[i] == target)
                return i;
        }
        return -1;
    }
}
