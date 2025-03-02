package org.example.service;

import org.example.model.Team;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("standardPitStop")
public class StandardPitStopService implements PitCrewService{
    public void performPitStop(Team team) {
        System.out.println("Standard pit stop performed for " + team.getName() + "! 🔧🏎️");
    }
}
