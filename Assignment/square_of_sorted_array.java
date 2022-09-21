package ASSIGNMENT_ques;

import java.util.Scanner;

public class square_of_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nc.nextInt(); 
		}
		int []ans=square(arr);
		Sort(ans);
		for(int i=0;i<arr.length;i++) {
			System.out.print(ans[i]+" "); 
		}
	}
	public static void Sort(int[] arr) {
		// TODO Auto-generated method stub
		for (int i = 1; i < arr.length; i++) {
			int item = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > item) {
				arr[j + 1] = arr[j];
				j--;
			}
			j++;
			arr[j]=item;

		}

	}
	public static int[] square(int[]arr) {
		int[] ans=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			ans[i]=(int) Math.pow(arr[i], 2);
		}
		return ans;
	}
}
