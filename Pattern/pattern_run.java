package pattern_practice;

import java.util.Scanner;

public class pattern_run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		  int n = nc.nextInt(); 
        int star=1;
        int space=n-1;
        int row=1;
        while(row<=n&&n%2!=0){
            //space
            int i=1;
            while(i<=space){
                System.out.print(" ");
                i++;
            }//star
            int j=1;
            while(j<=star){
                System.out.print("*");
                j++;
            }if(row<=n/2) {
            	star+=2;
            	space--;
            }else {
            	star-=2;
            	space++;
            }
            row++;
            
            System.out.println();
        }
	}
}

