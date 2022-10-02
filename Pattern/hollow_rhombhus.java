package pattern_practice;
import java.util.*;
public class hollow_rhombhus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 1;
        int star = n;
        int space = n-1;
        while (row <= n) {
            // this iteration prints spaces
            int s = 1;
            while (s<= space) { // 1,2,3,4
                System.out.print(" ");
                s++;
            }
            // then it prints stars
            int j = 1;
            if (row == 1 || row == n) {
                while (j <= n) {   //1<=5
                    System.out.print("*" + "");
                    j++;
                }
            } else {
                System.out.print("*");
                int i = 1;
                while (i <= n - 2) { // 1<=3, 2<=3, 3<=3, 4<=3
                    System.out.print(" ");
                    i++;
                }
                System.out.print("*");
            }
            row++;
            space--;
            System.out.println();
        }
	}

}
