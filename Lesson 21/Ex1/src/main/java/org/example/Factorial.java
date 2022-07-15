package org.example;

public class Factorial {

    public int get(int i) {
        if (i < 0) {
            return -1;
        }
        if (i == 0) {
            return 1;
        }

        return i * get(i - 1);
    }
}
