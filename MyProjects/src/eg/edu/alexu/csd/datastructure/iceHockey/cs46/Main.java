package eg.edu.alexu.csd.datastructure.iceHockey.cs46;

import java.awt.Point;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyIceHockey test = new MyIceHockey();
		String[] arr={"sd88888fsg"};
		Point []p = test.findPlayers(arr,8,9);
		
	
	
	
	for (int i=0;i<p.length;i++)
	{
		
		System.out.println("("+p[i].getX()+","+p[i].getY()+")");
	}
	


	}

}



