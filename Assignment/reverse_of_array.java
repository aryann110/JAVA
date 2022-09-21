package ASSIGNMENT_ques;

import java.util.Scanner;

public class reverse_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nc.nextInt(); 
		}
		reversed(arr);
		
		display(arr);
	}
	public static void display(int[]arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static void reversed(int[]arr) {
		int i = 0;
		int j = arr.length - 1;
		while(i<j) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
		}
	}
}
