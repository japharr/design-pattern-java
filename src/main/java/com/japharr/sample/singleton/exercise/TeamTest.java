package com.japharr.sample.singleton.exercise;

public class TeamTest {
    public static void main(String[] args) {
        System.out.println("Trying to make a captain for our team");
        Team team1 = Team.getCaptain();
        System.out.println("New captain selected for our team");

        System.out.println("Trying to make another captain for our team");
        Team team2 = Team.getCaptain();

        if(team1 == team2) {
            System.out.println("You already have a Captain for your team");
            System.out.println("team1 and team2 are the same instance");
        }
    }
}
