package ASSIGNMENT_ques;

import java.util.Scanner;

public class pair_of_roses {

	 public static void main(String args[]) {
	        Scanner nc=new Scanner(System.in);
	        int t=nc.nextInt();
	        while(t>0){
	        int n=nc.nextInt();
	        int []arr=new int[n];
	        for(int i=0;i<arr.length;i++){
	            arr[i]=nc.nextInt();
	        }       
	        int item=nc.nextInt(); 
	         }
	      
	    }
	 public static void pairofroses(int[]arr,int item) {
		 int one=0;
		 int two=0;
		 int diff=0;
		 for(int i=0;i<arr.length;i++) {
			 int ab=arr[0];
			 for(int j=i+1;i<arr.length;j++) {
				 if(i+arr[j]==item) {
					 System.out.print(ab+arr[j]);
				 }
			 }
			 
		 }
	 }

}
