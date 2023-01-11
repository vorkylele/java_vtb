package com.vorkylele.task1;

public class Dog extends Animal {
    private static int countDog;

    public Dog(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        countDog += 1;
    }


    public static int getCountDog() {
        return countDog;
    }
}
