package Strings_questions;

import java.util.Scanner;

public class can_you_read_this {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		read(str);
	}
public static void read(String str) {
	String ans="";
	ans=ans+str.charAt(0);
	for (int i = 1; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(ch>='A'&& ch<='Z') {
			System.out.println(ans);
			ans="";
			ans=ans+ch;
		}
		else {
			ans=ans+ch;
		}
	}
	System.out.println(ans);
}
}
