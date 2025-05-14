package model;

public class BoardColumn {
    private String name;
    private int order;
    private ColumnType type;

    public BoardColumn(String name, int order, ColumnType type) {
        this.name = name;
        this.order = order;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public int getOrder() {
        return order;
    }

    public ColumnType getType() {
        return type;
    }
}
