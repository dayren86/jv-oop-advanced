package core.basesyntax;

public class IsoscelesTrapezoid extends Figures implements Area{
    private int sideA;
    private int sideB;
    private int hide;

    public IsoscelesTrapezoid(String color, int sideA, int sideB, int hide) {
        super.color = color;
        super.name = "IsoscelesTrapezoid";
        this.sideA = sideA;
        this.sideB = sideB;
        this.hide = hide;
    }

    @Override
    public int findArea() {
        return (sideA + sideB) * hide / 2;
    }

    @Override
    public void printFigure() {

    }
}
