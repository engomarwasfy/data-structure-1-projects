package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

/**
 * @author wasfy good
 *
 */

public class PolynomialSolver implements IPolynomialSolver {

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Acoff = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Aexp = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Bcoff = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Bexp = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Ccoff = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Cexp = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Rcoff = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked Rexp = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked tmpexp = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private OurSingleLinked tmpcoff = new OurSingleLinked();

    /**
     * @author wasfy this is test
     *
     */
    private boolean operation = false;

    @Override
    public void setPolynomial(final char poly, final int[][] terms) {
        // TODO Auto-generated method stub
        int checker = 1000000;
        switch (poly) {
        case 'A':
            if (!Aexp.isEmpty()) {
                throw new RuntimeException("Check Set A ");
            }
            for (int i = 0; i < terms.length; i++) {
                Acoff.add(terms[i][0]);
                if (checker > terms[i][1] && terms[i][1] > -1) {
                    Aexp.add(terms[i][1]);
                    checker = terms[i][1];
                } else {
                    throw new RuntimeException("Check Set A ");
                }
            }
            break;
        case 'B':
            if (!Bexp.isEmpty()) {
                throw new RuntimeException("Check Set A ");
            }
            for (int i = 0; i < terms.length; i++) {
                Bcoff.add(terms[i][0]);
                if (checker > terms[i][1] && terms[i][1] > -1) {
                    Bexp.add(terms[i][1]);
                    checker = terms[i][1];
                } else {
                    throw new RuntimeException("Check Set B ");
                }
            }

            break;
        case 'C':
            if (!Cexp.isEmpty()) {
                throw new RuntimeException("Check Set A ");
            }
            for (int i = 0; i < terms.length; i++) {
                Ccoff.add(terms[i][0]);
                if (checker > terms[i][1] && terms[i][1] > -1) {
                    Cexp.add(terms[i][1]);
                    checker = terms[i][1];
                } else {
                    throw new RuntimeException("Check Set C ");
                }
            }
            break;
        case 'R':
            Rexp.clear();
            Rcoff.clear();
            if (operation) {
                for (int i = 0; i < terms.length; i++) {
                    Rcoff.add(terms[i][0]);
                    if (checker > terms[i][1] && terms[i][1] > -1) {
                        Rexp.add(terms[i][1]);
                        checker = terms[i][1];
                    } else {
                        throw new RuntimeException("Check Set R ");
                    }
                }
            } else {
                throw new RuntimeException("Can't Set R ");
            }
            break;
        default:
            throw new RuntimeException("Check Set ");
        }
    }

    @Override
    public String print(final char poly) {
        // TODO Auto-generated method stub
        int[][] array;
        switch (poly) {
        case 'A':
            if (Acoff.isEmpty()) {
                return null;
            }
            array = toArray(Acoff, Aexp);
            return printpoly(array);
        case 'B':
            if (Bcoff.isEmpty()) {
                return null;
            }
            array = toArray(Bcoff, Bexp);
            return printpoly(array);
        case 'C':
            if (Ccoff.isEmpty()) {
                return null;
            }
            array = toArray(Ccoff, Cexp);
            return printpoly(array);
        case 'R':
            if (Rcoff.isEmpty()) {
                return null;
            }
            array = toArray(Rcoff, Rexp);
            return printpoly(array);
        default:
            break;
        }
        return null;
    }

    @Override
    public void clearPolynomial(final char poly) {
        // TODO Auto-generated method stub
        switch (poly) {
        case 'A':
            if (!Aexp.isEmpty()) {
                Aexp.clear();
                Acoff.clear();
            } else {
                throw new RuntimeException("Check Clear");
            }
            break;
        case 'B':
            if (!Bexp.isEmpty()) {
                Bexp.clear();
                Bcoff.clear();
            } else {
                throw new RuntimeException("Check Clear");
            }
            break;
        case 'C':
            if (!Cexp.isEmpty()) {
                Cexp.clear();
                Ccoff.clear();
            } else {
                throw new RuntimeException("Check Clear");
            }
            break;
        default:
            break;
        }

    }

