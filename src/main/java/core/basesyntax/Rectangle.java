package core.basesyntax;

public class Rectangle extends Figures {
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super(color, "Rectangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int findArea() {
        return sideA * sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + getName() + ", area: " + findArea() + " sq. units, side: "
                + sideA + ", sideB:" + sideB + ", color: " + getColor());
    }
}
