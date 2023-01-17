package com.vorkylele.task1;

public class Tiger extends Animal {
    static int count;

    public Tiger(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        count ++;
    }

    public static int getCount() {
        return count;
    }
}
