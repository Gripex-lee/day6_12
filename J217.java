package day6_12;

public class J217 {
	public static void main(String[] args) {
		String s="I can because I think I can";
	      int a = s.lastIndexOf("can");  
	      if(a == - 1){  
	         System.out.println("没有找到字符串 can");  
	      }else{  
	         System.out.println(a);  
	      }
	}
}
