package Strings_questions;

import java.util.Scanner;

public class max_frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str=nc.next();
		max(str);
	}
public static void max(String str) {
	int []freq=new int[26];
	for (int i = 0; i < str.length(); i++) {
		char ch=str.charAt(i);
		freq[ch-97]=freq[ch-97]+1;
	}
	int max_i=0;
	for (int i = 1; i < freq.length; i++) {
		if(freq[i]>freq[max_i]) {
			max_i=i;
		}
	}
	char ch=(char)(97+max_i);
	System.out.println(ch);
}
}
