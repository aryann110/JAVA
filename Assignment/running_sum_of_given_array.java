package ASSIGNMENT_ques;

import java.util.Scanner;

public class running_sum_of_given_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=nc.nextInt();
        }
        int[]ans=runningsum(arr);
        for(int i=0;i<arr.length;i++) {
        	System.out.print(ans[i]+" ");
        }
        
        
	}
	public static int[] runningsum(int arr[]) {
		int[]ans=new int[arr.length];
		ans[0]=arr[0];
		for(int i=1;i<arr.length;i++) {
			
			ans[i]=arr[i]+ans[i-1];}
		
		return ans;
	}
}
