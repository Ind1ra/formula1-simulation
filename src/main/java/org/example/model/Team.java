package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Team {
    private String name;
    private Driver driver;

    public Team() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Driver getDriver() { return driver; }
    public void setDriver(Driver driver) { this.driver = driver; }
}
