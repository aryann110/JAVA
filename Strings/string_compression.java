package Strings_questions;

import java.util.Scanner;

public class string_compression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		compress(str);
	}
public static void compress(String str) {
	char prev=str.charAt(0);
	int count=1;
	String ans="";
	for (int i = 1; i < str.length(); i++) {
		char ch=str.charAt(i);
		if(prev==ch) {
			count++;
		}
		else {
			if(count==1) {
				ans=ans+prev;
			}else {
			ans=ans+prev+count;
			}
			prev=ch;
			count=1;
		}
	}
	if(count==1) {
	ans=ans+str.charAt(str.length()-1);
	}else {
		ans=ans+str.charAt(str.length()-1)+count;
	}
	System.out.println(ans);
}
}
