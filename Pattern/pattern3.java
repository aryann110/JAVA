package pattern_practice;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int rows=1;
		int star=n;
		while(rows<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			rows++;
			star--;
			System.out.println();
		}
	}

}
