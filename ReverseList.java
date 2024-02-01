
import java.util.*;

/**
 * Three methods for reversing a list
 */
public class ReverseList {
	
	/**
	 * Reverses a list by recursion
	 * 
	 * @param head  the head of a list
	 * @return      the head of the reversed list
	 */
	public static Node reverseListRec(Node head) {
		if (head == null || head.next == null) {
			return head;
		}
		
		Node newHead = reverseListRec(head.next);
		head.next.next = head;
		head.next = null;
		return newHead;
	}
	
	
	/**
	 * Reverses a list iteratively
	 * 
	 * @param head  the head of a list
	 * @return      the head of the reversed list
	 */
	public static Node reverseListIter(Node head) {
		Node prev = null;
		Node cur = head;
		while (cur != null) {
			Node next = cur.next;
			cur.next = prev;
			prev = cur;
			cur = next;
		}
		
		return prev;
	}
	
	
	/**
	 * Reverses a list using a stack
	 * 
	 * @param head  the head of a list
	 * @return      the head of the reversed list
	 */
	public static Node reverseListStack(Node head) {
		if (head == null) return null;
		
		Stack<Node> stack = new Stack<>();
		Node node = head;
		while (node != null) {
			stack.push(node);
			node = node.next;
		}
		
		Node newHead = stack.pop();
		node = newHead;
		while (!stack.isEmpty()) {
			node.next = stack.pop();
			node = node.next;
		}
		node.next = null;
		
		return newHead;
	}
	
	
	/**
	 * Test driver for the three methods
	 */
	public static void main(String[] args) {
		Node head = new Node(1);
		Node node = head;
		for (int i = 2; i <= 5; i++) {
			node.next = new Node(i);
			node = node.next;
		}
		
		printList(head);
		
		Node newHead = reverseListRec(head);
		printList(newHead);
		
		newHead = reverseListIter(newHead);
		printList(newHead);
		
		newHead = reverseListStack(newHead);
		printList(newHead);
	}
	
	public static void printList(Node head) {
		Node node = head;
		while (node != null) {
			System.out.print(node.val + "->");
			node = node.next;
		}
		System.out.println();
	}

}

class Node {
	int val;
	Node next;
	Node(int val) {
		this.val = val;
	}
}
