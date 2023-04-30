/*
 * This java program add elements in linked list in sorted manner.
 */
package linkedlist;

/**
 * 
 * @author Kaif
 *
 */

/*
 * This is main class of program
 */
public class LinkedListUC10 {

	/*
	 * head of list
	 */
	Node head;

	/*
	 * Linked list Node
	 */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*
	 * function to insert a new_node in a list.
	 */
	void sortedInsert(int data) {

		Node new_node = new Node(data);
		Node current;

		/*
		 * Special case for head node
		 */
		if (head == null || head.data >= new_node.data) {
			new_node.next = head;
			head = new_node;
		} else {

			/*
			 * Locate the node before point of insertion.
			 */
			current = head;

			while (current.next != null && current.next.data < new_node.data) {

				current = current.next;
			}

			new_node.next = current.next;
			current.next = new_node;
		}
	}

	/*
	 * Function to print linked list
	 */
	void printList() {
		if (head == null) {
			System.out.println("Linked List is empty");
		}
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	/**
	 * This is main method of program and starting point of program
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		/*
		 * To create object of class
		 */

		LinkedListUC10 list10 = new LinkedListUC10();

		list10.sortedInsert(56);

		list10.sortedInsert(30);

		list10.sortedInsert(40);

		list10.sortedInsert(70);

		System.out.println("Created Linked List");
		list10.printList();
	}
}
