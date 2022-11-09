package Strings_questions;

import java.util.Scanner;

public class difference_in_ascii_code {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		difference(str);
	}
public static void difference(String str) {
	int i=0;
	while(i<str.length()-1) {
		int a=str.charAt(i);
			int b=str.charAt(i+1);
			int c=b-a;
			System.out.print(""+str.charAt(i)+c);

			i++;
}
	System.out.print(str.charAt(str.length()-1));
}
}