package core.basesyntax;

public class Square extends Figures implements Area{
    private int sideA;

    public Square(String color, int sideA) {
        super.color = color;
        super.name = "Square";
        this.sideA = sideA;
    }

    @Override
    public int findArea() {
        return sideA * sideA;
    }

    public int getSideA() {
        return sideA;
    }

    @Override
    public void printFigure() {
        System.out.println("Figure: " + name + ", area: " + findArea() + " sq. units, side: " + sideA + ", color: " + color);
    }
}
