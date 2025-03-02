package org.example.maintenance;

import org.example.model.Team;
import org.springframework.stereotype.Component;

@Component
public class QuickMaintenance implements Maintenance {
    public void performMaintenance(Team team) {
        System.out.println("Quick maintenance for " + team.getName());
    }
}
