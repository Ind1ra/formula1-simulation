package org.example.service;

import org.example.model.Team;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("fastestPitStop")
public class FastestPitStopService implements PitCrewService{
    public void performPitStop(Team team) {
        System.out.println("Fastest pit stop executed for " + team.getName() + "! ⚡🏎️");
    }
}
