package com.vorkylele.task1.animals;

public class Dog extends Animal {
    private static int count;

    public Dog(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        count ++;
    }


    public static int getCount() {
        return count;
    }
}
