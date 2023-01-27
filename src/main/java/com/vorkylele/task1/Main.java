package com.vorkylele.task1;

import com.vorkylele.task1.animals.Animal;
import com.vorkylele.task1.animals.Dog;
import com.vorkylele.task1.animals.HomeCat;
import com.vorkylele.task1.animals.Tiger;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("Мурзик", 200, 0),
                new Dog("Валера", 500, 10),
                new Dog("Гурлан", 500, 10)
        };

        for(Animal animal : animals) {
            animal.run(200);
            animal.run(500);
            animal.run(501);
            animal.swim(10);
            animal.swim(11);
        }

        System.out.println(HomeCat.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Tiger.getCount());
        System.out.println(Animal.getCount());
    }
}