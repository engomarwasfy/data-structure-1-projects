package eg.edu.alexu.csd.datastructure.linkedList.cs46;

import eg.edu.alexu.csd.datastructure.linkedList.ILinkedList;



	public class DLL  {

		public int size=0;
		public Dnode Header;
		public Dnode Tail;
		public Dnode jumper;
		Exception wrong = new RuntimeException("Check your inputs");
		public DLL(){
			Header=null;
			Tail=null;
			size=0;
		}
		
		@Override
		public void add(int index, Object element) {
			// TODO Auto-generated method stub
			Dnode previous;
			Dnode next;
			Dnode current= new Dnode(element);
			jumper=Header;
			if(index==0)
			{
				if(Header==null)
				{
					Header=current;
					Tail=Header;
					size++;
				}
				else
				{
					Header.Dprev=current;
		            current.Dnext=Header;
		            Header= current;
		            size++;
				}
			}
			else if(index<size && index>0)
			{
				for(int i=0;i<index;i++)
				{
					jumper=jumper.Dnext;
				}
				next = jumper;
                previous=jumper.Dprev;
                current.Dprev =previous;
                current.Dnext=next;
                next.Dprev=current;
                previous.Dnext=current;
                size++;
				
			}
			else if(index==size)
			{
				add(element);
			}
			
			
		}
		@Override
		public void add(Object element) {
			// TODO Auto-generated method stub
			Dnode current= new Dnode(element);
			if(Header==null)
			{
				Header=current;
				Tail=Header;
				size++;
			}
			else
			{
				current.Dprev=Tail;
	            Tail.Dnext=current;
	            Tail = current;
	            size++;
			}
		}
		@Override
		public Object get(int index) {
			// TODO Auto-generated method stub
			jumper=Header;
			if(!isEmpty())
			{
				
				for(int i=0;i<index-1;i++)
				{
					jumper=jumper.Dnext;
				}
		return jumper.Dvalue;
			}
		else
		{
			return null;
		}
		}
		@Override
		public void set(int index, Object element) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void clear() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public boolean isEmpty() {
			// TODO Auto-generated method stub
			return size==0;
					}
		@Override
		public void remove(int index) {
			// TODO Auto-generated method stub
			
		}
		@Override
		public int size() {
			// TODO Auto-generated method stub
			return size;
		}
		@Override
		public ILinkedList sublist(int fromIndex, int toIndex) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean contains(Object o) {
			// TODO Auto-generated method stub
			return false;
		}
	}

		