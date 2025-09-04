import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static void main(String[] args){
        System.out.println(getSingleNumberMap(new int[]{1,2,3,4,4,5,5,3,2}));
        System.out.println(getSingleNumberXor(new int[]{1,2,3,4,4,5,5,3,2}));
    }

    private static int getSingleNumberMap(int[] numbers){
        Map<Integer, Integer> auxNumber = new HashMap<>();

        for(int number : numbers){
            auxNumber.put(number, auxNumber.getOrDefault(number, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : auxNumber.entrySet()){
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        throw new IllegalArgumentException("No unique number");
    }

    private static int getSingleNumberXor(int[] numbers){
        int uniqueNumber = 0;

        for (int number: numbers){
            uniqueNumber ^= number;
        }

        return uniqueNumber;
    }
}
