package ASSIGNMENT_ques;
import java.util.Scanner;
public class rotatearray {

	 public static void main (String args[]) {
         Scanner nc=new Scanner(System.in);
         int n=nc.nextInt();
         int[] arr=new int[n];
         
         for(int i=0;i<arr.length;i++){
             arr[i]=nc.nextInt();
         }
         int k=nc.nextInt();
        rotatearray(arr,k);
        for(int i=0;i<arr.length;i++){
          System.out.println(arr[i]);;
        }
        
    }
    public static void reverse(int []arr,int i,int j){
        
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
     public static void rotatearray(int[]arr,int k) {
    	 int n=arr.length;
    	 k=k%n;
    	 reverse(arr,0,n-k-1);
    	 reverse(arr,n-k,n-1);
    	 reverse(arr,0,n-1);
    	 
     }
}
