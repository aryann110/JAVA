package lec3;

import java.util.Scanner;

public class pattern19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int row=1;
		int star=n/2+1;
		int space =-1;
		while(row<=n) {
			//star
			int i=1;
			while(i<=star) {
				System.out.print("*  ");
				i++;
			}
			//space
			int k=1;
			while(k<=space) {
				System.out.print("   ");
				k++;
			}
			//star
			int j=1;
			if(row==1 || row==n){
				j=2;
			}
			while(j<=star) {
				System.out.print("*  ");
				j++;
			}
			if(row<n/2+1) {
				star--;
				space+=2;
			}else {
				star++;
				space-=2;
			}
			row++;
			System.out.println();
		}
	}

}
