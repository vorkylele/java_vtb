package com.vorkylele.task2.obstacle;

import com.vorkylele.task2.Skiils;

public class Wall implements Obstacle{
    private int height;
    public Wall(int length){
        this.height = length;
    }
    @Override
    public boolean skill(Skiils skill) {
        if(skill.jump(height)){
            System.out.println(skill.getName() + " успешно перепрыгнул стену");
            return true;
        } else{
            System.out.println(skill.getName() + " не переврыгнул стену");
            return false;
        }
    }
}
