package Mastery;

//QueueList class implementing the queue using a linked list
public class QueueList {
 private Node front; // Points to the front of the queue
 private Node rear;  // Points to the rear of the queue
 private int size;   // Size of the queue

 // Constructor to initialize the queue
 public QueueList() {
     this.front = null;
     this.rear = null;
     this.size = 0;
 }

 // Enqueue operation: Adds an element to the rear of the queue
 public void enqueue(Object data) {
     Node newNode = new Node(data);
     if (rear == null) { // If queue is empty
         front = rear = newNode;
     } else {
         rear.next = newNode; // Link the new node at the end
         rear = newNode;      // Update the rear pointer
     }
     size++;
     System.out.println(data + " enqueued to the queue.");
 }

 // Dequeue operation: Removes an element from the front of the queue
 public Object dequeue() {
     if (front == null) { // If queue is empty
         System.out.println("Queue is empty. Nothing to dequeue.");
         return null;
     }
     Object dequeuedData = front.data;
     front = front.next; // Move front to the next node

     // If front becomes null, update rear to null as well
     if (front == null) {
         rear = null;
     }
     size--;
     System.out.println(dequeuedData + " dequeued from the queue.");
     return dequeuedData;
 }

 // Peek operation: Returns the front element without removing it
 public Object peek() {
     if (front == null) {
         System.out.println("Queue is empty. No front element.");
         return null;
     }
     return front.data;
 }

 // Method to check if the queue is empty
 public boolean isEmpty() {
     return front == null;
 }

 // Method to return the size of the queue
 public int size() {
     return size;
 }

 // Main method for testing the QueueList class
 public static void main(String[] args) {
     QueueList queue = new QueueList();

     // Testing the queue operations
     queue.enqueue(10);
     queue.enqueue(20);
     queue.enqueue(30);

     System.out.println("Front element: " + queue.peek());
     System.out.println("Queue size: " + queue.size());

     queue.dequeue();
     queue.dequeue();

     System.out.println("Front element after dequeuing: " + queue.peek());
     System.out.println("Queue size after dequeuing: " + queue.size());

     queue.dequeue();
     queue.dequeue(); // Attempting to dequeue from an empty queue

     System.out.println("Is the queue empty? " + queue.isEmpty());
 }
}
