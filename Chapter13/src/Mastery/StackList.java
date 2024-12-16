package Mastery;

//Node class to represent each element in the stack
class Node {
 Object data; // Stores the data
 Node next;   // Reference to the next node

 public Node(Object data) {
     this.data = data;
     this.next = null;
 }
}

//StackList class that uses a linked list to implement the stack
public class StackList {
 private Node top; // Top of the stack

 // Constructor
 public StackList() {
     this.top = null;
 }

 /**
  * Push operation: Adds an element to the stack.
  * Time complexity: O(1)
  * 
  * Advantage (over an array):
  * - Dynamic size: No need to predefine or resize the array, as linked lists grow dynamically.
  */
 public void push(Object data) {
     Node newNode = new Node(data);
     newNode.next = top;
     top = newNode;
 }

 /**
  * Pop operation: Removes and returns the top element of the stack.
  * Time complexity: O(1)
  * 
  * Disadvantage (compared to an array):
  * - Higher memory usage: Each node requires extra memory for the "next" reference.
  */
 public Object pop() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty. Cannot pop.");
     }
     Object data = top.data;
     top = top.next;
     return data;
 }

 /**
  * Peek operation: Returns the top element without removing it.
  * Time complexity: O(1)
  * 
  * Advantage:
  * - Efficient access to the top element.
  * Disadvantage:
  * - Slower sequential access compared to an array, due to non-contiguous memory allocation.
  */
 public Object peek() {
     if (isEmpty()) {
         throw new IllegalStateException("Stack is empty. Nothing to peek.");
     }
     return top.data;
 }

 /**
  * Checks if the stack is empty.
  * 
  * Advantage (over an array):
  * - Checking emptiness is still O(1), but without the overhead of checking array bounds.
  */
 public boolean isEmpty() {
     return top == null;
 }

 /**
  * Print the stack for debugging purposes.
  * 
  * Disadvantage (compared to an array):
  * - Accessing elements beyond the top is less efficient because it requires traversal.
  */
 public void printStack() {
     Node current = top;
     System.out.print("TOP -> ");
     while (current != null) {
         System.out.print(current.data + " -> ");
         current = current.next;
     }
     System.out.println("BOTTOM");
 }

 // Main method for testing the StackList class
 public static void main(String[] args) {
     StackList stack = new StackList();

     // Push elements onto the stack
     stack.push(10);
     stack.push(20);
     stack.push("Hello");
     stack.push(40.5);

     System.out.println("Top element: " + stack.peek());
     System.out.println("Stack elements:");
     stack.printStack();

     // Pop elements from the stack
     System.out.println("Popped: " + stack.pop());
     System.out.println("Popped: " + stack.pop());
     System.out.println("Stack after popping:");
     stack.printStack();

     // Check if stack is empty
     System.out.println("Is stack empty? " + stack.isEmpty());
 }
}
