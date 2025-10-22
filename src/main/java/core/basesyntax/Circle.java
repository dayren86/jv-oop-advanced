package core.basesyntax;

public class Circle extends Figures {
    private int radius;

    public Circle(String color, int radius) {
        super(color, "Circle");
        this.radius = radius;
    }

    @Override
    public int findArea() {
        return (int) (radius * Math.PI);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + getName() + ", area: " + findArea() + " sq. units, radius: "
                + radius + ", color: " + getColor());
    }
}
