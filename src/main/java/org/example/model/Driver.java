package org.example.model;

import org.springframework.stereotype.Component;

@Component
public class Driver {
    private String name;
    private int championships;

    public Driver() {}

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getChampionships() { return championships; }
    public void setChampionships(int championships) { this.championships = championships; }
}