    @Override
    public float evaluatePolynomial(final char poly, final float value) {
        // TODO Auto-generated method stub
        float result = 0;
        switch (poly) {
        case 'A':
            if (!Aexp.isEmpty()) {
                for (int i = 0; i < Acoff.size(); i++) {
                    result += (Float.valueOf(Acoff.get(i).toString()) * Math
                            .pow(value, Float.valueOf(Aexp.get(i).toString())));
                }
            } else {
                throw new RuntimeException("Check Evaluate");
            }
            break;
        case 'B':
            if (!Bexp.isEmpty()) {
                for (int i = 0; i < Bcoff.size(); i++) {
                    result += (Float.valueOf(Bcoff.get(i).toString()) * Math
                            .pow(value, Float.valueOf(Bexp.get(i).toString())));
                }

            } else {
                throw new RuntimeException("Check Evaluate");
            }
            break;
        case 'C':
            if (!Cexp.isEmpty()) {
                for (int i = 0; i < Ccoff.size(); i++) {
                    result += (Float.valueOf(Ccoff.get(i).toString()) * Math
                            .pow(value, Float.valueOf(Cexp.get(i).toString())));
                }

            } else {
                throw new RuntimeException("Check Evaluate");
            }
            break;
        default:
            throw new RuntimeException("Check Evaluate");

        }
        return result;
    }

