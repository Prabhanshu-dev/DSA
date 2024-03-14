package leetcode;
public class Solution {
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            System.out.println("&&&&&&&&&&&&&&&&&&");
            System.out.println("len1 value is:"+ len1);
            int len2 = expandAroundCenter(s, i, i + 1);
            System.out.println("##########");
            System.out.println("len2 value is:" + len2);
            int len = Math.max(len1, len2);
            System.out.println("len value is:"+ len);
            System.out.println("start value is given as:"+ start);   
            System.out.println("end value is given as:"+ end); 
            if (len > end - start) {
            	System.out.println("start value intially is : "+ start);
            	System.out.println("end value intially is : "+ end);
            	System.out.println("len value intially is : "+ len);
                start = i - (len - 1) / 2;
                System.out.println("start value is:"+ start);
                end = i + len / 2;
                System.out.println("end value is:"+ end);
            }
            // Debug statements
            System.out.println("Center: " + i + ", Length: " + len + ", Start: " + start + ", End: " + end);
        }
        return s.substring(start, end + 1);
    }
    
    private static int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        System.out.println("left  value is"+ left);
        System.out.println("right  value is"+ right);
        return right - left - 1;
    }

    public static void main(String[] args) {
        String input = "babad";
        System.out.println("Longest palindromic substring: " + longestPalindrome(input));
    }
}
