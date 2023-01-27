package com.vorkylele.task2.participant;

import com.vorkylele.task2.Skiils;

public class Robot implements Skiils {
    private String name;
    private int maxLength;
    private int maxHeight;
    public Robot(String name){
        this.name = name;
        this.maxLength = 200;
        this.maxHeight = 0;
    }

    @Override
    public boolean run(int length) {
        if(length < 0){
            System.out.println(length + " неккоректная дистанция пробежки для " + name);
            return false;
        } else if(length > maxLength){
            System.out.println(name + " не может пробежать дистанцию " + length);
            return false;
        } else {
            System.out.println(name + " может успешно пробежать дистацию " + length);
            return true;
        }
    }

    @Override
    public boolean jump(int height) {
        if(height < 0){
            System.out.println(height + " неккоректная высота прыжка для " + name);
            return false;
        } else if(height > maxHeight){
            System.out.println(name + " не может прыгнуть в высоту " + height);
            return false;
        } else {
            System.out.println(name + " может успешно перепрыгнуть высоту " + height);
            return true;
        }
    }

    @Override
    public String getName() {
        return name;
    }
}
