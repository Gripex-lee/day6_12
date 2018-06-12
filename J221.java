package day6_12;

public class J221 {
	public static void main(String[] args) {
		StringBuilder s=new StringBuilder();
		s.append("java cpp c# python");
		s.insert(12, "php");
		System.out.println(s.toString());
	}
}
