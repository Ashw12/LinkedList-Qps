package Lecture37_Linkedlist_Qps;

public class Linked_List_Cycle {
	public class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private int size;
	private Node tail;

	public void addfirst(int item) {
		Node nn = new Node(item);
		if (this.size == 0) {
			this.head = nn;
			this.tail = nn;
			this.size++;
		} else {
			nn.next = this.head;
			this.head = nn;
			this.size++;
		}
	}

	public void addlast(int item) {
		if (this.size == 0) {
			addfirst(item);
		} else {
			Node nn = new Node(item);
			this.tail.next = nn;// nn jo turant node banega usak address hai
			this.tail = nn;
			this.size++;
		}
	}
	public void CreateCycle() {
		//this.tail.next=this.head;//circular
		this.tail.next=this.head.next;
	}
public boolean hascycle() {
	Node slow=head;
	Node fast=head;
	while(fast!=null && fast.next!=null) {
		slow=slow.next;
		fast=fast.next.next;
		if(slow==fast) {
			return true;
		}
	}
	return false;
}
	public void display() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;

		}
		System.out.println(".");
	}
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Linked_List_Cycle ll=new Linked_List_Cycle();
		ll.addlast(10);
		ll.addlast(20);
		ll.addlast(30);
		ll.addlast(40);
		ll.addlast(50);
		ll.addlast(60);
		ll.addlast(70);

		//ll.display();
		ll.CreateCycle();
		System.out.println(ll.hascycle());
		//ll.display();
		//ll.hascycle();
	}
}
