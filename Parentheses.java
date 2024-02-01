/**
 * @author Yan Zong Ding
 */

import java.util.*;

public class Parentheses {
	
	/**
	 * Decides whether a sequence of parentheses is balanced
	 * 
	 * Time Complexity: O(n), where n is the length of the input 
	 * 
	 * @param paren  a string
	 * @return       true if the sequence of parentheses in the input string is balanced,
	 * 				 false otherwise
	 */
	public static boolean isBalanced(String paren) {
		
		Stack<Character> stack = new Stack<>();
		
		for (int i = 0; i < paren.length(); i++) {
			char ch = paren.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			}
			else if (ch == ')'){
				if (stack.empty()) {
					return false;
				}
				else {
					stack.pop();
				}
			}
		}
		
		return stack.empty();
	}

	
	public static void main(String[] args) {
		String p = "(((a+b)*(c+d)))/((e-f))";
		System.out.println(isBalanced(p));
	}

}
