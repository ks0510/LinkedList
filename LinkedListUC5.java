/*
 * This java program delete first node of linked list
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
class LinkedListNew5 {
	Node head;

	/*
	 * Node Class
	 */
	class Node {
		int data;
		Node next;

		Node(int x) // parameterized constructor
		{
			data = x;
			next = null;
		}
	}

	public void deleteStart() {
		if (head == null) {
			System.out.println("List is empty, not possible to delete");
			return;
		}

		System.out.println("Deleted: " + head.data);
		// move head to next node
		head = head.next;
	}

	public Node insert(int data) {

		Node newNode = new Node(data);

		if (head == null) {
			head = newNode;

		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}

		return head;
	}

	public void display() {
		Node node = head;
		// as linked list will end when Node reaches Null
		while (node != null) {
			System.out.print(node.data + "->");
			node = node.next;
		}
		System.out.println("");
	}
}

public class LinkedListUC5 {

	public static void main(String[] args) {

		LinkedListNew5 list5 = new LinkedListNew5();

		list5.insert(56);
		list5.insert(30);
		list5.insert(70);

		list5.display();

		list5.deleteStart();
		list5.display();
  }
}
