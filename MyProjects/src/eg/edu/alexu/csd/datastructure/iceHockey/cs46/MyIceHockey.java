package eg.edu.alexu.csd.datastructure.iceHockey.cs46;
import java.awt.Point;
import java.util.Arrays;
import java.util.Comparator;

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

	public Point[]findPlayers(String[] photo, int team, int threshold) {
		// TODO Auto-generated method stub
		this.photo = photo;
		switch(team)
		{
		case 0: this.team='0';break;
		case 1: this.team='1';break;
		case 2: this.team='2';break;
		case 3: this.team='3';break;
		case 4: this.team='4';break;
		case 5: this.team='5';break;
		case 6: this.team='6';break;
		case 7: this.team='7';break;
		case 8: this.team='8';break;
		case 9: this.team='9';break;
		
		}
		try
		{
		for(int i = 0; i<photo.length;i++)
		{
			for(int j=0 ;j<photo[i].length();j++)
			{
				if(this.team == photo[i].charAt(j)&&!visited[i][j])
				{
					// System.out.println("row="+i+"col="+j);
			  length=0;
			  maxRow=i;
			  maxCol=j;
			  minCol=j;
			  minRow=i;
			  findNext(i,j);
				
			  if(length*4>=threshold)
			  {
				 //System.out.println("maxRow="+maxRow+"maxCol="+maxCol+"minRow="+minRow+"minCol="+minCol);
				  
				  firstarr[pointCounter]=new Point(maxCol+minCol+1,maxRow+minRow+1);
				 
				  pointCounter++;
				 
			  }
			}
				
			
			
			
		}
		}
		}
		catch(Exception e)
		{
			
		}
		if (pointCounter>0)
		{
		Point[] arr=new Point[pointCounter];
		for(int i = 0;i<pointCounter;i++)
		{
			arr[i]=firstarr[i];
		}
		sort(arr);
		return arr ;
		}
		else
		{
			return null;
		}
	}
	
 public void findNext(int row,int col)
 {
	 try
	 {
	 if(row<0||col<0||visited[row][col]||row>=photo.length||col>=photo[0].length()||this.team != photo[row].charAt(col))
	 {
		 return;
	 }
	 else
	 {
		
		 visited[row][col]=true;
		 length++;
	maxRow=Math.max(maxRow, row);
	maxCol=Math.max(maxCol, col);
	minCol=Math.min(minCol, col);
	minRow=Math.min(minRow,row);
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
		
		Arrays.sort(arr, new Comparator<Point>() {
		    public int compare(Point a, Point b) {
		        int xComp = Integer.compare(a.x, b.x);
		        if(xComp == 0)
		            return Integer.compare(a.y, b.y);
		        else
		            return xComp;
		    }
		});
	}
	catch(Exception e)
	{
		
	}
}





}
	

