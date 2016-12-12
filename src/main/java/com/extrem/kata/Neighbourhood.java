package com.extrem.kata;

import java.util.List;

public class Neighbourhood {

    private final List<Square> squares;

    public Neighbourhood(List<Square> squares) {
        this.squares = squares;
    }

    public List<Square> getSquares() {
        return squares;
    }
}
