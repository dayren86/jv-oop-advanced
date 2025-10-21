package core.basesyntax;

public class Circle extends Figures implements Area{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public int findArea() {
        return (int) (radius * Math.PI);
    }
}
