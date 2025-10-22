package core.basesyntax;

public class RightTriangle extends Figures {
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super(color, "RightTriangle");
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int findArea() {
        return (int) ((sideA * sideB) * 0.5);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + getName() + ", area: " + findArea() + " sq. units, sideA: "
                + sideA + ", sideB:" + sideB + ", color: " + getColor());
    }
}
