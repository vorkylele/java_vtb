package com.vorkylele.task2.obstacle;

import com.vorkylele.task2.skills.Skills;

public class Wall implements Obstacle{
    private int height;
    public Wall(int length){
        this.height = length;
    }
    @Override
    public boolean skill(Skills skill) {
        if(skill.jump(height)){
            System.out.println(skill.getName() + " успешно перепрыгнул стену");
            return true;
        } else{
            System.out.println(skill.getName() + " не перепрыгнул стену");
            return false;
        }
    }
}
