package lec3;

import java.util.Scanner;

public class pattern27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int row=1;
		int space=n-1;
		int val=1;
		int star=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			while(j<=star) {
				if(j<star/2) {
					System.out.print(val+" ");
					val++;
				}else {
					System.out.print(val+" ");
					val--;
				}j++;
				
				
			}
			
			row++;
			space--;
			star+=2;
			System.out.println();
	}

		
	}

}
