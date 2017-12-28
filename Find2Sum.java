package find2sum;

import java.util.HashMap;
import java.util.Map;

public class Find2Sum {

    public static int[] findTwoSum(int[] numbers, int sum) {
    if (numbers == null) {
        return null;
    }

    Map<Long, Integer> complements = new HashMap<>();

    for (int i = 0; i < numbers.length; i++) {
        Integer complementIndex = complements.get((long)numbers[i]);
        if (complementIndex != null) {
            return new int[]{complementIndex, i};
        }

        // it's possible that for large targets and a negative input
        // that we might overflow the int type
        long complement = (long)sum - numbers[i];
        complements.put(complement, i);
    }

    return null;
}
    
    public static void main(String[] args) {
        int[] array = findTwoSum(new int[] { 1, 3, 5, 7, 9 }, 12);
        System.out.println(array[0] + " " + array[1]);
    }
    
}
