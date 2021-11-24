package ru.geekbrains.qa.java2.lesson1.homeWork.obstacleCourse;


import ru.geekbrains.qa.java2.lesson1.homeWork.team.TeamMember;

public abstract class Obstacle {

    private int difficulty;

    public Obstacle(int difficulty) {
        this.difficulty = difficulty;
    }

    public int getDifficulty() {
        return difficulty;
    }

    public void goChallenge (TeamMember member){}


}
