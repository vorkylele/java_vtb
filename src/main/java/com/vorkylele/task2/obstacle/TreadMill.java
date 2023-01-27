package com.vorkylele.task2.obstacle;

import com.vorkylele.task2.Skiils;

public class TreadMill implements Obstacle{
    private int length;
    public TreadMill(int length){
        this.length = length;
    }
    @Override
    public boolean skill(Skiils skill) {
        if(skill.run(length)){
            System.out.println(skill.getName() + " успешно робежал дистанцию");
            return true;
        } else{
            System.out.println(skill.getName() + " не пробежал дистанцию");
            return false;
        }
    }
}
