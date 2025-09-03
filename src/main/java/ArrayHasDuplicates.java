import java.util.HashSet;

public class ArrayHasDuplicates {
    public static void main(String[] args){
        int[] numbersWithDuplicates = {1,2,3,5,6,2};
        int[] numbersWithoutDuplicates = {1,2,3,5,6};

        System.out.println(hasDuplicated(numbersWithoutDuplicates));
        System.out.println(hasDuplicated(numbersWithDuplicates));
        System.out.println(hasDuplicated2(numbersWithoutDuplicates));
        System.out.println(hasDuplicated2(numbersWithDuplicates));
    }

    private static boolean hasDuplicated(int[] numbers){
        HashSet<Integer> withoutDuplicated = new HashSet<>();

        for(int num : numbers){
            withoutDuplicated.add(num);
        }

        return withoutDuplicated.size() != numbers.length;
    }

    //Better version for longer arrays
    private static boolean hasDuplicated2(int[] numbers){
        HashSet<Integer> withoutDuplicates = new HashSet<>();

        for(int num : numbers){
            if(withoutDuplicates.contains(num)){
                return true;
            }
            withoutDuplicates.add(num);
        }

        return false;
    }
}
