package com.vorkylele.task1;

public class Cat extends Animal {
    private static int countCat;
    public Cat(String name, int lengthRun, int lengthSwim) {
        super(name, lengthRun, lengthSwim);
        countCat += 1;
    }

    public static int getCountCat() {
        return countCat;
    }
}
