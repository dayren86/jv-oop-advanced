package core.basesyntax;

public class RightTriangle extends Figures implements Area{
    private int sideA;
    private int sideB;

    public RightTriangle(String color, int sideA, int sideB) {
        super.color = color;
        super.name = "RightTriangle";
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int findArea() {
        return (int)((sideA * sideB) * 0.5);
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + name + ", area: " + findArea() + " sq. units, sideA: " + sideA + ", sideB:" + sideB + ", color: " + color);
    }
}
