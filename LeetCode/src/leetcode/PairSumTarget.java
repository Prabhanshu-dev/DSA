package leetcode;
import java.util.*;

public class PairSumTarget {
    public static void findPairs(int[] nums, int targetSum) {
        Map<Integer, Integer> complementMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int num : nums) {
            int complement = targetSum - num;
            if (complementMap.containsKey(complement)) {
                result.add("(" + num + "," + complement + "):" + (num * complement % targetSum == 0));
            }
            complementMap.put(num, complement);
        }

        if (result.isEmpty()) {
            System.out.println("No results found");
        } else {
            for (String pair : result) {
                System.out.println(pair);
            }
        }
    }

    public static void main(String[] args) {
        int[] input1 = {-5, 1, -40, 20, 6, 8, 7, -15, 30};
        int targetSum1 = 15;
        int[] input2 = {-5, 4, -2, 16, 8, 9};
        int targetSum2 = 15;   
        findPairs(input1, targetSum1);
        findPairs(input2, targetSum2);
        

       
    }
}
