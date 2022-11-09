package twod_array;

import java.util.Scanner;

public class change_element_in_2d_matrix {

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
		rowchange(arr);
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[0].length; j++) {
//				System.out.print(arr[i][j]);
//			}
//			System.out.println();
//		}
		columnchange(arr);
	}
public static void rowchange(int[][]arr) {
	for (int i = 0; i < arr.length; i++) {
		for (int j = 0; j < arr[0].length; j++) {
			if(arr[i][j]==0) {
				System.out.print("0"+" ");
			}
		}
	}
}
public static void columnchange(int[][]arr) {
	for (int i = 0; i < arr[0].length; i++) {
		for (int j = 0; j < arr.length; j++) {
			if(arr[j][i]==0) {
				System.out.print("0"+" ");
			}
		}
	}
}
}
