package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public Figures getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Figures[] figures = {new Square(colorSupplier.getRandomColor(), random.nextInt(20))};

        return figures[0];
    }
}
