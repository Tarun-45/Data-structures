import java.util.Scanner;
public class Main

{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int n=in.nextInt();
		int i,key;
		int cou=0;
		
	    System.out.println("enter the elements");
	
		int a[]=new int[n];
	
	      for(i=0;i<n;i++){
	         a[i]=in.nextInt();
	      }
	     System.out.println("enter the key value");
	     key=in.nextInt();
	      for(i=0;i<n;i++){
	         if(a[i]==key){
	             cou++;
	         }
	     }
		System.out.println("frequency of key value is"+cou);
	}
}
