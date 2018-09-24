package com.company;

public class StringReverse {
    public StringReverse() {
    }

    String reverse(String s) {
        char[] arr = s.toCharArray();
        for (int i = 0; i < s.length()/2; i++) {
            char tmp = arr[i];
            arr[i] = arr[s.length() - 1 - i];
            arr[s.length() - 1 - i] = tmp;
        }
        return new String(arr);
    }
}
