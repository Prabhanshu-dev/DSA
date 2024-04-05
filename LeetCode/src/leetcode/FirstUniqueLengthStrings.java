package leetcode;
import java.util.*;

public class FirstUniqueLengthStrings {
    public static String[] firstUniqueLengthStrings(String[] strings) {
    	Map<String, Integer> lengthOccurrences = new HashMap<>();
        Set<Integer> uniqueLengths = new HashSet<>();
        List<String> result = new ArrayList<>();

        // Count occurrences of each length
        for (String str : strings) {
            lengthOccurrences.put(str.toLowerCase(), lengthOccurrences.getOrDefault(str.toLowerCase(), 0) + 1);
        }

        // Iterate through strings and check for unique lengths
        for (String str : strings) {
            if (lengthOccurrences.get(str.toLowerCase()) == 1 && uniqueLengths.add(str.length())) {
                result.add(str);
            }
        }

        // Convert list to array
        return result.toArray(new String[0]);
    }

    public static void main(String[] args) {
      //  String[] input = {"saini", "manoj", "ravi", "prashant", "vikram", "kunal"};
    	String[] input = {"book", "bat", "ball", "glass", "food", "phone", "can", "remote", "cap", "bag", "basket"};
        String[] output = firstUniqueLengthStrings(input);
        System.out.println(Arrays.toString(output));
    }
    }
