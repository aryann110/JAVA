package ASSIGNMENT_ques;

import java.util.Scanner;
import java.util.stream.IntStream;

public class lower_upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner nc=new Scanner(System.in);
		char c = nc.next().charAt(0);
		int i=c;
	    if(i==97||i==98||i==99||i==100||i==101||i==102||i==103||i==104||i==105||i==106||i==107||i==108||i==109||i==110||i==111||i==112||i==113||i==114||i==115||i==116||i==117||i==118||i==119||i==120||i==121||i==122) {
	    	System.out.println("lowercase");
	    }else if(i==65||i==66||i==67||i==68||i==69||i==70||i==71||i==72||i==73||i==74||i==75||i==76||i==77||i==78||i==79||i==80||i==81||i==82||i==83||i==84||i==85||i==86||i==87||i==88||i==89||i==90) {
	    	System.out.println("UPPERCASE");
	    }else {
	    	System.out.println("invalid");
	    }
	}

}
