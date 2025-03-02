package org.example.service;

import org.example.model.Team;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("fastRacingService")
public class FastRacingService implements RacingService {
    public void race(Team team1, Team team2) {
        System.out.println(team1.getName() + " and " + team2.getName() + " are having an intense high-speed race! 🚀🏎️");
    }
}
