package eg.edu.alexu.csd.datastructure.iceHockey.cs46;

import java.awt.Point;
import java.util.Arrays;

import eg.edu.alexu.csd.datastructure.iceHockey.IPlayersFinder;

public class MyIceHockey implements IPlayersFinder {

	int row;
	int col;
	int maxRow;
	int maxCol;
	int minCol;
	int minRow;
	char team;
	boolean[][] visited=new boolean[1000][1000] ;
	String []photo;
	int pointCounter;
	int length;
	Point[] firstarr=new Point[1000];
	@Override
	public Point[]findPlayers(String[] photo, int team, int threshold) {
		// TODO Auto-generated method stub
		
		this.photo = photo;
		this.team=(char)team;
		try
		{
		for(row = 0; row<photo.length;row++)
		{
			for(col=0 ;col<photo[row].length();col++)
			{
				if(team==photo[row].charAt(col)||!visited[row][col])
				{
			  length=0;
			  maxRow=row;
			  maxCol=col;
			  minCol=col;
			  minRow=row;
			  findNext(row,col);
				}
			  if(length*4>=threshold)
			  {
				  firstarr[pointCounter]=new Point(maxCol+minCol,maxRow+minCol);
				  pointCounter++;
				 
			  }
			}
			
			
			
		}
		}
		catch(Exception e)
		{
			
		}
		Point[] arr=new Point[pointCounter];
		for(int i = 0;i<pointCounter;i++)
		{
			arr[i]=firstarr[i];
		}
		sort(arr);
		return arr ;
		
	}
	
 public void findNext(int row,int col)
 {
	 try
	 {
	 if(row<=0||col<=0||visited[row][col]||row>photo.length||col<photo[0].length())
	 {
		 return;
	 }
	 else
	 {
		 visited[row][col]=true;
		 length++;
	maxRow=Math.max(row, maxRow);
	maxCol=Math.max(col, maxCol);
	minCol=Math.min(col, minCol);
	minRow=Math.min(row,minRow);
	findNext(row+1,col);
	findNext(row-1,col);
	findNext(row,col+1);
	findNext(row,col-1);
	return;
	 }
	 }
	 catch(Exception e)
	 {
		 
	 }
	 
 }
public void sort(Point[]arr)
{
	try
	{
	Arrays.sort(arr);
	}
	catch(Exception e)
	{
		
	}
}





}
	

