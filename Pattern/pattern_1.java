package lec2;
import java.util.Scanner;
public class pattern_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sb=new Scanner(System.in);
		int n=sb.nextInt();
		
		
		int row=1;
		int star=n;
		while(row<=n) {
			int i=1;
			while(i<=star) {
				System.out.print("* ");
				i++;
			}
			row++;
			System.out.println();
		}
	}

}
