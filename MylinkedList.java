package collectionOne;

public class MylinkedList {
	Node root;
	public  String toString()
	{
		String s="[";
		Node temp=root;
		while(temp!=null)
		{
			s=s+temp.num;
			if(temp.nextobj!=null)
				s=s+", ";
			temp=temp.nextobj;
		}
		s=s+"]";
		
	}
	void print()
	{
		Node temp=root;
		while(temp!=null)
		{
			System.out.println(temp.num);
			temp=temp.nextobj;
		}
	}
	void add(int num)
	{
	if(root==null)
	{
		root=new Node(num);
		
	}
	else
	{
		Node temp=root;
		while(temp.nextobj!=null)
		{
			temp=temp.nextobj;
		}temp.nextobj=new Node(num);
	}
	}

}
