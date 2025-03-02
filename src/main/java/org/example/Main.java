package org.example;

import org.example.config.ProjectConfig;
import org.example.model.Driver;
import org.example.model.Team;
import org.example.maintenance.Maintenance;
import org.example.service.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        TeamService teamService = context.getBean(TeamService.class);
        RacingService standardRacingService = context.getBean(StandardRacingService.class);
        RacingService fastRacingService = context.getBean("fastRacingService", RacingService.class);
        PitCrewService standardPitStopService = context.getBean("standardPitStopService", PitCrewService.class);
        PitCrewService fastestPitStopService = context.getBean("fastestPitStopService", PitCrewService.class);
        Maintenance quickMaintenance = context.getBean("quickMaintenance", Maintenance.class);
        Maintenance deepMaintenance = context.getBean("deepMaintenance", Maintenance.class);

        // Drivers
        Driver george = new Driver();
        george.setName("George Russell");
        george.setChampionships(0);

        Driver max = new Driver();
        max.setName("Max Verstappen");
        max.setChampionships(4);

        Driver charles = new Driver();
        charles.setName("Charles Leclerc");
        charles.setChampionships(0);

        Driver lando = new Driver();
        lando.setName("Lando Norris");
        lando.setChampionships(0);

        // Registering Teams with Drivers
        Team mercedes = new Team();
        mercedes.setName("Mercedes");
        mercedes.setDriver(george);
        teamService.registerTeam(mercedes);

        Team redBull = new Team();
        redBull.setName("Red Bull");
        redBull.setDriver(max);
        teamService.registerTeam(redBull);

        Team ferrari = new Team();
        ferrari.setName("Ferrari");
        ferrari.setDriver(charles);
        teamService.registerTeam(ferrari);

        Team mclaren = new Team();
        mclaren.setName("McLaren");
        mclaren.setDriver(lando);
        teamService.registerTeam(mclaren);

        System.out.println("\n🔧 Pre-Race Maintenance:");
        quickMaintenance.performMaintenance(ferrari);
        deepMaintenance.performMaintenance(redBull);
        quickMaintenance.performMaintenance(mclaren);
        deepMaintenance.performMaintenance(mercedes);


        // Simulating Races
        System.out.println("\n🏁 The Grand Prix Begins! 🏁");

        System.out.println("🔧 Ferrari is preparing for the race...");
        standardPitStopService.performPitStop(ferrari);
        System.out.println("🏎️ Ferrari takes an early lead!");
        standardRacingService.race(ferrari, redBull);
        System.out.println("🔥 McLaren is ahead! Red Bull is trying to catch up!");
        fastRacingService.race(redBull, mclaren);
        System.out.println("💨 Mercedes is making a move on McLaren!");
        fastRacingService.race(mclaren, mercedes);
        System.out.println("🔧 Mercedes is in the pits for the final stretch...");
        fastestPitStopService.performPitStop(mercedes);
        System.out.println("⚡ Mercedes is flying down the track! Can Ferrari hold them off?");
        standardRacingService.race(mercedes, ferrari);

        System.out.println("\n🏁 The Grand Prix Ends! 🏁");
        System.out.println("🥇 What a thrilling race! The teams gave it their all!");
    }
}
