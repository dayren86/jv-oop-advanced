package core.basesyntax;

public class Rectangle extends Figures implements Area{
    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int findArea() {
        return sideA * sideB;
    }
}
