//
//public class SinglyLinkedList {
//
//	private ListNode head;
//
//	private  class ListNode {
//		private int data; // Can be a generic type
//		private ListNode next; // Reference to next ListNode in list
//
//		public ListNode(int data) {
//			this.data = data;
//			this.next = null;
//		}
//	}
//
//	
//	public void display() {
//		ListNode current = head;
//		while(current != null) {
//			System.out.print(current.data + " --> ");
//			current = current.next;
//		}
//		System.out.print("null");
//	}
//
//	public int length() {
//		if(head == null) {
//			return 0;
//		}
//		int count = 0;
//		ListNode current = head;
//		while(current != null) {
//			count++;
//			current = current.next;
//		}
//		return count;
//	}
//
//	public void insertFirst(int value) {
//		ListNode newNode = new ListNode(value);
//		newNode.next = head;
//		head = newNode;
//	}
//
//	public void insert(int position, int value){
//		// 1 -> 4 -> 5
//		// 1 -> 6 -> 4 -> 5
//		ListNode node = new ListNode(value);
//
//		if(position == 1){
//			node.next = head;
//			head = node;
//		} else {
//			ListNode previous = head;
//			int count = 1; // position - 1
//
//			while(count < position - 1){
//				previous = previous.next;
//				count++;
//			}
//
//			ListNode current = previous.next;
//			previous.next = node;
//			node.next = current;
//		}
//
//
//	}
//
//	public void insertLast(int value) {
//		ListNode newNode = new ListNode(value);
//		if (head == null) {
//			head = newNode;
//			return;
//		}
//		ListNode current = head;
//		while (null != current.next) {
//			current = current.next;
//		}
//		current.next = newNode;
//	}
//
//	public ListNode deleteFirst() {
//		if(head == null) {
//			return null;
//		}
//		ListNode temp = head;
//		head = head.next;
//		temp.next = null;
//		return temp;
//	}
//
//	public void delete(int position){
//		// position is valid and starting from 1
//		// 3 -> 4 -> 7 -> 8 -> 9 -> null
//		if(position == 1){
//			head = head.next;
//		} else {
//			ListNode previous = head;
//			int count = 1;
//			while(count < position - 1){
//				previous = previous.next;
//				count++;
//			}
//
//			ListNode current = previous.next;
//			previous.next = current.next;
//		}
//	}
//
//	public ListNode deleteLast() {
//		if(head == null) {
//			return head;
//		}
//
//		if(head.next == null) {
//			ListNode temp = head;
//			head = head.next;
//			return temp;
//		}
//
//		ListNode current = head;
//		ListNode previous = null;
//
//		while(current.next != null) {
//			previous = current;
//			current = current.next;
//		}
//		previous.next = null; // break the chain
//		return current;
//	}
//
//	public boolean find(int searchKey) {
//		if(head == null) {
//			return false;
//		}
//
//		ListNode current = head;
//		while(current != null) {
//			if(current.data == searchKey) {
//				return true;
//			}
//			current = current.next;
//		}
//		return false;
//	}
//
//	public ListNode reverse() {
//		if(head == null) {
//			return null;
//		}
//
//		ListNode current = head;
//		ListNode previous = null;
//		ListNode next = null;
//
//		while(current != null) {
//			next = current.next;
//			current.next = previous;
//			previous = current;
//			current = next;
//		}
//		return previous;
//	}
//
//public ListNode getMiddleNode() {
//	if(head==null){
//		return null;
//	}
//	ListNode slwptr=head;
//	ListNode fstptr=head;
//	while(fstptr!=null&& fstptr.next!=null) {
//		slwptr=slwptr.next;
//		fstptr=fstptr.next.next;
//	}return slwptr;
//	//return null;
//}
//	
//
//	 public static void main(String[] args)
//	 {
//		 SinglyLinkedList sll =new SinglyLinkedList();
//		// sll.head=new Listnode(10);
////		 Listnode second= new Listnode(5);
////		 Listnode third= new Listnode(6);
////		 Listnode fourth =new Listnode(9);
////		 Listnode fifth =new Listnode(3);
////		 head.next=second;
////		 second.next=third;
////		 third.next=fourth;
////		 fourth.next=fifth;
//	
////		// sll.length();//
////		 
////		 sll.insertFirst(7);
////		 sll.insertFirst(1);
////		 sll.insertFirst(3);
////		 sll.insert(3,8);
////		 sll.insert(4,9);
////		 sll.display();
//	//	 sll.delete(3);
////		
////		ListNode middlenode=sll.getMiddleNode();
////		middlenode.display();
//		 
//		 
////		Listnode reverseListNode=SinglyLinkedList.reverse(head);
////		SinglyLinkedList.display(reverseListNode);
////		
//		
////		 if(SinglyLinkedList.find(head ,13)) {
////			 System.out.println("element found");
////			 
////		 }else
////		 { System.out.println("element not found");}
//		 //sll.display();
////		 System.out.println(" deleted   first element in list--   "+ sll.deleteLast().data );
////		 
//////		 System.out.println(" deleted   first element in list--   "+ sll.deleteFirst().data );
////	 sll.display();
//	 }
//
//}