package com.vorkylele.task2;

import com.vorkylele.task2.obstacle.Obstacle;
import com.vorkylele.task2.obstacle.TreadMill;
import com.vorkylele.task2.obstacle.Wall;
import com.vorkylele.task2.participant.Cat;
import com.vorkylele.task2.participant.Human;
import com.vorkylele.task2.participant.Robot;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstacle> obstacles = new ArrayList<>();
        obstacles.add(new TreadMill(150));
        obstacles.add(new Wall(1));

        List<Skiils> participants = new ArrayList<>();
        participants.add(new Cat("Мурзик"));
        participants.add(new Human("Альфадор"));
        participants.add(new Robot("Джамбо"));

        for (Skiils participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if(!obstacle.skill(participant)){
                    break;
                }
            }
        }
    }
}
