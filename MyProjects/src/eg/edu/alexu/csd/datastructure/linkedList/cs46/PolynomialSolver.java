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
	public void setPolynomial(char poly, int[][] terms) {
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
					throw new RuntimeException("Check your inputs");
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
					throw new RuntimeException("Check your inputs");
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
					throw new RuntimeException("Check your inputs");
				}
			}
			break;
		default:
			throw new RuntimeException("Check your inputs");
		}
	}

	@Override
	public String print(char poly) {
		// TODO Auto-generated method stub
		String message = new String();
		switch (poly) {
		case 'A':
			if (Acoff.isEmpty())
				return null;
			for (int i = 0; i < Acoff.size(); i++) {
				if (Acoff.get(i).equals(1))
					message += "+";
				else if (Acoff.get(i).equals(-1))
					message += "-";
				else
					message += Acoff.get(i);
				if (!Aexp.get(i).equals(0)) {
					if (Aexp.get(i).equals(1))
						message += "x";
					else
						message += "x^" + Aexp.get(i);
				}
			}
			break;
		case 'B':
			if (Bcoff.isEmpty())
				return null;
			for (int i = 0; i < Bcoff.size(); i++) {
				if (Bcoff.get(i).equals(1))
					message += "+";
				else if (Bcoff.get(i).equals(-1))
					message += "-";
				else
					message += Bcoff.get(i);
				if (!Bexp.get(i).equals(0)) {
					if (Bexp.get(i).equals(1))
						message += "x";
					else
						message += "x^" + Bexp.get(i);
				}
			}
			break;
		case 'C':
			if (Ccoff.isEmpty())
				return null;
			for (int i = 0; i < Ccoff.size(); i++) {
				if (Ccoff.get(i).equals(1))
					message += "+";
				else if (Ccoff.get(i).equals(-1))
					message += "-";
				else
					message += Ccoff.get(i);
				if (!Cexp.get(i).equals(0)) {
					if (Cexp.get(i).equals(1))
						message += "x";
					else
						message += "x^" + Cexp.get(i);
				}
			}
			break;
		case 'R':
			if (Rcoff.isEmpty())
				throw new RuntimeException("Check your inputs");
			for (int i = 0; i < Rcoff.size(); i++) {
				if (Rcoff.get(i).equals(1))
					message += "+";
				else if (Rcoff.get(i).equals(-1))
					message += "-";
				else
					message += Rcoff.get(i);
				if (!Rexp.get(i).equals(0)) {
					if (Rexp.get(i).equals(1))
						message += "x";
					else
						message += "x^" + Rexp.get(i);
				}
			}
			break;
		}
		return message;
	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		switch (poly) {
		case 'A':
			if (!Aexp.isEmpty()) {
				Aexp.clear();
				Acoff.clear();
			} else
				throw new RuntimeException("Check your inputs");
			break;
		case 'B':
			if (!Bexp.isEmpty()) {
				Bexp.clear();
				Bcoff.clear();
			} else
				throw new RuntimeException("Check your inputs");
			break;
		case 'C':
			if (!Cexp.isEmpty()) {
				Cexp.clear();
				Ccoff.clear();
			} else
				throw new RuntimeException("Check your inputs");
		}

	}

	@Override
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub
		float result = 0;
		switch (poly) {
		case 'A':
			if (!Aexp.isEmpty()) {
				for (int i = 0; i < Acoff.size(); i++) {
					result += (Float.valueOf(Acoff.get(i).toString())
							* Math.pow(value, Float.valueOf(Aexp.get(i).toString())));
				}
			} else
				throw new RuntimeException("Check your inputs");
			break;
		case 'B':
			if (!Bexp.isEmpty()) {
				for (int i = 0; i < Bcoff.size(); i++) {
					result += (Float.valueOf(Bcoff.get(i).toString())
							* Math.pow(value, Float.valueOf(Bexp.get(i).toString())));
				}

			} else
				throw new RuntimeException("Check your inputs");
			break;
		case 'C':
			if (!Cexp.isEmpty()) {
				for (int i = 0; i < Ccoff.size(); i++) {
					result += (Float.valueOf(Ccoff.get(i).toString())
							* Math.pow(value, Float.valueOf(Cexp.get(i).toString())));
				}

			} else
				throw new RuntimeException("Check your inputs");
			break;
		default:
			throw new RuntimeException("Check your inputs");
		}
		return result;
	}

	@Override
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		clearPolynomial('R');
		if (poly1 == 'A' && poly2 == 'B' || poly1 == 'B' && poly2 == 'A') {
			int A = 0;
			int B = 0;
			boolean finishedA = false;
			boolean finishedB = false;
			while (!finishedA && !finishedB) {
				if ((int) Aexp.get(A) > (int) Aexp.get(B)) {
					Rexp.add(Aexp.get(A));
					Rcoff.add(Acoff.get(A));
					A++;
				} else if ((int) Aexp.get(A) < (int) Aexp.get(B)) {
					Rexp.add(Bexp.get(B));
					Rcoff.add(Bcoff.get(B));
					B++;
				} else// exponent of A = exponent of B
				{
					Rexp.add(Aexp.get(A));// or B exponent it is the same
					Rcoff.add((double) Acoff.get(A) + (double) Bcoff.get(B));
					A++;// advance any pointer this is the same situation i
						// think
				}
				if (A == Acoff.size()) {
					finishedB = true;
				}
				if (B == Bcoff.size()) {
					finishedA = true;
				}
			}
			if (finishedA) {
				for (int i = B; i < Bexp.size(); i++) {
					Rexp.add(Bexp.get(i));
					Rcoff.add(Bcoff.get(i));
				}
			} else {
				for (int i = A; i < Aexp.size(); i++) {
					Rexp.add(Aexp.get(i));
					Rcoff.add(Acoff.get(i));
				}
			}
			int[][] arr = new int[Rexp.size()][2];
			for (int i = 0; i < Rexp.size(); i++) {
				arr[i][0] = (int) Rcoff.get(i);
				arr[i][1] = (int) Rexp.get(i);
			}
			return arr;
		}

		throw new RuntimeException("Check your inputs");
	}

	@Override
	public int[][] subtract(char poly1, char poly2) {
		// TODO Auto-generated method stub
		throw new RuntimeException("Check your inputs");
	}

	@Override
	public int[][] multiply(char poly1, char poly2) {
		// TODO Auto-generated method stub
		clearPolynomial('R');

		double[] arr = new double[1000000];// I used this array to multiply then
											// transfer into linked list i have
											// no solution like addition at that
											// instant of time
		if (poly1 == 'A' && poly2 == 'B' || poly1 == 'B' && poly2 == 'A') {
			int a;
			int b;
			for (a = 0; a < Aexp.size(); a++) {
				for (b = 0; b < Bexp.size(); b++) {
					arr[(int) Aexp.get(a) + (int) Aexp.get(b)] = (double) Acoff.get(a) * (double) Bcoff.get(b);
				}
				int[][] array = new int[Rexp.size()][2];
				for (int i = (int) Aexp.get(0) + (int) Bexp.get(0); i >= 0; i++) {
					array[i][0] = (int) Rcoff.get(i);
					array[i][1] = (int) Rexp.get(i);
				}
				return array;
			}
		}
		throw new RuntimeException("Check your inputs");
	}

}