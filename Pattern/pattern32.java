package pattern_practice;

import java.util.Scanner;

public class pattern32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mc=new Scanner(System.in);
		int n=mc.nextInt();
		int rows=1;
		int star=1;
		int val=1;
		while(rows<=2*n-1) {
				int i=1;
				int p=val;
				while(i<=star) {
					if(i%2==0) {
						System.out.print("* ");
					}else {
						System.out.print(p+" ");
					}
					i++;
				}
				if(rows<n) {
					star+=2;
					val++;
				}else {
					star-=2;
					val--;
				}
			rows++;
			System.out.println();
			}
	}

}
