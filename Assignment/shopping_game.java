package ASSIGNMENT_ques;

import java.util.Scanner;

public class shopping_game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		int t=nc.nextInt();
		while(t>0) {
		int m=nc.nextInt(); 
		int n=nc.nextInt();
		int a=0;
		int h=0;
		int count=1;
		while(true) {
			a=a+count;
			if(a>m) {
				System.out.println("Harshit");
				break;
			}count++;
			h=h+count;
			if(h>n) {
				System.out.println("Aayush");
				break;
			}count++;
		}t--;
		}
	}

}
