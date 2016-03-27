package eg.edu.alexu.csd.datastructure.linkedList.cs46;
public class Main {

	public static void main(String[] args) 
	
	{
		DLL x =new DLL();
		if(x.isEmpty())
			System.out.println("YES");
		Integer y = new Integer(5) ;
		Integer z = new Integer(1) ;
		Integer u = new Integer(3) ;
	    x.add(10);
		x.add(11);
	if(x.isEmpty())
			System.out.println("YES");
		//x.add(0, 3);
		//x.add(0, 4);
		//x.add(2,4);
		//x.add(3,4);
		for(int i = 0 ; i < x.size();i++)
			System.out.println(x.get(i)+" ");
		//x.remove(1);
		//for(int i = 0 ; i < x.size();i++)
		//	System.out.println(x.get(i)+" ");
		//x.clear();
		if(x.isEmpty())
			System.out.println("YES");	
	}

		
	}


