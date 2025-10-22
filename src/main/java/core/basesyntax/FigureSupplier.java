package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static Random random = new Random();

    public Figures getRandomFigure() {
        ColorSupplier colorSupplier = new ColorSupplier();

        Figures[] figures = {new Square(colorSupplier.getRandomColor(), random.nextInt(20)),
                                new Rectangle(colorSupplier.getRandomColor(), random.nextInt(20), random.nextInt(20)),
                                new RightTriangle(colorSupplier.getRandomColor(), random.nextInt(20), random.nextInt(20)),
                                new IsoscelesTrapezoid(colorSupplier.getRandomColor(), random.nextInt(20), random.nextInt(20), random.nextInt(20) )};

        return figures[random.nextInt(figures.length - 1)];
    }

    public Figures getDefaultFigure() {
        return new Circle("WHITE", 10);
    }
}
