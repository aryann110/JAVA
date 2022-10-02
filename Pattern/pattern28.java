package pattern_practice;

import java.util.Scanner;

public class pattern28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		
		int n=nc.nextInt();
		int row=1;
		int space=n-1;
		int star=1;
		int val=1;
		while(row<=n) {
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int j=1;
			int p=val;
			while(j<=star) {			
				System.out.print(p+" ");
				if(j<=star/2) {
					p++;
				}else {
					p--;
				}
				j++;
			}
			val++;
			row++;
			space--;
			star+=2;
			System.out.println();
	}

	}

}
