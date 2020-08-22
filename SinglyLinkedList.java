package trial;

class Node{
	int value;
	Node next;
	public Node() {
		// TODO Auto-generated constructor stub
	}
	public Node(int value) {
		// TODO Auto-generated constructor stub
		this.value=value;
	}
}
class LinkedList{
	Node start;
	
	public Node addElementFront(int val) 
	{
		Node newBeg = start;
		start = new Node(val);
		start.next=newBeg;
		return start;
		
	}
	public Node addElementEnd(int val) 
	{
		Node loop=start;
		while(loop.next!=null)
		{
			loop = loop.next;
		}
		loop.next=new Node(val);
		return start;
	}
	
	public Node delElementFront() 
	{
		Node loop=start.next;
		start=loop;
		return start;
	}
	
	public Node delElementEnd() 
	{
		Node loop=start;
		while(loop.next.next!=null)
		{
			loop = loop.next;
		}
		loop.next=null;
		return start;
	}
	
	public void traverse()
	{
		Node loop=start;
		while(loop!=null)
		{
			System.out.print(loop.value+"->");
			loop = loop.next;
		}
		System.out.print("NULL");
	}
}
public class SinglyLinkedList {
	public static void main (String a[]) {
		LinkedList list = new LinkedList();
	//	list.start = new Node(); Do not create a node with 0
		list.addElementFront(5);
		list.traverse();
		System.out.println();
		list.addElementFront(6);
		list.traverse();
		System.out.println();
		list.addElementEnd(4);
		list.traverse();
		System.out.println();
		list.addElementFront(7);
		list.traverse();
		System.out.println();
		list.addElementEnd(3);
		list.traverse();
		System.out.println();
		
		
		list.delElementFront();
		list.traverse();
		System.out.println();
		list.delElementEnd();
		list.traverse();
		System.out.println();
		list.delElementFront();
		list.traverse();
		System.out.println();
		list.delElementEnd();
		list.traverse();
		// TODO Auto-generated constructor stub
		
	}

}
