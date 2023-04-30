/*
 * This java program add nodes at start of linked list
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
public class LinkedListUC2 {
	
	
	 /*
	  * Represent a node of the linked list  
	  */
    class Node{  
        int data;  
        Node next;  
  
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
  
    /*
     * Represent the head and tail of the singly linked list  
     */
    public Node head = null;   
  
    /*
     * addAtStart() will add a new node to the beginning of the list  
     */
    public void addAtStart(int data) {  
        /*
         * Create a new node  
         */
        Node newNode = new Node(data);  
  
        /*
         * Checks if the list is empty  
         */
        if(head == null) {  
            /*
             * If list is empty, both head and tail will point to new node  
             */
            head = newNode;  
              
        }  
        else {  
            /*
             * Node temp will point to head  
             */
            Node temp = head;  
            /*
             * newNode will become new head of the list  
             */
            head = newNode;  
            /*
             * Node temp(previous head) will be added after new head  
             */
            head.next = temp;  
        }  
    }  
  
    /*
     * display() will display all the nodes present in the list  
     */
    public void display() {  
        /*
         * Node current will point to head  
         */
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }  
        System.out.println("Adding nodes to the start of the list: ");  
        while(current != null) {  
            //Prints each node by incrementing pointer  
            System.out.print(current.data + "->");  
            current = current.next;  
        }  
        System.out.println();  
    }  

	public static void main(String[] args) {
		
		LinkedListUC2 list2 = new LinkedListUC2();
		
		//Adding 70 to the list  
        list2.addAtStart(70);  
        list2.display();  
  
        //Adding 30 to the list  
        list2.addAtStart(30);  
        list2.display();  
  
        //Adding 56 to the list  
        list2.addAtStart(56);  
        list2.display();  
    }
}
