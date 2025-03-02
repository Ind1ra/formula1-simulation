package org.example.config;

import org.example.maintenance.Maintenance;
import org.example.maintenance.QuickMaintenance;
import org.example.maintenance.DeepMaintenance;
import org.example.service.RacingService;
import org.example.service.FastRacingService;
import org.example.service.StandardRacingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@ComponentScan(basePackages = {"org.example"})
@Configuration
public class ProjectConfig {
    public ProjectConfig() {}

    @Bean
    @Primary
    public RacingService standardRacingService() {
        return new StandardRacingService();
    }

    @Bean
    @Qualifier("fastRacingService")
    public RacingService fastRacingService() {
        return new FastRacingService();
    }

    @Bean
    @Primary
    Maintenance quickMaintenance() {
        return new QuickMaintenance();
    }

    @Bean
    @Lazy
    Maintenance deepMaintenance() {
        return new DeepMaintenance();
    }
}
