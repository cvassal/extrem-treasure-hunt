package com.extrem.kata;

import java.util.List;

public interface GameMaster {

    boolean moveAdventurer(Adventurer adventurer, Direction direction);

    List<Adventurer> getAdventurers();

    boolean isSquareOccupied(Coordinates coordinates);

    Neighbourhood getNeighbourhood(Coordinates coordinates);

}
