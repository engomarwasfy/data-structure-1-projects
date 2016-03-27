package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import java.awt.Point;

import eg.edu.alexu.csd.datastructure.linkedList.IPolynomialSolver;

public class MyPolynomialSolver implements IPolynomialSolver {
int [][]terms;
Character counter;
SLL A;
SLL B;
SLL C;
SLL R;
int SLLcounter=0;

	@Override
	public void setPolynomial(char poly, int[][] terms) {
		// TODO Auto-generated method stub
		Point []array=new Point[terms.length];
		for(int i=0;i<terms.length;i++)
		{
		
		 array[i]=new Point();
		 if(terms[i][0]!=0)
		 {
		 array[i].y=terms[i][0];
		 array[i].x= terms[i][1];
		 }
		 else
		 {
			 throw new RuntimeException();
		 }
		}
		switch (poly)
		{
		case'A':
			if (A.size()==0)
			{
				for (int i=0;i<array.length;i++)
				{
					A.add(i,array[i]);
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
			
			
		case 'B':
			if (B.size()==0)
			{
				for (int i=0;i<array.length;i++)
				{
					B.add(i,array[i]);
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
		case 'C':
			if (C.size()==0)
			{
				for (int i=0;i<array.length;i++)
				{
					C.add(i,array[i]);
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
			default: throw new RuntimeException();
		}
		 
	}

	@Override
	public String print(char poly) {
		// TODO Auto-generated method stub
		String polynomial="";
		Double exponent;
		Double value;
		switch (poly)
		{
		case'A':
			if (A.size()!=0)
			{
				for (int i=0;i<A.size();i++)
				{
					
				exponent=((Point)(A.get(i))).getX();
				value=((Point)(A.get(i))).getY();
				if(exponent>0)
				{
					polynomial.concat(value.toString()+"x^"+exponent.toString()+"+" );
				}
				else
				{
					throw new RuntimeException();
				}
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
			
			
		case 'B':
			if (B.size()!=0)
			{
				for (int i=0;i<B.size();i++)
				{
					
				exponent=((Point)(B.get(i))).getX();
				value=((Point)(B.get(i))).getY();
				if(exponent>0)
				{
					polynomial.concat(value.toString()+"x^"+exponent.toString()+"+" );
				}
				else
				{
					throw new RuntimeException();
				}
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
		case 'C':
			if (C.size()!=0)
			{
				for (int i=0;i<C.size();i++)
				{
					
				exponent=((Point)(C.get(i))).getX();
				value=((Point)(C.get(i))).getY();
				if(exponent>0)
				{
					polynomial.concat(value.toString()+"x^"+exponent.toString()+"+" );
				}
				else
				{
					throw new RuntimeException();
				}
				}
			}
			
			else
			{
				throw new RuntimeException();
			}
			break;
			default: throw new RuntimeException();
		}
		 
	

	
		return null;
	}

	@Override
	public void clearPolynomial(char poly) {
		// TODO Auto-generated method stub
		switch (poly)
		{
		case 'A': A.clear();
		case 'B': B.clear();
		case 'C': C.clear();
		case 'R': R.clear();
		default : throw new RuntimeException();
		}
	}
	@Override
	public float evaluatePolynomial(char poly, float value) {
		// TODO Auto-generated method stub
		float result=0;
		Double exponent;
		Double val;
		switch (poly)
		{
		case 'A': 
			if (A.size()!=0)
			{
				for (int i=0;i<A.size();i++)
				{
					
				exponent=((Point)(A.get(i))).getX();
				val=((Point)(A.get(i))).getY();
				if(exponent>0)
				{
					result+=val*Math.pow(value, exponent);
				}
				else
				{
					throw new RuntimeException();
				}
				
				}
				return result;
			}
			
			else
			{
				throw new RuntimeException();
			}
		case 'B': 
			if (B.size()!=0)
			{
				for (int i=0;i<B.size();i++)
				{
					
				exponent=((Point)(B.get(i))).getX();
				val=((Point)(B.get(i))).getY();
				if(exponent>0)
				{
					result+=val*Math.pow(value, exponent);
				}
				else
				{
					throw new RuntimeException();
				}
				
				}
				return value;
			}
			
			else
			{
				throw new RuntimeException();
			}
					
		case 'C':
			if (C.size()!=0)
			{
				for (int i=0;i<C.size();i++)
				{
					
				exponent=((Point)(C.get(i))).getX();
				val=((Point)(C.get(i))).getY();
				if(exponent>0)
				{
					result+=val*Math.pow(value, exponent);
				}
				else
				{
					throw new RuntimeException();
				}
				
				}
				return value;
			}
			
			else
			{
				throw new RuntimeException();
			}
		case 'R': 
			if (A.size()!=0)
			{
				for (int i=0;i<R.size();i++)
				{
					
				exponent=((Point)(R.get(i))).getX();
				val=((Point)(R.get(i))).getY();
				if(exponent>0)
				{
					result+=val*Math.pow(value, exponent);
				}
				else
				{
					throw new RuntimeException();
				}
				
				}
				return value;
			}
			
			else
			{
				throw new RuntimeException();
			}
		default : throw new RuntimeException();
		}
		
	}

	@Override
	public int[][] add(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] subtract(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[][] multiply(char poly1, char poly2) {
		// TODO Auto-generated method stub
		return null;
	}

}
