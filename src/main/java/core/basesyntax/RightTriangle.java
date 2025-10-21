package core.basesyntax;

public class RightTriangle extends Figures implements Area{
    private int sideA;
    private int sideB;

    public RightTriangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public int findArea() {
        return 1 / 2 * sideA * sideB;
    }
}
