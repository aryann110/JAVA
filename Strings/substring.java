package Strings_questions;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="hello";
//System.out.println(str.substring());
printsubstring(str);
	}
public static void printsubstring(String str) {
	for (int i = 0; i < str.length(); i++) {
		for (int j = i+1; j <=str.length(); j++) {
			System.out.print(str.substring(i,j)+" ");
		}
		System.out.println();
	}
}
}
