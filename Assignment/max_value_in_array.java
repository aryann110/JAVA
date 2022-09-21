package ASSIGNMENT_ques;

import java.util.Scanner;

public class max_value_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nc.nextInt();
		}
		System.out.println(maxvalue(arr));
	}
public static int maxvalue(int[] arr) {
	int max=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>arr[ max]) {
			max=i;
		}
	}return arr[max];
}
}
