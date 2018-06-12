package day6_12;

import java.util.Scanner;

class Nodes{
    String key;
    Nodes left, right;
    Nodes(String key){
        this.key = key;
        left = right = null;
    }
};

public class A051{
    private static final String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static void print(Nodes Nodess) {
        if (Nodess == null)
            return;
        if (Nodess.left == null && Nodess.right == null) {
            System.out.println(Nodess.key);
        }
        else{
            print(Nodess.right);
            print(Nodess.left);
        }
    }
    public static void construct(Nodes root, int[] digit, int i){
        if (root == null || i == digit.length) {
            return;
        }
        if (i + 1 < digit.length){
            int sum = 10 * digit[i] + digit[i + 1];
            if (sum <= 26) {
                root.left = new Nodes(root.key + alphabet.charAt(sum - 1));
            }
            construct(root.left, digit, i + 2);
        }
        root.right = new Nodes(root.key + alphabet.charAt(digit[i] - 1));
        construct(root.right, digit, i + 1);
    }
    public static void main(String[] args){
    	Scanner br = new Scanner(System.in);
		int[] b = new int[4];
		for(int i=0;i<b.length;i++) {
			b[i]=br.nextInt();
		}
        Nodes root = new Nodes("");
        construct(root,b,0);
        print(root);
    }
}
