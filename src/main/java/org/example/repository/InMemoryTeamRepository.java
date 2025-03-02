package org.example.repository;

import org.example.model.Team;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryTeamRepository implements TeamRepository {
    private final List<Team> teams = new ArrayList<>();

    @Override
    public void addTeam(Team team) {
        teams.add(team);
        System.out.println("Team added: " + team.getName());
    }
}
