package twod_array;

import java.util.Scanner;

public class matrix_search {

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
			int item=nc.nextInt();
			System.out.println(search(arr,item));
	}
	public static int search(int[][]arr,int item) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				if(item==arr[i][j]) {
					return 1;
				}
			}
		}
		return 0;
	}
}
