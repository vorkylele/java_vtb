package com.vorkylele.task2.obstacle;

import com.vorkylele.task2.skills.Skills;

public class TreadMill implements Obstacle{
    private int length;
    public TreadMill(int length){
        this.length = length;
    }
    @Override
    public boolean skill(Skills skill) {
        if(skill.run(length)){
            System.out.println(skill.getName() + " успешно пробежал дистанцию");
            return true;
        } else{
            System.out.println(skill.getName() + " не пробежал дистанцию");
            return false;
        }
    }
}
