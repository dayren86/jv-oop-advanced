package core.basesyntax;

public class Square extends Figures implements Area{
    private int sideA;

    public Square(String color, int sideA) {
        super.color = color;
        this.sideA = sideA;
    }

    @Override
    public int findArea() {
        return sideA * sideA;
    }
}
