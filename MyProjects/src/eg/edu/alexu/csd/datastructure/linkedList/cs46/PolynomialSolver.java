package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

public class PolynomialSolver implements IPolynomialSolver {

  private OurSingleLinked Acoff = new OurSingleLinked();
  private OurSingleLinked Aexp = new OurSingleLinked();
  private OurSingleLinked Bcoff = new OurSingleLinked();
  private OurSingleLinked Bexp = new OurSingleLinked();
  private OurSingleLinked Ccoff = new OurSingleLinked();
  private OurSingleLinked Cexp = new OurSingleLinked();
  private OurSingleLinked Rcoff = new OurSingleLinked();
  private OurSingleLinked Rexp = new OurSingleLinked();

  @Override
  public void setPolynomial(final char poly, final int[][] terms) {
    // TODO Auto-generated method stub
    int checker = 1000000;
    switch (poly) {
    case 'A':
      for (int i = 0; i < terms.length; i++) {
        Acoff.add(terms[i][0]);
        if (checker > terms[i][1] && terms[i][1] > -1) {
          Aexp.add(terms[i][1]);
          checker = terms[i][1];
        } else {
          throw new RuntimeException("Check Set");
        }
      }
      break;
    case 'B':
      for (int i = 0; i < terms.length; i++) {
        Bcoff.add(terms[i][0]);
        if (checker > terms[i][1] && terms[i][1] > -1) {
          Bexp.add(terms[i][1]);
          checker = terms[i][1];
        } else {
          throw new RuntimeException("Check Set");
        }
      }

      break;
    case 'C':
      for (int i = 0; i < terms.length; i++) {
        Ccoff.add(terms[i][0]);
        if (checker > terms[i][1] && terms[i][1] > -1) {
          Cexp.add(terms[i][1]);
          checker = terms[i][1];
        } else {
          throw new RuntimeException("Check Set");
        }
      }
      break;
    default:
      throw new RuntimeException("Check Set");
    }
  }

