package eg.edu.alexu.csd.datastructure.iceHockey.cs46.test;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

import eg.edu.alexu.csd.datastructure.iceHockey.cs46.MyIceHockey;

public class MyTest {

	@Test
	public void test() {
		MyIceHockey test = new MyIceHockey();
		String[] image = {
				"33JUBU33", 
				"3U3O4433", 
				"O33P44NB", 
				"PO3NSDP3", 
				"VNDSD333", 
				"OINFD33X"};
		Point[] answer = 
			new Point[]{
				new Point(4, 5),
				new Point(13, 9),
				new Point(14, 2),
			};
		Integer team = 3;
		Integer threashold = 16;
		Point[] result =test.findPlayers(image, team, threashold);
		assertArrayEquals(answer, result);
	}

}
