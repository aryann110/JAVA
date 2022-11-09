package Strings_questions;

import java.util.Scanner;

public class odd_even_character {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		oddeven(str);
	}
public static void oddeven(String str) {
	String ans="";
	for (int i = 0; i <str.length(); i++) {
		char ch=str.charAt(i);
		if(i%2==0) {
			ans=ans+(char)(ch+1);
		}else {
			ans=ans+(char)(ch-1);
		}
	}
	System.out.print(ans);
}
}
