package sorting;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner nc=new Scanner(System.in);
			int n=nc.nextInt();
			int []arr= {2,3,5,7,8,9,11,12,13,14,15,18};
			int item=7;
			System.out.println(search(arr,item));
	}
public static int search(int[]arr,int item) {
	int lo=0;
	int hi=arr.length-1;
	while(lo<=hi) {
		int mid=(lo+hi)/2;
		if(arr[mid]==item) {
			return mid;
		}
		else if(arr[mid]>item) {
			hi=mid-1;
		}else {
			lo=mid+1;
		}
	}
	return -1;
}
}
