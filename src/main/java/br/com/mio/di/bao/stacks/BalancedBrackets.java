package br.com.mio.di.bao.stacks;

import java.util.Stack;

public class BalancedBrackets {
    
    public static boolean isBalanced(String expression) {
    	if (expression.length()  == 1 || (expression.length() % 2) != 0 ) {
    		return false;
    	}
    	Stack<Character> stack = new Stack<>();
		for (char value : expression.toCharArray()) {
			if (value == '(') {
				stack.push(')');
			} else if (value == '{') {
				stack.push('}');
			} else if (value == '[') {
				stack.push(']');
			} else {
				if (stack.empty() || value != stack.peek()) {
					return false;
				}
				stack.pop();
			}
		}
    	return stack.empty();
    }
  
    public static void main(String[] args) {

        String expression = "{[()]}";
        String expression2 = "{[(])}";
        String expression3 = "{{[[(())]]}}";
        System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        System.out.println( (isBalanced(expression2)) ? "YES" : "NO" );
        System.out.println( (isBalanced(expression3)) ? "YES" : "NO" );
    }
}
