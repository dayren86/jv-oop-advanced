package core.basesyntax;

/**
 * Feel free to remove this class and create your own.
 */
public class HelloWorld {
    public static void main(String[] args) {
        Figures[] figures = new Figures[6];

        for (int i = 0; i < 3; i++) {
            figures[i] = new FigureSupplier().getRandomFigure();
        }

        for (int i = 3; i < 6; i++) {
            figures[i] = new FigureSupplier().getDefaultFigure();
        }

        for (Figures figure : figures) {
            figure.printFigure();
        }
    }

}
