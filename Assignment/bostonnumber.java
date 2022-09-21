package ASSIGNMENT_ques;

import java.util.Scanner;

public class bostonnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		long n=nc.nextLong();
		long sum=0;
		long fact=0;
		while(n!=0) {//for calculating sum
			long rem=n%10;
			sum+=rem;
			n=n/10;
		}System.out.println(sum);
		while(n!=0) {
			long i=2;
			if(n%i==0) {
				long k=2;
				while(i!=0) {
					if(i%k==0) {
						
					}else {
						fact+=i;
					}k++;
				}i++;
			}
		}System.out.println(fact);
	}

}
