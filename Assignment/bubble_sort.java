package ASSIGNMENT_ques;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int []arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nc.nextInt(); 
		}
		SortOpti(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
		// TODO Auto-generated method stub
		public static void SortOpti(int[] arr) {
	         
			for (int trun = 1; trun < arr.length; trun++) {// n-1 time
			      boolean flag=false;
				for (int i = 0; i < arr.length - trun; i++) {
					if (arr[i] > arr[i + 1]) {
						int temp = arr[i];
						arr[i] = arr[i + 1];
						arr[i + 1] = temp;
						flag=true;
					}

				}
				
				if(flag==false) {
					break;
				}

			}

		}
	

}
