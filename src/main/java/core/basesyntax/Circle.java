package core.basesyntax;

public class Circle extends Figures implements Area{
    private int radius;

    public Circle(String color, int radius) {
        super.color = color;
        super.name = "Circle";
        this.radius = radius;
    }

    @Override
    public int findArea() {
        return (int) (radius * Math.PI);
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + name + ", area: " + findArea() + " sq. units, radius: " + radius + ", color: " + color);
    }
}
