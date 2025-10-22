package core.basesyntax;

public abstract class Figures implements Area {
    private String color;
    private String name;

    public Figures(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public abstract void printFigure();

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
