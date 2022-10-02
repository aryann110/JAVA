package lec3;

import java.util.Scanner;

public class pattern13 {
// based on mirror concept
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mc=new Scanner(System.in);
		int n=mc.nextInt();
		int rows=1;
		int star=1;
		while(rows<=2*n-1) {
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
				if(rows<n) {
					star++;
				}else {
					star--;
				}
			rows++;
			System.out.println();
			}
	}

}
