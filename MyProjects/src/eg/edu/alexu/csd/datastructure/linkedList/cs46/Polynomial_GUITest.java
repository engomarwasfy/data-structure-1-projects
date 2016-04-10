package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import static org.junit.Assert.*;

import org.junit.Test;

public class Polynomial_GUITest {

    @Test
    public void test() {
        PolynomialSolver poly =new PolynomialSolver();
        int [][]A = new int[][]{{2,3},{7,1}};
        int[][]B = new int[][]{ {2,1},{1,0} };
        int[][]sum=new int[][]{ {2,3},{9,1},{1,0}};
        int[][]sub=new int [][]{{2,3},{5,1},{-1,0}};
        int[][]multiply=new int[][]{{4,4},{2,3},{14,2},{7,1}};
        int[][]R1;
        int[][]R2;
        int[][]R3;
        poly.setPolynomial('A', A);
        poly.setPolynomial('B', B);
        R1=poly.add('A', 'B');
        R2=poly.subtract('A','B');
        R3=poly.multiply('A', 'B');
        assertArrayEquals(sum, R1);
        assertArrayEquals(sub, R2);
     //   assertArrayEquals(multiply, R3);
       
      
    }
    @Test(expected=RuntimeException.class)
    public void test2()
    {
        PolynomialSolver poly =new PolynomialSolver();
        poly.clearPolynomial('A');
    }

    @Test(expected=RuntimeException.class)
    public void test3()
    {
        int [][]A = new int[][]{{2,3},{7,7}};
        PolynomialSolver poly =new PolynomialSolver();
        poly.setPolynomial('A', A);
    }
    @Test(expected=RuntimeException.class)
    public void test4()
    {
        PolynomialSolver poly =new PolynomialSolver();
        poly.add('A', 'B');
    }
}
