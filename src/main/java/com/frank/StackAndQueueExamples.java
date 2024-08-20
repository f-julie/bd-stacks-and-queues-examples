package com.frank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackAndQueueExamples {

	public static void main(String[] args) {
		
		int itemNum = 0;  // variable used in loops below		

/********************************************************************************
 *  Stack - LIFO Collection (Last-In-First-Out)
 *  
 *  Normal access to elements in a Stack is through the push() and pop() methods
 *  
 *  When you take an element off the Stack it is also removed
 *  
 *  Accessing a Stack using an index may be confusing. 
 *      bottom element is at index 0
 *      top element is at index (stack.size() - 1) 
 *  
 *  Some methods:
 *  
 *  .push(object)      - add element to top of Stack
 *  .pop()            - return and remove top element on the Stack
 *  .remove(index)    - remove element at index given
 *  .peek()           - return top element without removing it
 *  .size()           - return the number of elements in the Stack
 *  .isEmpty()        - return true if Stack contains no elements
 *  .empty()          - same as isEmpty()
 *  .get(index)       - return element at the index given
 *  .elementAt(index) - same as get(index)
 *  .clear()          - remove all elements in the Stack
 *  .clone()          - return a reference to a Object class clone of the stack
 *                      you must cast reference to type necessary
 * 
 **********************************************************************************/

		Stack <String> myStack = new Stack<>(); // Stack of String objects
//                               new Stack(); - OK too
		myStack.push("Kirk");    // Add an element to top of the Stack
		myStack.push("Spock");   // Add an element to top of the Stack
		myStack.push("McCoy");   // Add an element to top of the Stack
		myStack.push("Uhura");   // Add an element to top of the Stack
		myStack.push("Scotty");	 // Add an element to top of the Stack
		myStack.push("Picard");  // Add an element to top of the Stack
		myStack.push("Worf");    // Add an element to top of the Stack
		myStack.push("Riker");   // Add an element to top of the Stack
		myStack.push("Geordi");  // Add an element to top of the Stack
		myStack.push("Data");    // Add an element to top of the Stack
		
		System.out.println("Displaying elements in myStack: ");
		
		itemNum = 0;  // Keep track of the place in the Stack an element is stored

		// Using a for-each to process a Stack does not remove anything from the STack

		for (String item : myStack) {  // Loop through each item in the Stack one at a time
			                           //    each time through the loop item contains the current element
			System.out.println("Item @ index #"+itemNum++ + " " + item);
			}
			
		System.out.println("\nNumber items in myStack - .size(): " + myStack.size());
		// 10
		System.out.println("  Getting Top of myStack - .pop(): "   + myStack.pop());
		// get and remove the top element... Data
		System.out.println("Number items in myStack - .size(): "   + myStack.size());
		// 9
		System.out.println("  Last element in Stack - .get(0): "   + myStack.get(0));
		// get and leave element at index 0... Kirk
		System.out.println("   Top Element on Stack - .peek(): "   + myStack.peek());
		// get and leave the top element... Geordi
		System.out.println("Number items in myStack - .size(): "   + myStack.size());
		// 9

		System.out.println("\nPosition of Spock - .search(\"Spock\"): "   + myStack.search("Spock")); // find position of Spock
		// Note: This next statement will produce an unexpected result....
		// 8

		System.out.println("Retrieve Spock- .get(mystack.search(\"Spock\")): "   + myStack.get(myStack.search("Spock")));
		// Retrieve Spock... Geordi

		System.out.println("Number items in myStack - .size(): "   + myStack.size());
		// 9

		System.out.println("\nCloning myStack - .clone()");
		//                   cast to the type of the cloned Stack because .clone() returns a generic Object
		Stack<String> clonedStack = (Stack<String>) myStack.clone();  // Make a copy of a Stack - NOTE: the cast to the type

		System.out.println("Number items in clonedStack - size(): " + clonedStack.size());
		// 9
		
		System.out.println("\nClearing clonedStack - .clear()");
		clonedStack.clear();  // empty cloned stack
		
		System.out.println("Number items in clonedStack - .size(): " + clonedStack.size());
		// 0

		System.out.println("    Number items in myStack - .size(): " + myStack.size());
		// 9

		// Go through the stack until it is empty
		while (!myStack.isEmpty()) {
			System.out.println(myStack.pop());
		}


		System.out.println("--------------------------------------------");
/********************************************************************************
 *  Queue - FIFO Collection - like a line at the bank or a drive thru or line at DisneyWorld
 *                            used when you want to retrieve data in the same order it was put in
 *
 *  Normal access to a Queue is performed using: .add() ond .poll()
 *
 *  Some methods:
 *  
 *  .add(object)     - add element to end of Queue - Exception thrown is element cannot be addded
 *  .offer(object)    - same as add() - except true returned if element added, false if not
 *  .poll()           - return top element from Queue and remove it - null returned if Queue is empty
 *  .remove()         - same as poll = except an Exception is thrown is the Queue is empty
 *  .peek()           - return top element without removing it - return null if Queue is empty
 *  .element()        - same as peek, but throws and exception if Queue is empty
 *  .size()           - return the number of elements in the Queue
 *  .isEmpty()        - return true if Queue contains no elements
 *  .clear()          - remove all elements in the Queue
 * 
 **********************************************************************************/
	    // a Simple queue is implemented as a LinkedList
		Queue<String> myQueue = new LinkedList<>();

		myQueue.add("Frank");   // add to end of the queue
		myQueue.add("Daniel");  // add to end of the queue
		//myQueue.push("Potsey");   // Put at the start of Queue - NOT allowed when using Queue implementation
		                            //                             IS alllowed when using LinkedList implementation
		myQueue.add("Brian");
		myQueue.add("Mauli");
		myQueue.add("Petar");
		myQueue.add("Tom");
			
		itemNum = 0;
	
		for (String item : myQueue) {
			System.out.println("Item #" + itemNum++ + " in Queue: " + item);
			}
		System.out.println("--------------------------------------------");		
			
		System.out.println("\nNumber items in myQueue - .size(): " + myQueue.size());
		// 6

		System.out.println(" Getting Top of myQueue - .poll(): " + myQueue.poll()); // removeFirst
		// Frank

		System.out.println("Number items in myQueue - .size(): " + myQueue.size());
		// 5

		System.out.println("   Top Element on Queue - .peek(): " + myQueue.peek()); // first in line
		// Daniel

		System.out.println("Number items in myQueue - .size(): " + myQueue.size());
		// 5

		System.out.println(myQueue);
		//Do not use for loop
		//Use while loop or iterator

		while (!myQueue.isEmpty()) {
			// Take one off
			System.out.println(myQueue.poll());
		}
		System.out.println("--------------------------------------------");	
	}

}
