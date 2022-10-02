package pattern_practice;
import java.util.Scanner;
public class pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int n=nc.nextInt();
		int rows=1;
		int val=n;
		while(rows<=n) {
			int i=1;
			int p=val;
			while(i<=n) {
				if(p==rows) {
					System.out.print("* ");
				}else {
					System.out.print(p+" ");
				}
				p--;
				i++;
			}
			rows++;
			System.out.println();
		}
	}

}
