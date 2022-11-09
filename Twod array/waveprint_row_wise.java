package twod_array;
import java.util.*;
public class waveprint_row_wise {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner nc=new Scanner(System.in);
			int n=nc.nextInt();
			int m=nc.nextInt();
			int [][]arr=new int[n][m];
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[0].length; j++) {
					arr[i][j]=nc.nextInt(); 
				}
			}
	        printwave(arr);
	        
	    }
	    public static void printwave(int[][] arr) {
	        int count=arr.length*arr[0].length;
	        int a=0;
	        while(a<count){
			for (int row = 0; row < arr.length; row++) {
				if (row % 2 == 0) {
					for (int col = 0; col < arr[0].length&&a<count; col++) {
						System.out.print(arr[row][col] + ","+" ");
	                    a++;
					}
				} 
				else {
					for (int col = arr[0].length - 1; col >= 0&&a<count; col--) {
						System.out.print(arr[row][col] + ","+" ");
	                    a++;
					}
				}
	            if(a==count){
	                System.out.print("END");
	            }
			}
	        }
		}

}
