package leetcode;

import java.util.Scanner;

public class rotate_image {

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
		transpose(arr);
		rotate(arr);
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j]); 
			}
			System.out.println();
		}
		
	}
	public static void rotate(int[][]arr) {
		for (int i = 0; i < arr.length; i++) {
			Reverse(arr[i]);
		}
	}
public static void transpose(int[][]arr) {
	int a=arr.length;
	int b=arr[0].length;
	for (int i = 0; i < a; i++) {
		for (int j = i+1; j < b; j++) {
			int temp=arr[i][j];
			arr[i][j]=arr[j][i];
			arr[j][i]=temp;
		}
	}
	
}
public static void Reverse(int[] arr) {
	// TODO Auto-generated method stub
int i=0;
int j=arr.length-1;
	while (i < j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
	}
}

	

}
