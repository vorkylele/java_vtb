package com.vorkylele.task1;

public class Animal {
    String name;
    final int LENGTH_RUN;
    final int LENGTH_SWIM;
    static int countAnimal;

    public Animal(String name, int lengthRun, int lengthSwim) {
        this.name = name;
        LENGTH_RUN = lengthRun;
        LENGTH_SWIM = lengthSwim;
        countAnimal += 1;
    }

    public void run(int lengthRun) {
        if(lengthRun < 0) {
            System.out.println(name + " не может пробежать меньше " + lengthRun + " м");
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
