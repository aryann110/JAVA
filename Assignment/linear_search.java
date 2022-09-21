package ASSIGNMENT_ques;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		
			int[]arr = new int[n];
			for(int i=0;i<arr.length;i++) {
				arr[i]=nc.nextInt(); 
			}
			int item=nc.nextInt();
			System.out.println(linearSearch(arr,item));
		
	}
	public static int linearSearch(int[] arr,int item) {
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==item) {
				return i;
				
			}
		}
		return -1;
	}
}
