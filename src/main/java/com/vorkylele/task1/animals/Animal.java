package com.vorkylele.task1.animals;

public abstract class Animal {
    private String name;
    private final int LENGTH_RUN;
    private final int LENGTH_SWIM;

    public static int getCount() {
        return count;
    }

    private static int count;

    public Animal(String name, int lengthRun, int lengthSwim) {
        this.name = name;
        LENGTH_RUN = lengthRun;
        LENGTH_SWIM = lengthSwim;
        count ++;
    }

    public void run(int lengthRun) {
        if(lengthRun < 0) {
            System.out.println(name + " не может пробежать некорректную длину: " + lengthRun + " м");
        } else if (LENGTH_RUN < lengthRun){
            System.out.println(name + " не может пробежать " + lengthRun + " м");
        } else if (lengthRun == 0){
            System.out.println(name + " стоит на месте");
        } else {
            System.out.println(name + " пробежал " + lengthRun + " м");
        }
    }

    public void swim(int lengthSwim) {
        if(lengthSwim < 0) {
            System.out.println(name + " не может проплыть меньше " + lengthSwim + " м");
        } else if (LENGTH_SWIM < lengthSwim){
            System.out.println(name + " не может проплыть " + lengthSwim + " м");
        } else if (lengthSwim == 0){
            System.out.println(name + " не плывет");
        } else {
            System.out.println(name + " проплыл " + lengthSwim + " м");
        }
    }


}
