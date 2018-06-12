package day6_12;

import java.util.Scanner;

public class J215 {
	public static void main(String[] args) {
		User a=new User("zhangsan","dasdf");
		Scanner br=new Scanner(System.in);
		String x=br.nextLine();
		System.out.println(x.equals(a.getName()));
	}
}
class User{
	String name;
	String password;
	public User(String n,String p) {
		this.name=n;
		this.password=p;
	}
	String getName() {
		return name;
	}
}