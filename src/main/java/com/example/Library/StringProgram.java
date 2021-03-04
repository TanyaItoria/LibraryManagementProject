package com.example.Library;

public class StringProgram {
    String longestPalindrome(String s) {
        int start = 0, maxi = 0;
        String ans = "";
        if (s.length() == 0)
            return s;
        for (int i = 1; i < s.length(); i++) {
            int low = i - 1;
            int high = i;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxi) {
                    start = low;
                    maxi = high - low + 1;
                }
                low--;
                high++;
            }
            low = i - 1;
            high = i + 1;
            while (low >= 0 && high < s.length() && s.charAt(low) == s.charAt(high)) {
                if (high - low + 1 > maxi) {
                    start = low;
                    maxi = high - low + 1;
                }
                low--;
                high++;
            }
        }
        ans = s.substring(start, start + maxi);
        if (ans.length() == 0)
            ans += s.charAt(start);
        return ans;
    }
}
