/*
 * This java program create simple linked list
 */

package linkedlist;

/**
 * 
 * @author Kaif
 *
 */

/*
 * This is node class for data and next node
 */
class Node1 {

	int data;
	Node1 next;
	
	/*
	 * To define constructor for data and next node
	 */
	public Node1(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

/*
 * This class to create methods for pushing and displaying element of linked list
 */
class LinkedListNew1 {
	
	/*
	 * To add node and data to linked list
	 */
	public Node1 addNode(int data, Node1 head) {

		Node1 newNode = new Node1(data);

		if (head == null) {
			head = newNode;

		} else {
			Node1 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}
	
	/*
	 * To display element of linked list
	 */
	public void printLinkedList(Node1 head) {
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {
			Node1 temp = head;
			while (temp != null) {
				System.out.print(temp.data + " -> ");
				temp = temp.next;
			}
		}
	}
}

/*
 * This is main class of program 
 */
public class LinkedListUC1 {
	
	/**
	 * This is main function of program and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * To create object of class
		 */
		LinkedListNew1 list1 = new LinkedListNew1();
		
		Node1 head = list1.addNode(56, null);
		list1.addNode(30,head);
		list1.addNode(70, head);
		
		list1.printLinkedList(head);
    }
}
