package eg.edu.alexu.csd.datastructure.calculator.cs46;

import eg.edu.alexu.csd.datastructure.calculator.ICalculator;

public class MyCalculator implements ICalculator {
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public float divide(int x, int y) {
		// TODO Auto-generated method stub
		if (y!=0)
		{
		return (float)x/y;
		}
		else
		{
			return 0;
		}
	}

}
