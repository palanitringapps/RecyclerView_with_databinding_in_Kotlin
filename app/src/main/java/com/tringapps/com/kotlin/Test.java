package com.tringapps.com.kotlin;

import android.util.Log;

/**
 * Created by tringapps-admin on 22/11/17.
 */

public class Test {
    int count = 0;

    public void test() {

        for (int i = 1000000; i <= 100000000; i++) {
            int n = i;
            int sum = 0;
            while (n > 9) {
                sum = 0;
                while (n > 0) {
                    int rem;
                    rem = n % 10;
                    sum = sum + rem;
                    n = n / 10;
                }
                n = sum;
            }
            if (n == 2) {
                count++;
            }

        }
        Log.i("gcghgjh count ", "number count " + count);
    }
}
