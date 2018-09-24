package com.company;

import java.util.*;

public class Palindrome {
    public Palindrome() {
    }

    boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();
        for (int i = 0; i < arr.length / 2; i++) {
            if (arr[i] != arr[arr.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    Set<String> findAllPalindromes(String str) {
        int N = str.length();
        Set<String> output = new HashSet<>();

        for (int center = 0; center < 2 * N - 1; center++) {
            int left = center / 2;
            int right = left + center % 2;

            while (left >= 0 && right < N && str.charAt(left) == str.charAt(right)) {
                String tmp = str.substring(left, right + 1);
                if (tmp.length() > 2) {
                    output.add(tmp);

                }
                left--;
                right++;
            }
        }
        return output;
    }
}
