package ASSIGNMENT_ques;

import java.util.Scanner;

public class product_of_arraywithout_self {

	 public static void main (String args[]) {
	        Scanner nc=new Scanner(System.in);
	        int n=nc.nextInt();
	        int[]arr=new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=nc.nextInt();
	        }
	        int []ans=prodout_Array(arr);
	        for(int i=0;i<arr.length;i++){
	            System.out.print(ans[i]+" ");
	        }

	    }
	    public static int[] prodout_Array(int[] arr) {
	        int[]ans=new int[arr.length];
			int[] left = new int[arr.length];
			left[0] = 1;
			for (int i = 1; i < left.length; i++) {
				left[i] = left[i - 1] * arr[i - 1];
			}

			int[] right = new int[arr.length];
			int n = arr.length;
			right[n - 1] = 1;
			for (int i = n - 2; i >= 0; i--) {
				right[i] = right[i + 1] * arr[i + 1];

			}
			for (int i = 0; i < right.length; i++) {
				left[i] = left[i] * right[i];
			}
			return left;

		}
}
