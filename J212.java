package day6_12;

public class J212 {
	public static void main(String[] args) {
		StringBuilder x=new StringBuilder();
		x.append("java cpp c# python");
		x.delete(0,5);
		System.out.println(x.toString());
	}
}
