package core.basesyntax;

public class Square extends Figures {
    private int sideA;

    public Square(String color, int sideA) {
        super(color, "Square");
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
        System.out.println("Figure: " + getName() + ", area: " + findArea() + " sq. units, side: "
                + sideA + ", color: " + getColor());
    }
}
