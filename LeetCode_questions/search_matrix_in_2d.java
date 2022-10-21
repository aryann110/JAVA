package leetcode;

import java.util.Scanner;

public class search_matrix_in_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int m=nc.nextInt();
		int [][]arr=new int[n][m];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				arr[i][j]=nc.nextInt(); 
			}
		}
		int target=nc.nextInt(); 
		System.out.println(search_matrix(arr,target));
	}
public static boolean search_matrix(int[][]arr,int target) {
	int row=0;
	int col=arr[0].length-1;
	while(row<arr.length&& col>=0) {
	if(arr[row][col]==target) {
		return true;
	}
	else if(arr[row][col]>target) {
		col--;
	}else {
		row++;
	}
	}
	return false;
}
}
