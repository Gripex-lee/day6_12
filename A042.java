package day6_12;

import java.util.Scanner;

class Rearrange{
    // Utility function to swap two elements A[i] and A[j] in the array
    private static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    // Function to rearrange the array such that every second element
    // of the array is greater than its left and right elements
    public static void rearrangeArray(int[] A){
        // start from second element and increment index
        // by 2 for each iteration of loop
        for (int i = 1; i < A.length; i += 2){
            // If the prev element is greater than current element,
            // swap the elements
            if (A[i - 1] > A[i]) {
                swap(A, i - 1, i);
            }
            // if next element is greater than current element,
            // swap the elements
            if (i + 1 < A.length && A[i + 1] > A[i]) {
                swap(A, i + 1, i);
            }
        }
    }
}
    // main function
public class A042{
    public static void main (String[] args){
    	Scanner br=new Scanner(System.in);
    	int []A=new int[5];
    	for(int i=0;i<A.length;i++) {
    		A[i]=br.nextInt();
    	}
    	br.close();
        Rearrange x=new Rearrange();
        x.rearrangeArray(A);
        // print output array
        for(int i=0;i<A.length;i++) {
        	System.out.print(A[i]+" ");
        }
    }
}
