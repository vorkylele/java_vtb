package com.vorkylele.task1;

public class Cat extends Animal {
    private static int count;
    public Cat(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        count ++;
    }

    public static int getCount() {
        return count;
    }
}
