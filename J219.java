package day6_12;

public class J219 {
	public static void main(String[] args) {
		String s=" java sdfkj ";
		System.out.println(mytrim(s));
	}
	public static String mytrim(String str){
		int start=0;
		int end=str.length()-1;
		while(str.charAt(start) ==' '){
		start++;
		}
		while(str.charAt(end)==' '){
		end--;
		}
		return str.substring(start,end+1);
		}
}
