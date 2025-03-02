package org.example.service;

import org.example.model.Team;
import org.springframework.stereotype.Service;

@Service
public class StandardRacingService implements RacingService {
    public void race(Team team1, Team team2) {
        System.out.println(team1.getName() + " is racing against " + team2.getName() + "! 🏁");
    }
}
