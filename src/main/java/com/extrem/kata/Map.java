package com.extrem.kata;

public interface Map {

    Square getSquare(Coordinates coordinates);

    Neighbourhood getNeighbourhood(Coordinates coordinates);

}
