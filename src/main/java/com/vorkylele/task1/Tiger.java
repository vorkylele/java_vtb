package com.vorkylele.task1;

public class Tiger extends Animal {
    static int countTiger;

    public Tiger(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        countTiger += 1;
    }

    public static int getCountTiger() {
        return countTiger;
    }
}
