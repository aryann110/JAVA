package ASSIGNMENT_ques;

import java.util.Scanner;

public class series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
        int n=nc.nextInt(); 
        int a=nc.nextInt();
        int row=1;
        int c=0;
        
        while(row<=n) {
        	int i=1;
        	while(i<=row) {
        	c=3*i+2;
        	i++;
        	}
        	if(c%a==0) {
        		n=n+1;
        	}else {
        		System.out.println(c);
        		
        	}row++;
        	
        }
	}

}
