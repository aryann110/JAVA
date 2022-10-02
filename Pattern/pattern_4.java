package lec2;

import java.util.Scanner;

public class pattern_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int row=1;
		int star=n;
		int space=0;
		while(row<=n) {
			
			int j=1;
			while(j<=space) {
				System.out.print("  ");
				j++;
			}
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
			}
			row++;
			System.out.println();
			star--;
			space+=2;
	}
	}

}
