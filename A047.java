package day6_12;

import java.util.Scanner;
import java.util.Stack;

public class A047 {
	public static void main(String args[]) {
		Scanner br =new Scanner(System.in);
		String x=br.nextLine();
		if(balancedParenthensies(x)) {
			System.out.println("The expression is balanced");
		}else {
			System.out.println("The expression is not balanced");
		}
    }
    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }    
}
