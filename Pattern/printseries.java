package pattern_practice;

import java.util.Scanner;

public class printseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner nc=new Scanner(System.in);
	        int t=nc.nextInt();
	        int b=nc.nextInt();
	        
	        
	        	int i=1;
	        	
	            while(i<=t) {
	            	int c=3*i+2;
	            	if(c%b==0) {
		            	t=t+1;
		            }else {
		            	System.out.println(c);
		            }
	            i++;
	            }
	           
	        }
	}


