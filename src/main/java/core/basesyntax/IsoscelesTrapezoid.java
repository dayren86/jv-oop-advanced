package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements Area{
    private int sideA;
    private int sideB;
    private int hide;

    public IsoscelesTrapezoid(int sideA, int sideB, int hide) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.hide = hide;
    }

    @Override
    public int findArea() {
        return (sideA + sideB) * hide / 2;
    }
}
