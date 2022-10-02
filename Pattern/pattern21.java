package pattern_practice;
import java.util.Scanner;
public class pattern21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int row=1;
		int space=2*n-3;
		int star=1;
		while(row<=n) {
			int j=1;
			while(j<=star) {
				System.out.print("* ");
				j++;
			}
			int i=1;
			while(i<=space) {
				System.out.print("  ");
				i++;
			}
			int k=1;
			if(row==n) {
				k=2;
			}
			while(k<=star) {
				System.out.print("* ");
				k++;
			}
			
			row++;
			star++;
			space-=2;
			System.out.println();
		}
	}

}
