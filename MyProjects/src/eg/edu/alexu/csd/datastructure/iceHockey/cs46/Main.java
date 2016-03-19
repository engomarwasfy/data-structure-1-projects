package eg.edu.alexu.csd.datastructure.iceHockey.cs46;

import java.awt.Point;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyIceHockey test = new MyIceHockey();
		MyIceHockey test2 = new MyIceHockey();
		String[] arr=	{"121"};
		Point []p = test.findPlayers(arr,1,3);
		p= test.findPlayers(arr,1,3);
		p = test2.findPlayers(arr,1,3);
		
		
	
	
	
	for (int i=0;i<p.length;i++)
	{
		
		System.out.println("("+p[i].getX()+","+p[i].getY()+")");
	}
	


	}

}



