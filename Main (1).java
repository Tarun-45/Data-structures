import java.util.Scanner;

public class Main
{
  public static void main(String args[])
  {
    int i, l, h,a[];
    int key,mid,n;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the size");
    n = in.nextInt();
    a = new int[n];
 
    System.out.println("Enter the values");
    for (i = 0; i < n; i++)
      a[i] = in.nextInt();

    System.out.println("Enter value of key");
    key = in.nextInt();
    l=0;
    h = n - 1;
    mid= (l+h)/2;
    while(l<=h)
    {
      if ( a[mid]<key)
        l= mid+1;    
      else if (a[mid]==key)
      {
        System.out.println(" found at location" +mid);
        break;
      }
      else
         h= mid- 1;
 
      mid= (h+l)/2;
   }
   if (l>h)
      System.out.println("key not found");
  }
}
