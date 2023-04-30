/*
 * This java program delete last node of linked list
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
class Node6 {
	
	/*
	 * Node Class
	 */
	int data;
	Node6 next;
	
	/*
	 * parameterized constructor
	 */
	public Node6(int data) {
		super();
		this.data = data;
		this.next = null;
	}
}
/*
 * Class to define linked list operations
 */
class LinkedListNew6 {
	
	/*
	 *To add node to linked list 
	 */
	public Node6 addNode(int data, Node6 head) {

		Node6 newNode = new Node6(data);

		if (head == null) {
			head = newNode;

		} else {
			Node6 temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		return head;
	}
	
	/*
	 * To delete last node of linked list
	 */
	public void popLast(Node6 head) {
		if (head == null) {
			System.out.println("Linked list is empty");
		}
		if (head.next == null) {
			head = null;
		}
		Node6 secondLast = head;
		Node6 lastNode = head.next;

		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;

		}
		secondLast.next = null;

	}
	
	/*
	 * To display linked list
	 */
	public void printLinkedList(Node6 head) {
		if (head == null) {
			System.out.print("LinkedList is empty");
		} else {
			Node6 temp = head;
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
public class LinkedListUC6 {
	
	/**
	 * This is main method and starting point of program
	 * @param args
	 */

	public static void main(String[] args) {
		
		LinkedListNew6 list6 = new LinkedListNew6();
		
		Node6 head = list6.addNode(56, null);
		list6.addNode(30,head);
		list6.addNode(70, head);
		
		list6.popLast(head);
		
		list6.printLinkedList(head);
	}
}
