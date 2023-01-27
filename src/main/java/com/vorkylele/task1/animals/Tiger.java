package com.vorkylele.task1.animals;

import com.vorkylele.task1.animals.Animal;

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
