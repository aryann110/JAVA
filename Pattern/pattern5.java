package pattern_practice;

import java.util.Scanner;

public class pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mc=new Scanner(System.in);
		int n=mc.nextInt();
		int row=1;
		int space=0;
		int star=n;
		while(row<=n) {
			int j=1;
			while(j<=space) {
				System.out.print(" ");
				j++;
			}
			int i=1;
			while(i<=star) {
				System.out.print(i);
				i++;
			}
			
			row++;
			star--;
			space++;
			System.out.println();
		}
	}

}
