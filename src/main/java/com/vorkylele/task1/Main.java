package com.vorkylele.task1;

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

        System.out.println(HomeCat.getCountCat());
        System.out.println(Dog.getCountDog());
        System.out.println(Tiger.getCountTiger());
        System.out.println(Animal.countAnimal);
    }
}