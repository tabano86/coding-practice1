package com.company;

class Fibonacci {
    static void numberOf(int n) {
        int x = 0, y = 0, tot = 0;

        for (int i = 1; i <= n; i++) {
            switch (i) {
                case 1: {
                    x = 0;
                    y = 0;
                    tot = 0;
                    break;
                }
                case 2: {
                    x = 0;
                    y = 1;
                    tot = 1;
                    break;
                }
                default: {
                    tot = x + y;
                    x = y;
                    y = tot;
                    break;
                }
            }
        }
        System.out.println(tot);
    }
}
