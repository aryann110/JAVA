package Strings_questions;

import java.util.Scanner;

public class toggle_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		toggle(str);
	}
public static void toggle(String str) {
	String ans="";
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='A'&&ch<='Z') {
			ans=ans+(char)(ch+32);
		}
		else {
			ans=ans +(char)(ch- 32);
		}
	}
	System.out.print(ans);
}
}
