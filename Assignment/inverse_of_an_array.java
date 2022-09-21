package ASSIGNMENT_ques;

import java.util.Scanner;

public class inverse_of_an_array {

	public static void main(String[] args) {
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int [] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=nc.nextInt(); 
		}
		int[] ans = inver(arr);
		display(ans);
	}
	public static void display(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}
	}
	public static int[] inver(int []arr) {
        int[]ans=new int[arr.length]; //creating new array
		  for (int i = 0; i < arr.length; i++) {
			  
	       //      arr[arr[i]] = i;  don't overwrite in the same array
           ans[arr[i]]=i;
	                
		
	}
    return ans;
	
}
}
