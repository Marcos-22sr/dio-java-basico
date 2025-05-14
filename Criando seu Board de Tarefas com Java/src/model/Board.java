package model;

import java.util.*;

public class Board {
    private String name;
    private List<BoardColumn> columns = new ArrayList<>();

    public Board(String name) {
        this.name = name;
    }

    public void addColumn(BoardColumn column) {
        columns.add(column);
    }

    public String getName() {
        return name;
    }

    public List<BoardColumn> getColumns() {
        return columns;
    }
}
