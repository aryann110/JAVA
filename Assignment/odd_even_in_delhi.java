package ASSIGNMENT_ques;

import java.util.Scanner;

public class odd_even_in_delhi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int t=nc.nextInt(); 
		while(t>0) {
			int a=nc.nextInt();
			int even=0;
			int odd=0;
			while(a>0) {
				int rem=a%10;
				if(rem%2==0) {
					even=even+rem;
				}else {
					odd=odd+rem;
				}a=a/10;
				
			}if(even%4==0 ||odd%3==0) {
				System.out.println("Yes");
			}else {
				System.out.println("No");
			}t--;
		}    
		
	}

}
