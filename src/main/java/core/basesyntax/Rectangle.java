package core.basesyntax;

public class Rectangle extends Figures implements Area{
    private int sideA;
    private int sideB;

    public Rectangle(String color, int sideA, int sideB) {
        super.color = color;
        super.name = "Rectangle";
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
        System.out.println("Figure: " + name + ", area: " + findArea() + " sq. units, side: " + sideA + ", sideB:" + sideB + ", color: " + color);
    }
}
