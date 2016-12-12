package com.extrem.kata;

public class Adventurer {

    private final String name;
    private Coordinates coordinates;
    private int treasure;

    public Adventurer(String name) {
        this.name = name;
        this.treasure = 0;
    }

    public String getName() {
        return name;
    }

    public Coordinates getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(Coordinates coordinates) {
        this.coordinates = coordinates;
    }

    public int getTreasure() {
        return treasure;
    }

    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }
}
