package Strings_questions;
import java.util.*;
public class palindromic_substring {

	 public static void main(String args[]) {
	        // Your Code Here
	        Scanner nc=new Scanner(System.in);
	        String str=nc.next();
	        System.out.print(printSubString(str));
	    }
	    public static int printSubString(String str) {
	        int count=0;
			for (int i = 0; i < str.length(); i++) {
				for (int j = i + 1; j <= str.length(); j++) {
					String s = str.substring(i, j);
					if (ispalindrome(s) == true) {
						count++;
					}
				}

			}
	        return count;
		}

		public static boolean ispalindrome(String str) {
			int i = 0;
			int j = str.length() - 1;
			while (i < j) {
				if (str.charAt(i) != str.charAt(j)) {
					return false;
				}
				i++;
				j--;
			}
			return true;

		}

}
