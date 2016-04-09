package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import java.util.Scanner;

import javax.crypto.AEADBadTagException;

public class Polynomial_GUI {
    static OurSingleLinked Acoff = new OurSingleLinked();
    static OurSingleLinked Aexp = new OurSingleLinked();
    static OurSingleLinked Bcoff = new OurSingleLinked();
    static OurSingleLinked Bexp = new OurSingleLinked();
    static OurSingleLinked Ccoff = new OurSingleLinked();
    static OurSingleLinked Cexp = new OurSingleLinked();
    static PolynomialSolver poly = new PolynomialSolver();
    static Scanner sc = new Scanner(System.in);
    static char VarName;

    public static void main(final String[] args) {
        // TODO Auto-generated method stub
        // OurSingleLinked Acoff = new OurSingleLinked();

        String polyTaker;
        boolean wrong = true;
        boolean coeff = true;
        int chooseOperation;

        System.out.println("Please choose an action");
        System.out.println("--------------------------------------");
        System.out.println("1- Set a polynomial variable");
        System.out.println("2- Print the value of a polynomial variable");
        System.out.println("3- Add two polynomials ");
        System.out.println("4- Subtract two polynomials ");
        System.out.println("5- Multiply two polynomials ");
        System.out.println(" 6- Evaluate a polynomial at some point");
        System.out.println("7- Clear a polynomial variable");
        System.out.println(
                "====================================================================");
        while (wrong) {
            chooseOperation = sc.nextInt();
            switch (chooseOperation) {
            case 1:
                wrong = false;
                System.out.println("Insert the variable name : A, B or C");
                VarName = sc.next().charAt(0);
                switch (VarName) {
                case 'A':
                    System.out.println(
                            "Insert the polynomial terms in the form : (coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
                    polyTaker = sc.next();
                    for (int i = 0; i < polyTaker.length(); i++) {
                        if (polyTaker.charAt(i) != '('
                                && polyTaker.charAt(i) != ')'
                                && polyTaker.charAt(i) != ' ') {
                            if (coeff) {
                                Acoff.add(polyTaker.charAt(i));
                            } else {
                                Aexp.add(polyTaker.charAt(i));
                            }
                            coeff = !coeff;// true to false to true an so on
                        }
                    }
                    int[][] arrayA = new int[Aexp.size()][2];
                    for (int k = 0; k < polyTaker.length(); k++) {
                        arrayA[k][0] = (int) Acoff.get(k);
                        arrayA[k][1] = (int) Aexp.get(k);
                        poly.setPolynomial('A', arrayA);
                        System.out.println("Polynomial A is set");
                    }
                    break;

                case 'B':
                    System.out.println(
                            "Insert the polynomial terms in the form : (coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
                    polyTaker = sc.next();
                    for (int i = 0; i < polyTaker.length(); i++) {
                        if (polyTaker.charAt(i) != '('
                                && polyTaker.charAt(i) != ')'
                                && polyTaker.charAt(i) != ' ') {
                            if (coeff) {
                                Bcoff.add(polyTaker.charAt(i));
                            } else {
                                Bexp.add(polyTaker.charAt(i));
                            }
                            coeff = !coeff;// true to false to true an so on
                        }
                    }
                    int[][] arrayB = new int[Bexp.size()][2];
                    for (int k = 0; k < polyTaker.length(); k++) {
                        arrayB[k][0] = (int) Bcoff.get(k);
                        arrayB[k][1] = (int) Bexp.get(k);
                        poly.setPolynomial('B', arrayB);
                        System.out.println("Polynomial B is set");
                    }
                    break;

                case 'C':
                    System.out.println(
                            "Insert the polynomial terms in the form : (coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
                    polyTaker = sc.next();
                    for (int i = 0; i < polyTaker.length(); i++) {
                        if (polyTaker.charAt(i) != '('
                                && polyTaker.charAt(i) != ')'
                                && polyTaker.charAt(i) != ' ') {
                            if (coeff) {
                                Acoff.add(polyTaker.charAt(i));
                            } else {
                                Aexp.add(polyTaker.charAt(i));
                            }
                            coeff = !coeff;// true to false to true an so on
                        }
                    }
                    int[][] arrayC = new int[Cexp.size()][2];
                    for (int k = 0; k < polyTaker.length(); k++) {
                        arrayC[k][0] = (int) Ccoff.get(k);
                        arrayC[k][1] = (int) Cexp.get(k);
                        poly.setPolynomial('C', arrayC);
                        System.out.println("Polynomial C is set");
                    }
                    break;

                default:
                    System.out.println("error");
                }

                break;
            case 2:
                wrong = false;
                System.out.println("Insert the variable name : A, B, C or R");
                VarName = sc.next().charAt(0);
                switch (VarName) {
                case 'A':
                    System.out.println("A Value in A:" + poly.print('A'));
                    break;
                case 'B':
                    System.out.println("B Value in B:" + poly.print('B'));
                    break;
                case 'C':
                    System.out.println("C Value in C:" + poly.print('C'));
                    break;
                case 'R':
                    System.out.println("R Value in R:" + poly.print('R'));
                    break;
                default:
                    System.out.println("error");
                }
            case 3:
                wrong = false;

                take('a');

            case 4:
                wrong = false;
                take('s');

            case 5:
                wrong = false;
                take('m');

            case 6:
                wrong = false;
                boolean finished = false;
                float point;
                while (!finished) {
                    System.out.println(
                            "Insert first operand variable name : A, B or C");
                    VarName = sc.next().charAt(0);
                    switch (VarName) {
                    case 'A':
                        if (poly.print('A') == null) {
                            System.out.println("Variable not set");
                        } else {
                            finished = true;
                        }
                        break;

                    case 'B':
                        if (poly.print('B') == null) {
                            System.out.println("Variable not set");
                        } else {
                            finished = true;
                        }
                        break;

                    case 'C':
                        if (poly.print('C') == null) {
                            System.out.println("Variable not set");
                        } else {
                            finished = true;
                        }
                        break;

                    case 'R':
                        if (poly.print('R') == null) {
                            System.out.println("Variable not set");
                        } else {
                            finished = true;
                        }
                        break;
                    default:
                        System.out.println("error");
                    }
                }
                point = sc.nextFloat();
                System.out.println("The result is"
                        + poly.evaluatePolynomial(VarName, point));

            case 7:
                wrong = false;
                System.out.println("choose varable name to clear");
                VarName = sc.next().charAt(0);
                switch (VarName) {
                case 'A':
                    poly.clearPolynomial('A');
                case 'B':
                    poly.clearPolynomial('B');
                case 'C':
                    poly.clearPolynomial('C');
                default:
                    System.out.println("Error");
                }

            default:
                System.out.println("Please Choose Again");
            }
        }
    }

    public static void take(char operation) {
        char varName1;
        char varName2;
        boolean finished = false;
        int[][] add;
        int[][] sub;
        int[][] multiply;

        while (!finished) {
            System.out
                    .println("Insert first operand variable name : A, B or C");
            varName1 = sc.next().charAt(0);
            switch (varName1) {
            case 'A':
                if (poly.print('A') == null) {
                    System.out.println("Variable not set");
                } else {
                    finished = true;
                }
                break;

            case 'B':
                if (poly.print('B') == null) {
                    System.out.println("Variable not set");
                } else {
                    finished = true;
                }
                break;

            case 'C':
                if (poly.print('C') == null) {
                    System.out.println("Variable not set");
                } else {
                    finished = true;
                }
                break;

            case 'R':
                if (poly.print('R') == null) {
                    System.out.println("Variable not set");
                } else {
                    finished = true;
                }
                break;
            default:
                System.out.println("error");
            }
            boolean finished2 = false;

            while (!finished2) {
                System.out.println(
                        "Insert second operand variable name : A, B or C");
                varName2 = sc.next().charAt(0);
                switch (varName2) {
                case 'A':
                    if (poly.print('A') == null) {
                        System.out.println("Variable not set");
                    } else {
                        finished = true;
                    }
                    break;

                case 'B':
                    if (poly.print('B') == null) {
                        System.out.println("Variable not set");
                    } else {
                        finished = true;
                    }
                    break;

                case 'C':
                    if (poly.print('C') == null) {
                        System.out.println("Variable not set");
                    } else {
                        finished = true;
                    }
                    break;

                case 'R':
                    if (poly.print('R') == null) {
                        System.out.println("Variable not set");
                    } else {
                        finished = true;
                    }
                    break;
                default:
                    System.out.println("error");
                }

                switch (operation) {
                case 'a':
                    add = poly.add(varName1, varName2);
                    System.out.print("Result set in R:");
                    for (int i = 0; i < add.length; i++) {
                        System.out.print(
                                "(" + add[i][0] + "," + add[i][1] + ")" + ",");
                    }
                    break;

                case 's':
                    sub = poly.subtract(varName1, varName2);
                    System.out.print("Result set in R:");
                    for (int i = 0; i < sub.length; i++) {
                        System.out.print(
                                "(" + sub[i][0] + "," + sub[i][1] + ")" + ",");
                    }
                case 'm':
                    multiply = poly.multiply(varName1, varName2);
                    System.out.print("Result set in R:");
                    for (int i = 0; i < multiply.length; i++) {
                        System.out.print("(" + multiply[i][0] + ","
                                + multiply[i][1] + ")" + ",");
                    }
                }

            }

        }
    }
}
