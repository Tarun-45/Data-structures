import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
		System.out.println("enter the size");
		int n=in.nextInt();
		int i;
	    System.out.println("enter the elements");
	
		int a[]=new int[n];
	
	     for(i=0;i<n;i++){
	         a[i]=in.nextInt();
	      }
	      if(n/2!=0){
	          System.out.println("median is " + a[n/2]);
	      }
	      else{
	          System.out.println("median is " + (a[n/2] +a[n+2/2])/2);
	      }
	      
	      
	}
}