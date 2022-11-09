package Strings_questions;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		String str="abba";
		System.out.println(palindrome(str));
	}
	public static boolean palindrome(String str) {
		int i=0;
		int j=str.length()-1;
		while(i<j) {
			if(str.charAt(i)==str.charAt(j)) {
				return true;
			}
			i++;
			j--;
		}
		return false;
	}
}
