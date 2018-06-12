package day6_12;

import java.util.Scanner;
import java.util.Stack;

public class A048 {
    public boolean isDuplicate(String str) {
       Stack<Character> stack = new Stack<Character>();
       for (int i = 0; i < str.length(); i++) {
           if (str.charAt(i) != ')') {
               stack.push(str.charAt(i));
           } else {
               if (stack.peek() == '(') {
                   return true;
               }
               while (stack.peek() != '(') {
                   stack.pop();
               }
               stack.pop();
           }
       }
       return false;
   }

    public static void main(String[] args) {
    	Scanner br=new Scanner(System.in);
    	String exp=br.nextLine();
    	A048 test = new A048();
    	if(test.isDuplicate(exp)) {
    		System.out.println("Duplicate Found");
    	}else {
    		System.out.println("No Duplicates Found");
    	}
   }
}
