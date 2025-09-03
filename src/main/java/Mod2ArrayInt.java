public class Mod2ArrayInt {
    public static void main(String[] args){
        int[] numbers = {1,2,3,4,5,6};
        System.out.println(numMod2(numbers));
    }

    private static int numMod2 (int[] numbers){
        if (numbers == null || numbers.length == 0)
            throw new IllegalArgumentException("Array is Empty");

        int countMod2 = 0;

        for (int num : numbers){
            if(num % 2 == 0){
                countMod2++;
            }
        }
        return countMod2;
    }
}
