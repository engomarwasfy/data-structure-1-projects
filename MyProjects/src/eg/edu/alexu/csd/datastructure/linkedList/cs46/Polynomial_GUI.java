package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import java.util.Scanner;

/**
 * @author wasfy
 * this is test
 *
 */
public class Polynomial_GUI {

    /**
     * @author wasfy
     * this is test
     *
     */
  static char VarName;

  /**
   * @author wasfy
   * this is test
   *
   */
  static PolynomialSolver poly = new PolynomialSolver();

  /**
   * @author wasfy
   * this is test
   *
   */
  static Scanner sc = new Scanner(System.in);

  /**
   * @author wasfy
   * this is test
   *
   */
  public static void main(final String[] args) {
    // TODO Auto-generated method stub
    boolean wrong = true;
    String chooseOperation;
    while (wrong) {
      System.out.println("Please choose an action");
      System.out.println("--------------------------------------");
      System.out.println("1- Set a polynomial variable");
      System.out.println("2- Print the value of a polynomial variable");
      System.out.println("3- Add two polynomials ");
      System.out.println("4- Subtract two polynomials ");
      System.out.println("5- Multiply two polynomials ");
      System.out.println("6- Evaluate a polynomial at some point");
      System.out.println("7- Clear a polynomial variable");
      System.out.println("====================================================================");
      chooseOperation = sc.nextLine();
      switch (chooseOperation) {
      case "1":
        // wrong = false;
        System.out.println("Insert the variable name : A, B or C");
        VarName = sc.nextLine().charAt(0);
        if (VarName == 'A' || VarName == 'B' || VarName == 'C') {
          try {
            System.out.println(
                "Insert the polynomial terms in the form : (coeff1 , exponent1 ), (coeff2 , exponent2 ), ..");
            String polyTaker = sc.nextLine();
            polyTaker = polyTaker.replace(" ", "");
            polyTaker = polyTaker.replace(",", " ");
            polyTaker = polyTaker.replace(")", "");
            polyTaker = polyTaker.replace("(", "");
            String[] taken = polyTaker.split(" ");

            int[][] array = new int[taken.length / 2][2];
            for (int i = 0; i < taken.length; i += 2) {
              array[i / 2][0] = Integer.parseInt(taken[i]);
              array[i / 2][1] = Integer.parseInt(taken[i + 1]);
            }
            switch (VarName) {
            case 'A':
              poly.setPolynomial('A', array);
              System.out.println("Polynomial A is set");
              break;
            case 'B':
              poly.setPolynomial('B', array);
              System.out.println("Polynomial B is set");
              break;
            case 'C':
              poly.setPolynomial('C', array);
              System.out.println("Polynomial C is set");
            default:
                break;
            }
          } catch (RuntimeException e) {
            System.out.println("Can't set this variable");
          }
        } else {
          System.out.println("Can't set this variable");
        }
        break;
      case "2":
        System.out.println("Insert the variable name : A, B, C or R");
        VarName = sc.nextLine().charAt(0);
        if (!poly.isValid(VarName)) {
          System.out.println("Variable is not set");
          break;
        }
        switch (VarName) {
        case 'A':
          System.out.println("Value in A : " + poly.print('A'));
          break;
        case 'B':
          System.out.println("Value in B : " + poly.print('B'));
          break;
        case 'C':
          System.out.println("Value in C : " + poly.print('C'));
          break;
        case 'R':
          System.out.println("Value in R : " + poly.print('R'));
          break;
        default:
          System.out.println("Variable not found");
        }
        break;
      case "3":
        take('a');
        break;
      case "4":
        take('s');
        break;
      case "5":
        take('m');
        break;
      case "6":
        boolean finished = false;
        float point;

        System.out.println("Insert polynomial variable name : A, B, C or E to go to main");
        VarName = sc.nextLine().charAt(0);
        if (poly.isValid(VarName)) {
          finished = true;
        } else if (VarName != 'E') {
          System.out.println("Variable not set yet");
        } else {
          break;
        }
        if (finished) {
          System.out.println("Enter the point : ");
          point = Float.parseFloat(sc.nextLine());
          System.out.println("The result is " + poly.evaluatePolynomial(VarName, point));
        }
        break;
      case "7":
        System.out.println("choose variable A, B or C to clear");
        VarName = sc.nextLine().charAt(0);
        try {
          switch (VarName) {
          case 'A':
            poly.clearPolynomial('A');
            break;
          case 'B':
            poly.clearPolynomial('B');
            break;
          case 'C':
            poly.clearPolynomial('C');
            break;
          default:
            System.out.println("No such variable");
          }
        } catch (RuntimeException e) {
          System.out.println("Varable is not yet set");
        }
        break;
      default:
        System.out.println("Please Choose Again");
      }
    }
  }

  /**
   * @author wasfy
   * this is test
   *
   */
  public static void take(char operation) {
    char varName1 = ' ';
    char varName2 = ' ';
    boolean finished = false;
    int[][] result;
    while (!finished) {
      System.out.println("Insert first operand variable name : A, B, C or E to go to the main ");
      varName1 = sc.nextLine().charAt(0);
      if (poly.isValid(varName1)) {
        finished = true;
      } else if (varName1 == 'E') {
        return;
      } else {
        System.out.println("Variable not set\n");
      }
    }
    boolean finished2 = false;
    while (!finished2) {
      System.out.println("Insert second operand variable name : A, B or C");
      varName2 = sc.nextLine().charAt(0);
      if (poly.isValid(varName2)) {
        finished2 = true;
      } else if (varName2 == 'E') {
        return;
      } else {
        System.out.println("Variable not set");
      }
    }
    switch (operation) {
    case 'a':
      result = poly.add(varName1, varName2);
      System.out.print("Result set in R:");
      for (int i = 0; i < result.length; i++) {
        System.out.print("(" + result[i][0] + "," + result[i][1] + ")");
        if (i + 1 != result.length) {
          System.out.print(" ,");
        }
      }
      break;

    case 's':
      result = poly.subtract(varName1, varName2);
      System.out.print("Result set in R: ");
      for (int i = 0; i < result.length; i++) {
        System.out.print("(" + result[i][0] + "," + result[i][1] + ")");
        if (i + 1 != result.length) {
          System.out.print(" ,");
        }
      }
      break;
    case 'm':
      result = poly.multiply(varName1, varName2);
      System.out.print("Result set in R:");
      for (int i = 0; i < result.length; i++) {
        System.out.print("(" + result[i][0] + "," + result[i][1] + ")");
        if (i + 1 != result.length) {
          System.out.print(" ,");
        }
      }
    default:
        break;
    }
    System.out.println("\n");
  }
}