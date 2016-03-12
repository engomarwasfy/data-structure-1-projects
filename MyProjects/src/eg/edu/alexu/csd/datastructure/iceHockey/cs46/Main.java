package eg.edu.alexu.csd.datastructure.iceHockey.cs46;

import java.awt.Point;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point []p;
		
		MyIceHockey test = new MyIceHockey();
		String[] arr={"33JUBU33",
					  "3U3O4433",
					 "O33P44NB",
					 "PO3NSDP3",
					 "VNDSD333",
					 "OINFD33X"};
		
	p = test.findPlayers(arr,3,16);
	for (int i=0;i<p.length;i++)
	{
		System.out.println("("+p[i].getX()+","+p[i].getY()+")");
	}
	


	}

}
