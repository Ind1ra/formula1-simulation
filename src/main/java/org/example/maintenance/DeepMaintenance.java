package org.example.maintenance;

import org.example.model.Team;
import org.springframework.stereotype.Component;

@Component
public class DeepMaintenance implements Maintenance {
    public void performMaintenance(Team team) {
        System.out.println("Deep maintenance for " + team.getName());
    }
}
