package pattern_practice;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner mc=new Scanner(System.in);
		int n=mc.nextInt();
		int rows=1;
		int star=1;
		while(rows<=n) {
				int i=1;
				while(i<=star) {
					System.out.print("* ");
					i++;
				}
			rows++;
			star++;
			System.out.println();
			}
		}
	}


