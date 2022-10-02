package pattern_practice;

import java.util.Scanner;

public class pattern24 {

	public static void main(String[] args) {
		
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int num=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print(" ");
				i++;
			}
			int j=1;
			while(j<=star) {
				System.out.print(num);
				j++;
			}
			num++;
			row++;
			space--;
			star+=2;
			System.out.println();
	}

}}
