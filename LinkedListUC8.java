/*
 * This java program add element at particular position
 */

package linkedlist;

/**
 * 
 * @author Kaif
 *
 * @param <E>
 */

class Node8<E> {

	/*
	 * Data Stored in each Node of the Linked List
	 */
	E data;

	/*
	 * Pointer to the next node in the Linked List
	 */
	Node8<E> next;

	/*
	 *  Node class constructor used to initializes the data in each Node
	 */
	Node8(E data) {
		this.data = data;
	}
}

class LinkedList8<E> {

	// Points to the head of the Linked
	// List i.e the first element
	Node8<E> head = null;
	int size = 0;

	// Addition of elements to the tail of the Linked List
	public void add(E element) {
		// Checks whether the head is created else creates a
		// new one
		if (head == null) {
			head = new Node8<>(element);
			size++;
			return;
		}

		// The Node which needs to be added at
		// the tail of the Linked List
		Node8<E> add = new Node8<>(element);

		// Storing the instance of the
		// head pointer
		Node8<E> temp = head;

		// The while loop takes us to the tail of the Linked
		// List
		while (temp.next != null) {
			temp = temp.next;
		}

		// New Node is added at the tail of
		// the Linked List
		temp.next = add;

		// Size of the Linked List is incremented as
		// the elements are added
		size++;
	}

	// Searches the Linked List for the given element and
	// returns it's particular index if found else returns
	// -1
	public int search(E element) {

		if (head == null) {
			return -1;
		}

		int index = 1;
		Node8<E> temp = head;

		// While loop is used to search the entire Linked
		// List starting from the tail
		while (temp != null) {

			// Returns the index of that particular element,
			// if found.
			if (temp.data == element) {
				return index;
			}

			// Gradually increases index while
			// traversing through the Linked List
			index++;
			temp = temp.next;
		}

		// Returns -1 if the element is not found
		return -1;
	}

	public void insertPosition(int pos, int data) {
		Node8 new_node = new Node8(data);
		new_node.data = data;
		new_node.next = null;

		// Invalid positions
		if (pos < 1 || pos > size + 1)
			System.out.println("Invalid\n");

		// inserting first node
		else if (pos == 1) {
			new_node.next = head;
			head = new_node;
			size++;
		}

		else {
			Node8 temp = head;

			// traverse till the current (pos-1)th node
			while (--pos > 1) {
				temp = temp.next;
			}
			new_node.next = temp.next;
			temp.next = new_node;
			size++;
		}
	}

	public void display() {
		System.out.print("Linked List : ");

		Node8 node = head;
		// as linked list will end when Node is Null
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println();
	}

}

public class LinkedListUC8 {

	public static void main(String[] args) {
		
		/*
		 * Initializing the Linked List
		 */
        LinkedList8<Integer> list8 = new LinkedList8<>();
 
        /*
         * Adding elements to the Linked List
         */
        list8.add(56);
        list8.add(30);
        list8.add(70);
        
 
        /*
         * Element to be searched
         */
        int element = 30;
        int position = list8.search(element)+1;
        
        
        list8.insertPosition(position,40);
        
        
        list8.display();
   }
}
