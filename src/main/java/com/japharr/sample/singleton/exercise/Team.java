package com.japharr.sample.singleton.exercise;

public class Team {
    private Team() {}

    private static class TeamHelper {
        private final static Team captain = new Team();
    }

    public static Team getCaptain() {
        return TeamHelper.captain;
    }
}