  @Override
  public String print(final char poly) {
    // TODO Auto-generated method stub
    String message = new String();
    switch (poly) {
    case 'A':
      if (Acoff.isEmpty()) {
        return null;
      }
      for (int i = 0; i < Acoff.size(); i++) {
        if (Acoff.get(i).equals(0)) {
          continue;
        }
        if ((!Acoff.get(i).equals(1) && !Acoff.get(i).equals(-1)) || Aexp.get(i).equals(0)) {
          message += Acoff.get(i);
        } else if (Acoff.get(i).equals(-1) && Aexp.get(i).equals(1)) {
          message += "-";
        }
        if (!Aexp.get(i).equals(0)) {
          if (Aexp.get(i).equals(1)) {
            message += "x";
          } else {
            message += "x^" + Aexp.get(i);
          }
          if (i + 1 != Aexp.size()) {
            if (!Acoff.get(i + 1).equals(1) || !Acoff.get(i + 1).equals(-1)) {
              if (Integer.valueOf(Acoff.get(i + 1).toString()) > 0) {
                message += "+";
              }
            }
          }
        }
      }
      break;
    case 'B':
      if (Bcoff.isEmpty()) {
        return null;
      }
      for (int i = 0; i < Bcoff.size(); i++) {
        if (Bcoff.get(i).equals(0)) {
          continue;
        }
        if ((!Bcoff.get(i).equals(1) && !Bcoff.get(i).equals(-1)) || Bexp.get(i).equals(0)) {
          message += Bcoff.get(i);
        } else if (Bcoff.get(i).equals(-1) && Bexp.get(i).equals(1)) {
          message += "-";
        }
        if (!Bexp.get(i).equals(0)) {
          if (Bexp.get(i).equals(1)) {
            message += "x";
          } else {
            message += "x^" + Bexp.get(i);
          }
          if (i + 1 != Bexp.size()) {
            if (!Bcoff.get(i + 1).equals(1) || !Bcoff.get(i + 1).equals(-1)) {
              if (Integer.valueOf(Bcoff.get(i + 1).toString()) > 1) {
                message += "+";
              }
            }
          }
        }
      }

      break;
    case 'C':
      if (Ccoff.isEmpty()) {
        return null;
      }
      for (int i = 0; i < Ccoff.size(); i++) {
        if (Ccoff.get(i).equals(0)) {
          continue;
        }
        if ((!Ccoff.get(i).equals(1) && !Ccoff.get(i).equals(-1)) || Cexp.get(i).equals(0)) {
          message += Ccoff.get(i);
        } else if (Ccoff.get(i).equals(-1) && Cexp.get(i).equals(1)) {
          message += "-";
        }
        if (!Cexp.get(i).equals(0)) {
          if (Cexp.get(i).equals(1)) {
            message += "x";
          } else {
            message += "x^" + Cexp.get(i);
          }
          if (i + 1 != Cexp.size()) {
            if (!Ccoff.get(i + 1).equals(1) || !Ccoff.get(i + 1).equals(-1)) {
              if (Integer.valueOf(Ccoff.get(i + 1).toString()) > 1) {
                message += "+";
              }
            }
          }
        }
      }

      break;
    case 'R':
      if (Rcoff.isEmpty()) {
        return null;
      }
      for (int i = 0; i < Rcoff.size(); i++) {
        if (Rcoff.get(i).equals(0)) {
          continue;
        }
        if ((!Rcoff.get(i).equals(1) && !Rcoff.get(i).equals(-1)) || Rexp.get(i).equals(0)) {
          message += Rcoff.get(i);
        } else if (Rcoff.get(i).equals(-1) && Rexp.get(i).equals(1)) {
          message += "-";
        }
        if (!Rexp.get(i).equals(0)) {
          if (Rexp.get(i).equals(1)) {
            message += "x";
          } else {
            message += "x^" + Rexp.get(i);
          }
          if (i + 1 != Rexp.size()) {
            if (!Rcoff.get(i + 1).equals(1) || !Rcoff.get(i + 1).equals(-1)) {
              if (Integer.valueOf(Rcoff.get(i + 1).toString()) > 0) {
                message += "+";
              }
            }
          }
        }
      }

      break;
    default:
      break;
    }
    return message;
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
          result += (Float.valueOf(Acoff.get(i).toString())
              * Math.pow(value, Float.valueOf(Aexp.get(i).toString())));
        }
      } else {
        throw new RuntimeException("Check Evaluate");
      }
      break;
    case 'B':
      if (!Bexp.isEmpty()) {
        for (int i = 0; i < Bcoff.size(); i++) {
          result += (Float.valueOf(Bcoff.get(i).toString())
              * Math.pow(value, Float.valueOf(Bexp.get(i).toString())));
        }

      } else {
        throw new RuntimeException("Check Evaluate");
      }
      break;
    case 'C':
      if (!Cexp.isEmpty()) {
        for (int i = 0; i < Ccoff.size(); i++) {
          result += (Float.valueOf(Ccoff.get(i).toString())
              * Math.pow(value, Float.valueOf(Cexp.get(i).toString())));
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
    Rexp.clear();
    Rcoff.clear();
    if (poly1 == poly2) {
      if (poly1 == 'A' && !Aexp.isEmpty()) {
        for (int i = 0; i < Aexp.size(); i++) {
          Rexp.add(Aexp.get(i));
          Rcoff.add(2 * Integer.valueOf(Acoff.get(i).toString()));
        }
      } else if (poly1 == 'B' && !Bexp.isEmpty()) {
        for (int i = 0; i < Bexp.size(); i++) {
          Rexp.add(Bexp.get(i));
          Rcoff.add(2 * Integer.valueOf(Bcoff.get(i).toString()));
        }
      } else if (poly1 == 'C' && !Cexp.isEmpty()) {
        for (int i = 0; i < Cexp.size(); i++) {
          Rexp.add(Cexp.get(i));
          Rcoff.add(2 * Integer.valueOf(Ccoff.get(i).toString()));
        }
      }
    } else {
      if (poly1 == 'A' && !Aexp.isEmpty()) {
        if (poly2 == 'B') {
          int i = 0, j = 0;
          while (i < Aexp.size() && j < Bexp.size()) {
            if (Integer.valueOf(Aexp.get(i).toString()) < Integer.valueOf(Bexp.get(j).toString())) {
              Rexp.add(Bexp.get(j));
              Rcoff.add(Bcoff.get(j));
              j++;
            } else if (Integer.valueOf(Aexp.get(i).toString()) > Integer
                .valueOf(Bexp.get(j).toString())) {
              Rexp.add(Aexp.get(i));
              Rcoff.add(Acoff.get(i));
              i++;

            } else {
              Rexp.add(Aexp.get(i));
              Rcoff.add(Integer.valueOf(Acoff.get(i).toString())
                  + Integer.valueOf(Bcoff.get(j).toString()));
              i++;
              j++;
            }
          }
          while (i < Aexp.size()) {
            Rexp.add(Aexp.get(i));
            Rcoff.add(Acoff.get(i));
            i++;
          }
          while (j < Bexp.size()) {
            Rexp.add(Bexp.get(j));
            Rcoff.add(Bcoff.get(j));
            j++;
          }
        } else {
          int i = 0, j = 0;
          while (i < Aexp.size() && j < Cexp.size()) {
            if (Integer.valueOf(Aexp.get(i).toString()) < Integer.valueOf(Cexp.get(j).toString())) {
              Rexp.add(Cexp.get(j));
              Rcoff.add(Ccoff.get(j));
              j++;
            } else if (Integer.valueOf(Aexp.get(i).toString()) > Integer
                .valueOf(Cexp.get(j).toString())) {
              Rexp.add(Aexp.get(i));
              Rcoff.add(Acoff.get(i));
              i++;

            } else {
              Rexp.add(Aexp.get(i));
              Rcoff.add(Integer.valueOf(Acoff.get(i).toString())
                  + Integer.valueOf(Ccoff.get(j).toString()));
              i++;
              j++;
            }
          }
          while (i < Aexp.size()) {
            Rexp.add(Aexp.get(i));
            Rcoff.add(Acoff.get(i));
            i++;
          }
          while (j < Cexp.size()) {
            Rexp.add(Cexp.get(j));
            Rcoff.add(Ccoff.get(j));
            j++;
          }
        }
      } else if (poly1 == 'B' && !Bexp.isEmpty()) {
        if (poly2 == 'A') {
          return add('A', 'B');
        }
        if (poly2 == 'C') {
          int i = 0, j = 0;
          while (i < Bexp.size() && j < Cexp.size()) {
            if (Integer.valueOf(Bexp.get(i).toString()) < Integer.valueOf(Cexp.get(j).toString())) {
              Rexp.add(Cexp.get(j));
              Rcoff.add(Ccoff.get(j));
              j++;
            } else if (Integer.valueOf(Bexp.get(i).toString()) > Integer
                .valueOf(Cexp.get(j).toString())) {
              Rexp.add(Bexp.get(i));
              Rcoff.add(Bcoff.get(i));
              i++;

            } else {
              Rexp.add(Bexp.get(i));
              Rcoff.add(Integer.valueOf(Bcoff.get(i).toString())
                  + Integer.valueOf(Ccoff.get(j).toString()));
              i++;
              j++;
            }
          }
          while (i < Bexp.size()) {
            Rexp.add(Bexp.get(i));
            Rcoff.add(Bcoff.get(i));
            i++;
          }
          while (j < Cexp.size()) {
            Rexp.add(Cexp.get(j));
            Rcoff.add(Ccoff.get(j));
            j++;
          }
        }
      } else if (poly1 == 'C' && !Cexp.isEmpty()) {
        if (poly2 == 'A') {
          return add('A', 'C');
        }
        if (poly2 == 'B') {
          return add('B', 'C');
        }
      }
    }
    if (Rexp.isEmpty()) {
      throw new RuntimeException("Check ");
    }
    int[][] result = new int[Rexp.size()][2];
    for (int i = 0; i < Rexp.size(); i++) {
      result[i][0] = Integer.valueOf(Rcoff.get(i).toString());
      result[i][1] = Integer.valueOf(Rexp.get(i).toString());
    }
    return result;
  }

  @Override
  public int[][] subtract(final char poly1, final char poly2) {
    // TODO Auto-generated method stub
    Rexp.clear();
    Rcoff.clear();
    if (poly1 == poly2) {
      if (poly1 == 'A' && !Aexp.isEmpty()) {
        for (int i = 0; i < Aexp.size(); i++) {
          Rexp.add(0);
          Rcoff.add(0);
        }
      } else if (poly1 == 'B' && !Bexp.isEmpty()) {
        for (int i = 0; i < Bexp.size(); i++) {
          Rexp.add(0);
          Rcoff.add(0);
        }
      } else if (poly1 == 'C' && !Cexp.isEmpty()) {
        for (int i = 0; i < Cexp.size(); i++) {
          Rexp.add(0);
          Rcoff.add(0);
        }
      }
    } else {
      if (poly2 == 'A') {
        for (int i = 0; i < Aexp.size(); i++) {
          Acoff.set(i, -1 * Integer.valueOf(Acoff.get(i).toString()));
        }
        return add(poly1, 'A');
      } else if (poly2 == 'B') {
        for (int i = 0; i < Bexp.size(); i++) {
          Bcoff.set(i, -1 * Integer.valueOf(Bcoff.get(i).toString()));
        }
        return add(poly1, 'B');

      } else if (poly2 == 'C') {
        for (int i = 0; i < Cexp.size(); i++) {
          Ccoff.set(i, -1 * Integer.valueOf(Ccoff.get(i).toString()));
        }
        return add(poly1, 'C');
      }
    }
    int[][] result = new int[Rexp.size()][2];
    for (int i = 0; i < Rexp.size(); i++) {
      result[i][0] = Integer.valueOf(Rcoff.get(i).toString());
      result[i][1] = Integer.valueOf(Rexp.get(i).toString());
    }
    return result;
  }

  @Override
  public int[][] multiply(final char poly1, final char poly2) {
    // TODO Auto-generated method stub
    Rexp.clear();
    Rcoff.clear();
    int a;
    int b;
    int c;
    int[] arr = new int[1000000];
    if (poly1 == 'A' && poly2 == 'B' || poly1 == 'B' && poly2 == 'A') {
      for (a = 0; a < Aexp.size(); a++) {
        for (b = 0; b < Bexp.size(); b++) {
          arr[Integer.valueOf(Aexp.get(a).toString()) + Integer
              .valueOf(Bexp.get(b).toString())] += (Integer.valueOf(Acoff.get(a).toString())
                  * Integer.valueOf(Bcoff.get(b).toString()));
        }
      }

      for (int i = Integer.valueOf(Aexp.get(0).toString())
          + Integer.valueOf(Bexp.get(0).toString()); i >= Integer
              .valueOf(Aexp.get(Aexp.size() - 1).toString())
              + Integer.valueOf(Bexp.get((Bexp.size() - 1)).toString()); i--) {
        if (arr[i] == 0) {
          continue;
        }
        Rexp.add(i);
        Rcoff.add(arr[i]);
      }

      int[][] array = new int[Rexp.size()][2];
      for (int i = 0; i < Rexp.size(); i++) {
        array[i][0] = Integer.valueOf(Rcoff.get(i).toString());
        array[i][1] = Integer.valueOf(Rexp.get(i).toString());
      }
      return array;
    }
    if (poly1 == 'A' && poly2 == 'C' || poly1 == 'C' && poly2 == 'A') {

      for (a = 0; a < Aexp.size(); a++) {
        for (c = 0; c < Cexp.size(); c++) {
          arr[Integer.valueOf(Aexp.get(a).toString()) + Integer
              .valueOf(Cexp.get(c).toString())] += (Integer.valueOf(Acoff.get(a).toString())
                  * Integer.valueOf(Ccoff.get(c).toString()));
        }
      }

      for (int i = Integer.valueOf(Aexp.get(0).toString()) + Integer.valueOf(
          Cexp.get(0).toString()); i >= (Integer.valueOf(Aexp.get((Aexp.size() - 1)).toString())
              + Integer.valueOf(Cexp.get((Cexp.size() - 1)).toString())); i--) {
        if (arr[i] == 0) {
          continue;
        }
        Rexp.add(i);
        Rcoff.add(arr[i]);
      }
      int[][] array = new int[Rexp.size()][2];
      for (int i = 0; i < Rexp.size(); i++) {
        array[i][0] = Integer.valueOf(Rcoff.get(i).toString());
        array[i][1] = Integer.valueOf(Rexp.get(i).toString());
      }

      return array;
    }
    if (poly1 == 'B' && poly2 == 'C' || poly1 == 'C' && poly2 == 'B') {

      for (b = 0; b < Bexp.size(); b++) {
        for (c = 0; c < Cexp.size(); c++) {
          arr[Integer.valueOf(Bexp.get(b).toString()) + Integer
              .valueOf(Cexp.get(c).toString())] += (Integer.valueOf(Bcoff.get(b).toString())
                  * Integer.valueOf(Ccoff.get(c).toString()));
        }
      }
      for (int i = Integer.valueOf(Bexp.get(0).toString()) + Integer.valueOf(
          Cexp.get(0).toString()); i >= (Integer.valueOf(Bexp.get((Bexp.size() - 1)).toString())
              + Integer.valueOf(Cexp.get((Cexp.size() - 1)).toString())); i--) {
        if (arr[i] == 0) {
          continue;
        }
        Rexp.add(i);
        Rcoff.add(arr[i]);
      }
      int[][] array = new int[Rexp.size()][2];
      for (int i = 0; i < Rexp.size(); i++) {
        array[i][0] = Integer.valueOf(Rcoff.get(i).toString());
        array[i][1] = Integer.valueOf(Rexp.get(i).toString());
      }

      return array;
    }
    if (poly1 == poly2) {
      switch (poly1) {
      case 'A':
        int a1;
        int a2;
        for (a1 = 0; a1 < Aexp.size(); a1++) {
          for (a2 = 0; a2 < Aexp.size(); a2++) {
            arr[Integer.valueOf(Aexp.get(a1).toString()) + Integer
                .valueOf(Aexp.get(a2).toString())] += (Integer.valueOf(Acoff.get(a1).toString())
                    * Integer.valueOf(Acoff.get(a2).toString()));
          }
        }

        for (int i = Integer.valueOf(Aexp.get(0).toString()) + Integer.valueOf(
            Aexp.get(0).toString()); i >= (Integer.valueOf(Aexp.get((Aexp.size() - 1)).toString())
                + Integer.valueOf(Aexp.get((Aexp.size() - 1)).toString())); i--) {
          if (arr[i] == 0) {
            continue;
          }
          Rexp.add(i);
          Rcoff.add(arr[i]);
        }

        int[][] arrayA = new int[Rexp.size()][2];
        for (int i = 0; i < Rexp.size(); i++) {
          arrayA[i][0] = Integer.valueOf(Rcoff.get(i).toString());
          arrayA[i][1] = Integer.valueOf(Rexp.get(i).toString());
        }
        return arrayA;

      case 'B':
        int b1;
        int b2;
        for (b1 = 0; b1 < Bexp.size(); b1++) {
          for (b2 = 0; b2 < Bexp.size(); b2++) {
            arr[Integer.valueOf(Bexp.get(b1).toString()) + Integer
                .valueOf(Bexp.get(b2).toString())] += (Integer.valueOf(Bcoff.get(b1).toString())
                    * Integer.valueOf(Bcoff.get(b2).toString()));
          }
        }

        for (int i = Integer.valueOf(Bexp.get(0).toString()) + Integer.valueOf(
            Bexp.get(0).toString()); i >= (Integer.valueOf(Bexp.get((Bexp.size() - 1)).toString())
                + Integer.valueOf(Bexp.get((Bexp.size() - 1)).toString())); i--) {
          if (arr[i] == 0) {
            continue;
          }
          Rexp.add(i);
          Rcoff.add(arr[i]);
        }

        int[][] arrayB = new int[Rexp.size()][2];
        for (int i = 0; i < Rexp.size(); i++) {
          arrayB[i][0] = Integer.valueOf(Rcoff.get(i).toString());
          arrayB[i][1] = Integer.valueOf(Rexp.get(i).toString());
        }
        return arrayB;

      case 'C':
        int c1;
        int c2;

        for (c1 = 0; c1 < Cexp.size(); c1++) {
          for (c2 = 0; c2 < Cexp.size(); c2++) {
            arr[Integer.valueOf(Cexp.get(c1).toString()) + Integer
                .valueOf(Cexp.get(c2).toString())] += (Integer.valueOf(Ccoff.get(c1).toString())
                    * Integer.valueOf(Ccoff.get(c2).toString()));
          }
        }

        for (int i = Integer.valueOf(Cexp.get(0).toString()) + Integer.valueOf(
            Cexp.get(0).toString()); i >= (Integer.valueOf(Cexp.get((Cexp.size() - 1)).toString())
                + Integer.valueOf(Cexp.get((Cexp.size() - 1)).toString())); i--) {
          if (arr[i] == 0) {
            continue;
          }
          Rexp.add(i);
          Rcoff.add(arr[i]);
        }

        int[][] arrayC = new int[Rexp.size()][2];
        for (int i = 0; i < Rexp.size(); i++) {
          arrayC[i][0] = Integer.valueOf(Rcoff.get(i).toString());
          arrayC[i][1] = Integer.valueOf(Rexp.get(i).toString());
        }
        return arrayC;
      default:
      }
    }
    return null;
  }

}