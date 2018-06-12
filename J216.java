package day6_12;

import java.util.Scanner;
import java.util.regex.Pattern;

public class J216 {
	public static void main(String[] args) {
		Scanner br=new Scanner(System.in);
		String x=br.nextLine();
		if(Pattern.matches("\\d+", x)) {
			System.out.println("输入的字符串是数字");
		}else {
			System.out.println("输入的字符串不是数字");
		}
	}
}