    @Override
    public int[][] add(final char poly1, final char poly2) {
        // TODO Auto-generated method stub
        if (poly1 == poly2) {
            int[][] array;
            if (poly1 == 'A' && !Aexp.isEmpty()) {
                operation = true;
                array = toArray(Acoff, Aexp);
                setPolynomial('R', merge(array, array));
                operation = false;
                return merge(array, array);
            }
            if (poly1 == 'B' && !Bexp.isEmpty()) {
                operation = true;
                array = toArray(Bcoff, Bexp);
                setPolynomial('R', merge(array, array));
                operation = false;

                return merge(array, array);
            }
            if (poly1 == 'C' && !Cexp.isEmpty()) {
                operation = true;
                array = toArray(Ccoff, Cexp);
                setPolynomial('R', merge(array, array));
                operation = false;
                return merge(array, array);
            }
        } else {
            int[][] arrayOne, arrayTwo;
            if (poly1 == 'A' && !Aexp.isEmpty()) {
                arrayOne = toArray(Acoff, Aexp);
                operation = true;
                if (poly2 == 'B') {
                    arrayTwo = toArray(Bcoff, Bexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                }
                if (poly2 == 'C') {
                    arrayTwo = toArray(Ccoff, Cexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                }
                /*
                 * if (poly2 == 'R') { arrayTwo = toArray(Rcoff, Rexp);
                 * setPolynomial('R', merge(arrayOne, arrayTwo)); return
                 * merge(arrayOne, arrayTwo); }
                 */
                if (poly2 == 'T') {
                    arrayTwo = toArray(tmpcoff, tmpexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                } else {

                    throw new RuntimeException(
                            "No other parameter is not permitted");
                }
            } else if (poly1 == 'B' && !Bexp.isEmpty()) {
                operation = true;
                arrayOne = toArray(Bcoff, Bexp);
                if (poly2 == 'A') {
                    return add('A', 'B');
                }
                if (poly2 == 'C') {
                    arrayTwo = toArray(Ccoff, Cexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                } else if (poly2 == 'T') {
                    arrayTwo = toArray(tmpcoff, tmpexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                } else {
                    throw new RuntimeException(
                            "No other parameter is not permitted");
                }
            } else if (poly1 == 'C' && !Cexp.isEmpty()) {
                operation = true;
                arrayOne = toArray(Ccoff, Cexp);
                if (poly2 == 'A') {
                    return add('A', 'C');
                }
                if (poly2 == 'B') {
                    return add('B', 'C');
                }
                if (poly2 == 'T') {
                    arrayTwo = toArray(tmpcoff, tmpexp);
                    setPolynomial('R', merge(arrayOne, arrayTwo));
                    operation = false;
                    return merge(arrayOne, arrayTwo);
                }

            }
        }
        if (Rexp.isEmpty()) {
            throw new RuntimeException("Check add ");
        }
        return null;
    }

    @Override
    public int[][] subtract(final char poly1, final char poly2) {
        // TODO Auto-generated method stub
        if (poly1 == poly2) {
            operation = true;
            int[][] returnValue = new int[][] { { 0, 0 } };
            if (poly1 == 'A' && !Aexp.isEmpty()) {
                setPolynomial('R', returnValue);
                operation = false;
                return returnValue;
            } else if (poly1 == 'B' && !Bexp.isEmpty()) {
                setPolynomial('R', returnValue);
                operation = false;
                return returnValue;
            } else if (poly1 == 'C' && !Cexp.isEmpty()) {
                setPolynomial('R', returnValue);
                operation = false;
                return returnValue;
            }
        } else {
            tmpexp.clear();
            tmpcoff.clear();
            operation = true;
            if (poly2 == 'A') {
                for (int i = 0; i < Aexp.size(); i++) {
                    tmpexp.add(Integer.valueOf(Aexp.get(i).toString()));
                    tmpcoff.add(-1 * Integer.valueOf(Acoff.get(i).toString()));
                }
                operation = false;
                return add(poly1, 'T');
            } else if (poly2 == 'B') {
                for (int i = 0; i < Bexp.size(); i++) {
                    tmpexp.add(Integer.valueOf(Bexp.get(i).toString()));
                    tmpcoff.add(-1 * Integer.valueOf(Bcoff.get(i).toString()));
                }
                operation = false;
                return add(poly1, 'T');

            } else if (poly2 == 'C') {
                for (int i = 0; i < Cexp.size(); i++) {
                    tmpexp.add(Integer.valueOf(Cexp.get(i).toString()));
                    tmpcoff.add(-1 * Integer.valueOf(Ccoff.get(i).toString()));
                }
                operation = false;
                return add(poly1, 'T');
            }
        }
        return null;
    }

    @Override
    public int[][] multiply(final char poly1, final char poly2) {
        // TODO Auto-generated method stub
        int[][] arrayOne, arrayTwo;
        if (poly1 == 'A' && poly2 == 'B' || poly1 == 'B' && poly2 == 'A') {
            operation = true;
            arrayOne = toArray(Acoff, Aexp);
            arrayTwo = toArray(Bcoff, Bexp);
            setPolynomial('R', multi(arrayOne, arrayTwo));
            operation = false;
            return multi(arrayOne, arrayTwo);
        }
        if (poly1 == 'A' && poly2 == 'C' || poly1 == 'C' && poly2 == 'A') {
            operation = true;
            arrayOne = toArray(Acoff, Aexp);
            arrayTwo = toArray(Ccoff, Cexp);
            setPolynomial('R', multi(arrayOne, arrayTwo));
            operation = false;
            return multi(arrayOne, arrayTwo);
        }
        if (poly1 == 'B' && poly2 == 'C' || poly1 == 'C' && poly2 == 'B') {
            operation = true;
            arrayOne = toArray(Ccoff, Cexp);
            arrayTwo = toArray(Bcoff, Bexp);
            setPolynomial('R', multi(arrayOne, arrayTwo));
            operation = false;
            return multi(arrayOne, arrayTwo);
        }
        if (poly1 == poly2) {
            operation = true;
            switch (poly1) {
            case 'A':
                arrayOne = toArray(Acoff, Aexp);
                setPolynomial('R', multi(arrayOne, arrayOne));
                operation = false;
                return multi(arrayOne, arrayOne);
            case 'B':
                arrayTwo = toArray(Bcoff, Bexp);
                setPolynomial('R', multi(arrayTwo, arrayTwo));
                operation = false;
                return multi(arrayTwo, arrayTwo);
            case 'C':
                arrayOne = toArray(Ccoff, Cexp);
                setPolynomial('R', multi(arrayOne, arrayOne));
                operation = false;
                return multi(arrayOne, arrayOne);
            default:
                throw new RuntimeException("Not valid");
            }
        }
        return null;
    }

    /**
     * @author wasfy good
     *
     */
    private int[][] merge(final int[][] poly1, final int[][] poly2) {
        // TODO Auto-generated method stub
        int i = 0, j = 0, k = 0;
        int[][] tmp = new int[poly1.length + poly2.length][2];
        while (i < poly1.length && j < poly2.length) {
            if (poly1[i][1] < poly2[j][1]) {
                tmp[k][1] = poly2[j][1];
                tmp[k][0] = poly2[j][0];
                k++;
                j++;
            } else if (poly1[i][1] > poly2[j][1]) {
                tmp[k][1] = poly1[i][1];
                tmp[k][0] = poly1[i][0];
                k++;
                i++;

            } else {
                tmp[k][1] = poly1[i][1];
                tmp[k][0] = poly2[j][0] + poly1[i][0];
                i++;
                j++;
                k++;
            }
        }
        while (i < poly1.length) {
            tmp[k][1] = poly1[i][1];
            tmp[k][0] = poly1[i][0];
            k++;
            i++;
        }
        while (j < poly2.length) {
            tmp[k][1] = poly2[j][1];
            tmp[k][0] = poly2[j][0];
            k++;
            j++;
        }
        int[][] result = new int[k][2];
        for (i = 0; i < k; i++) {
            if (tmp[i][0] != 0) {
                result[i][0] = tmp[i][0];
                result[i][1] = tmp[i][1];
            }
        }
        if (result[0][0] == 0) {
            return new int[][] { { 0, 0 } };
        }
        return result;
    }

    /**
     * @author wasfy this is test
     *
     */
    private String printpoly(final int[][] poly) {
        // TODO Auto-generated method stub
        String message = new String();
        if (poly.length == 1 && poly[0][0] == 0) {
            return "0";
        }
        for (int i = 0; i < poly.length; i++) {
            if (poly[i][0] == 0) {
                continue;
            }
            if ((poly[i][0] != 1 && poly[i][0] != -1) || poly[i][1] == 0) {
                message += poly[i][0];
            } else if (poly[i][0] == -1 /* && poly[i][1] == 1 */) {
                message += "-";
            }
            if (poly[i][1] != 0) {
                if (poly[i][1] == 1) {
                    message += "x";
                } else {
                    message += "x^" + poly[i][1];
                }
                if (i + 1 != poly.length) {
                    if (poly[i + 1][0] != 1 || poly[i + 1][0] != -1) {
                        if (poly[i + 1][0] > 0) {
                            message += "+";
                        }
                    }
                }
            }
        }
        return message;
    }

    /**
     * @author wasfy this is test
     *
     */
    private int[][] multi(final int[][] poly1, final int[][] poly2) {
        // TODO Auto-generated method stub
        int i, j;
        int size = 1000000;
        int[] array = new int[size];
        for (i = 0; i < poly1.length; i++) {
            for (j = 0; j < poly2.length; j++) {
                array[poly1[i][1] + poly2[j][1]] += poly1[i][0] * poly2[j][0];
            }
        }
        for (i = poly1[0][1]
                + poly2[0][1], j = 0; i >= poly1[poly1.length - 1][1]
                        + poly2[poly2.length - 1][1]; i--) {
            if (array[i] != 0) {
                j++;
            }
        }
        if (j == 0) {
            return new int[][] { { 0, 0 } };
        }
        int[][] result = new int[j][2];
        for (i = poly1[0][1]
                + poly2[0][1], j = 0; i >= poly1[poly1.length - 1][1]
                        + poly2[poly2.length - 1][1]; i--) {
            if (array[i] != 0) {
                result[j][0] = array[i];
                result[j][1] = i;
                j++;
            }
        }
        return result;
    }

    /**
     * @author wasfy this is test
     *
     */
    private int[][] toArray(final OurSingleLinked a, final OurSingleLinked b) {
        int[][] result = new int[a.size()][2];
        for (int i = 0; i < a.size(); i++) {
            result[i][1] = Integer.valueOf(b.get(i).toString());
            result[i][0] = Integer.valueOf(a.get(i).toString());
        }
        return result;
    }

    /**
     * @author wasfy this is test
     *
     */
    public boolean isValid(final char poly) {
        if (poly == 'A') {
            if (!Aexp.isEmpty()) {
                return true;
            }
        }
        if (poly == 'B') {
            if (!Bexp.isEmpty()) {
                return true;
            }
        }
        if (poly == 'C') {
            if (!Cexp.isEmpty()) {
                return true;
            }
        }
        if (poly == 'R') {
            if (!Rexp.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
