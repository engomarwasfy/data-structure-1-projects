package eg.edu.alexu.csd.datastructure.calculator.cs46;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

/**
 * @author wasfy this is test
 *
 */
public class MyCalculator implements ICalculator {

    @Override

    /**
     * @author wasfy this is test
     * @param x
     *            test
     * @param y
     *            test
     */
    public int add(final int x, final int y) {
        // TODO Auto-generated method stub
        return x + y;
    }

    /**
     * @author wasfy this is test
     * @param x
     *            test
     * @return y test
     */
    @Override
    public float divide(final int x, final int y) {
        // TODO Auto-generated method stub
        if (y != 0) {
            return (float) x / y;
        } else {
            return 0;
        }
    }

}
