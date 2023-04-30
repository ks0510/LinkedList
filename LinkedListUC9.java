/*
 * This java program delete element form particular position
 */
package linkedlist;

/**
 * 
 * @author Kaif
 *
 */

class LinkedList9 {

	Node head;
	int size = 0;

	/* Linked list Node */
	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	/*
	 * Given a key, deletes the first occurrence of key in linked list
	 */
	void deleteNode(int key) {
		// Store head node
		Node temp = head, prev = null;

		// If head node itself holds the key to be deleted
		if (temp != null && temp.data == key) {
			head = temp.next; // Changed head
			size--;
			return;
		}

		// Search for the key to be deleted, keep track of
		// the previous node as we need to change temp.next
		while (temp != null && temp.data != key) {
			prev = temp;
			temp = temp.next;

		}

		// If key was not present in linked list
		if (temp == null)
			return;

		// Unlink the node from linked list
		prev.next = temp.next;
		size--;

	}

	/* Inserts a new Node at end of the list. */
	public void push(int new_data) {

		Node newNode = new Node(new_data);
		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		size++;
	}

	/*
	 * This function prints contents of linked list starting from the given node
	 */
	public void printList() {
		Node tnode = head;
		while (tnode != null) {
			System.out.print(tnode.data + "->");
			tnode = tnode.next;
		}
		System.out.println("");
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

}

public class LinkedListUC9 {

	public static void main(String[] args) {

		LinkedList9 list9 = new LinkedList9();

		list9.push(56);
		list9.push(40);
		list9.push(30);
		list9.push(70);

		System.out.println("Created Linked list is:");
		list9.printList();

		list9.deleteNode(40); // Delete node with data 1

		System.out.println("Linked List after Deletion of 40:");
		list9.printList();
		System.out.println(list9.getSize());

	}

}
