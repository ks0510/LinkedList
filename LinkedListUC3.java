/*
 * This java program add node at end of linked list
 */
package linkedlist;

/**
 * 
 * @author Kaif
 *
 */

/*
 * This node class represent node and data
 */
class Node3 {

	int data;
	Node3 next;
	
	/*
	 * Constructor for node and data
	 */
	public Node3(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}

/*
 * Class for defining methods of linked list
 */

class LinkedListNew3 {
	
	/*
	 * To add element at end of list
	 */

	public Node3 addNode(int data, Node3 head) {

		Node3 newNode = new Node3(data);

		if (head == null) {
			head = newNode;

		} else {
			Node3 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}
	
	/*
	 * To display linked list
	 */
	public void printLinkedList(Node3 head) {
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {
			Node3 temp = head;
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
public class LinkedListUC3 {
	
	/**
	 * This is main method of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		/*
		 * To create object of class
		 */
		
        LinkedListNew3 list3 = new LinkedListNew3();
		
		Node3 head = list3.addNode(56, null);
		list3.addNode(30,head);
		list3.addNode(70, head);
		
		list3.printLinkedList(head);
   }
}
