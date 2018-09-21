package com.company;

import java.util.Arrays;

public class MyBinarySearch {

    int[] mockArr = new int[19];

    public MyBinarySearch() {
        for (int i = 0; i < mockArr.length; i++) {
            mockArr[i] = (int) (Math.random()*100);

        }
        Arrays.sort(mockArr);
    }

    boolean search(int[] arr, Integer value) {
        Integer low = 0;
        Integer high = arr.length - 1;

        while (high > low) {
            Integer middle = (low + high) / 2;
            if (arr[middle] == value) return true;
            if (arr[middle] < value) low = middle + 1;
            if (arr[middle] > value) high = middle -1;
        }
        return false;
    }
}
